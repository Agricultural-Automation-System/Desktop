package API;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import pnotification.Notification;
import agricultural.automation.system.MainF;
import java.awt.*;
import java.awt.TrayIcon.MessageType;


// retreive weather data from API - this backend logic will fetch the latest weather
// data from the external API and return it. The GUI will
// display this data to the user
public class APIFetcher {

    private static String idAuth;
    private static double latitude;
    private static double longitude;
    public static int[][] dataGrid;

    // fetch weather data for given location
    public static JSONObject getWeatherData() {

        // build API request URL with location coordinates
        String urlString = "https://api.open-meteo.com/v1/forecast?latitude=" + latitude + "&longitude=" + longitude +
                "&hourly=temperature_2m,relative_humidity_2m,weather_code,wind_speed_10m,wind_direction_10m&timezone=Africa%2FCairo&forecast_days=14";
        try {
            // call api and get response
            HttpURLConnection conn = fetchApiResponse(urlString);

            // check for response status
            // 200 - means that the connection was a success

            if (conn.getResponseCode() != 200) {
                System.out.println("Error: Could not connect to API");
                return null;
            }

            // store resulting json data
            StringBuilder resultJson = new StringBuilder();
            Scanner scanner = new Scanner(conn.getInputStream());
            while (scanner.hasNext()) {
                // read and store into the string builder
                resultJson.append(scanner.nextLine());
            }

            // close scanner
            scanner.close();

            // close url connection
            conn.disconnect();

            // parse through our data
            JSONParser parser = new JSONParser();
            JSONObject resultJsonObj = (JSONObject) parser.parse(String.valueOf(resultJson));

            // retrieve hourly data
            JSONObject hourly = (JSONObject) resultJsonObj.get("hourly");

            // we want to get the current hour's data
            // so we need to get the index of our current hour
            JSONArray time = (JSONArray) hourly.get("time");
            int index = findIndexOfCurrentTime(time);

            // get temperature
            JSONArray temperatureData = (JSONArray) hourly.get("temperature_2m");
            double temperature = (double) temperatureData.get(index);

            // get weather code
            JSONArray weathercode = (JSONArray) hourly.get("weather_code");
            String weatherCondition = convertWeatherCode((long) weathercode.get(index));

            // get humidity
            JSONArray relativeHumidity = (JSONArray) hourly.get("relative_humidity_2m");
            long humidity = (long) relativeHumidity.get(index);

            // get windspeed
            JSONArray windspeedData = (JSONArray) hourly.get("wind_speed_10m");
            double windspeed = (double) windspeedData.get(index);

            // get windspeed
            JSONArray winddirectionData = (JSONArray) hourly.get("wind_direction_10m");
            long winddirection = (long) winddirectionData.get(index);

            // build the weather json data object that we are going to access in our
            // frontend
            JSONObject weatherData = new JSONObject();
            weatherData.put("temperature", temperature);
            weatherData.put("weather_condition", weatherCondition);
            weatherData.put("humidity", humidity);
            weatherData.put("windspeed", windspeed);
            weatherData.put("winddirection", winddirection);

            return weatherData;
        } catch (Exception e) {
            // e.printStackTrace();
        }

        return null;
    }

    // retrieves geographic coordinates for given location name

    private static HttpURLConnection fetchApiResponse(String urlString) {
        try {
            // attempt to create connection
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            // set request method to get
            conn.setRequestMethod("GET");

            // connect to our API
            conn.connect();
            return conn;
        } catch (IOException e) {
            //JOptionPane.showMessageDialog(null, "your conectin has a problem");
            
            
           
                Notification panel = new Notification(MainF.me, Notification.Type.WARNING, Notification.Location.CENTER, "your conectin has a problem");
                panel.showNotification();
            
        }

        // could not make connection
        return null;
    }

    private static int findIndexOfCurrentTime(JSONArray timeList) {
        String currentTime = getCurrentTime();

        // iterate through the time list and see which one matches our current time
        for (int i = 0; i < timeList.size(); i++) {
            String time = (String) timeList.get(i);
            if (time.equalsIgnoreCase(currentTime)) {
                // return the index
                return i;
            }
        }

        return 0;
    }

    private static String getCurrentTime() {
        // get current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();

        // format date to be 2023-09-02T00:00 (this is how is is read in the API)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH':00'");

        // format and print the current date and time
        String formattedDateTime = currentDateTime.format(formatter);

        return formattedDateTime;
    }

    // convert the weather code to something more readable
    private static String convertWeatherCode(long weathercode) {
        String weatherCondition = "";
        if (weathercode == 0L) {
            // clear
            weatherCondition = "Clear";
        } else if (weathercode > 0L && weathercode <= 3L) {
            // cloudy
            weatherCondition = "Cloudy";
        } else if ((weathercode >= 51L && weathercode <= 67L)
                || (weathercode >= 80L && weathercode <= 99L)) {
            // rain
            weatherCondition = "Rain";
        } else if (weathercode >= 71L && weathercode <= 77L) {
            // snow
            weatherCondition = "Snow";
        }

        return weatherCondition;
    }

    // send the user name and pass to return id Authentication
    public static boolean Authentication(String usernameIn, String passwordIn) {

        if (usernameIn.equals("farmer") && passwordIn.equals("farmer")) {
            idAuth = "f0000";
            latitude = 24.1292617;
            longitude = 32.8991424;
            return true;
        } else if (usernameIn.equals("owner") && passwordIn.equals("owner")) {
            idAuth = "o0000";
            latitude = 24.1292617;
            longitude = 32.8991424;
            return true;
        }

        return false;

    }

    public static boolean isFarmer() {
        return idAuth.charAt(0) == 'f';
    }

    // get water flo data from the API server
    public static List<Integer> getWaterFLowData() {
        List<Integer> scores = new ArrayList<Integer>();
        for (int i = 0; i < 30; i++) {
            scores.add((int) (Math.random() * 30));
        }
        return scores;
    }

    public static int getCurrentWaterFlow() {

        return (int) (Math.random() * 30);
    }

    public static int getBattary() {
        
try{
    //Obtain only one instance of the SystemTray object
    SystemTray tray = SystemTray.getSystemTray();

    // If you want to create an icon in the system tray to preview
    Image image = Toolkit.getDefaultToolkit().createImage("some-icon.png");
    //Alternative (if the icon is on the classpath):
    //Image image = Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png"));

    TrayIcon trayIcon = new TrayIcon(image, "Java AWT Tray Demo");
    //Let the system resize the image if needed
    trayIcon.setImageAutoSize(true);
    //Set tooltip text for the tray icon
    trayIcon.setToolTip("System tray icon demo");
    tray.add(trayIcon);

    // Display info notification:
    trayIcon.displayMessage("Hello, World", "Java Notification Demo", MessageType.INFO);
    // Error:
    // trayIcon.displayMessage("Hello, World", "Java Notification Demo", MessageType.ERROR);
    // Warning:
    // trayIcon.displayMessage("Hello, World", "Java Notification Demo", MessageType.WARNING);
}catch(Exception ex){
    System.err.print(ex);
}
        return (int) (Math.random() * 100);
    }

    public static int[][] getDataGrid(int index, int indexSubMenu) {

        int[][] data = new int[300][720];
        // return from API
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                data[i][j] = (int) (Math.random() * 14);
            }

        }

        dataGrid = data;
        return data;
    }
    public static int[][] getDataGrid(String cropType) {

        int[][] data = new int[300][720];
        // return from API
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                data[i][j] = (int) (Math.random() * 14);
            }

        }

        dataGrid = data;
        return data;
    }
}
