package agricultural.automation.system;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import okhttp3.*;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class AgriculturalAutomationSystem {
    

      
        
    private static HttpURLConnection fetchApiResponse(String urlString) {
        try {
            // attempt to create connection
            URL url ;
            url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            // set request method to get
            conn.setRequestMethod("GET");

            // connect to our API
            conn.connect();
            return conn;
        } catch (IOException e) {
        }

        // could not make connection
        return null;
    }

    public static void main(String[] args) throws Exception {

  String urlString = "https://api.openweathermap.org/data/2.5/forecast?lat=24.128841&lon=32.899119&appid=ac17ac2d45229dfb2be5e7ef1410a8d3";

      
            // call api and get response
            HttpURLConnection conn ;
            conn = fetchApiResponse(urlString);
            // check for response status
            // 200 - means that the connection was a success
            if (conn.getResponseCode() != 200) {
                System.out.println("Error: Could not connect to API");
               
            }
            
             // store resulting json data
            
            Scanner scanner = new Scanner(conn.getInputStream());
            while(scanner.hasNext()){
                // read and store into the string builder
                System.out.println(scanner.nextLine());
            }
         
    }

}
