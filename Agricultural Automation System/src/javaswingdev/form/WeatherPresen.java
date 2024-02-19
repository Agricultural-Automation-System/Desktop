package javaswingdev.form;

//import javaswingdev.menu.EventMenuSelected;
import org.json.simple.JSONObject;
import API.APIFetcher;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class WeatherPresen extends javax.swing.JPanel {
    private JSONObject weatherData;

    public WeatherPresen() {

        initComponents();
        setMyCompo();

    }

    private ImageIcon loadImage(String resourcePath) {
        try {
            // read the image file from the path given
            BufferedImage image = ImageIO.read(new File(resourcePath));

            // returns an image icon so that our component can render it
            return new ImageIcon(image);
        } catch (IOException e) {
           System.out.println(e.toString());
        }

        // System.out.println("Could not find resource");
        return null;
    }

    public void setMyCompo() {

        JLabel weatherConditionImage = new JLabel(loadImage("src/Image/cloudy.png"));
        weatherConditionImage.setBounds(0, 125 / 2, 450 / 2, 217 / 2);
        add(weatherConditionImage);

        // temperature text
        JLabel temperatureText = new JLabel("10 C");
        temperatureText.setBounds(0, 350 / 2, 450 / 2, 54 / 2);
        temperatureText.setFont(new Font("Dialog", Font.BOLD, 48 / 2));

        // center the text
        temperatureText.setHorizontalAlignment(SwingConstants.CENTER);
        add(temperatureText);

        // weather condition description
        JLabel weatherConditionDesc = new JLabel("Cloudy");
        weatherConditionDesc.setBounds(0, 405 / 2, 450 / 2, 36 / 2);
        weatherConditionDesc.setFont(new Font("Dialog", Font.PLAIN, 32 / 2));
        weatherConditionDesc.setHorizontalAlignment(SwingConstants.CENTER);
        add(weatherConditionDesc);

        // humidity image
        JLabel humidityImage = new JLabel(loadImage("src/Image/humidity.png"));
        humidityImage.setBounds(15 / 2, 500 / 2, 74 / 2, 66 / 2);
        add(humidityImage);

        // humidity text
        JLabel humidityText = new JLabel("<html><b>Humidity</b> 100%</html>");
        humidityText.setBounds(90 / 2, 500 / 2, 85 / 2, 55 / 2);
        humidityText.setFont(new Font("Dialog", Font.PLAIN, 16 / 2));
        add(humidityText);

        // windspeed image
        JLabel windspeedImage = new JLabel(loadImage("src/Image/windspeed.png"));
        windspeedImage.setBounds(220 / 2, 500 / 2, 74 / 2, 66 / 2);
        add(windspeedImage);

        // windspeed text
        JLabel windspeedText = new JLabel("<html><b>Windspeed</b> 15km/h</html>");
        windspeedText.setBounds(310 / 2, 500 / 2, 85 / 2, 55 / 2);
        windspeedText.setFont(new Font("Dialog", Font.PLAIN, 16 / 2));
        add(windspeedText);

        weatherData = APIFetcher.getWeatherData();
        // update gui

        // update weather image
        String weatherCondition = (String) weatherData.get("weather_condition");

        // depending on the condition, we will update the weather image that corresponds
        // with the condition
        switch (weatherCondition) {
            case "Clear":
                weatherConditionImage.setIcon(loadImage("src/Image/clear.png"));
                break;
            case "Cloudy":
                weatherConditionImage.setIcon(loadImage("src/Image/cloudy.png"));
                break;
            case "Rain":
                weatherConditionImage.setIcon(loadImage("src/Image/rain.png"));
                break;
            case "Snow":
                weatherConditionImage.setIcon(loadImage("src/Image/snow.pngImage"));
                break;
        }

        // update temperature text
        double temperature = (double) weatherData.get("temperature");
        temperatureText.setText(temperature + " C");

        // update weather condition text
        weatherConditionDesc.setText(weatherCondition);

        // update humidity text
        long humidity = (long) weatherData.get("humidity");
        humidityText.setText("<html><b>Humidity</b> " + humidity + "%</html>");

        // update windspeed text
        double windspeed = (double) weatherData.get("windspeed");
        windspeedText.setText("<html><b>Windspeed</b> " + windspeed + "km/h</html>");

        // update winddirection image
        long winddirection = (long) weatherData.get("winddirection");
       // System.out.println(winddirection);
        windspeedImage.setIcon(rotate(3.14 / 2 + winddirection * 3.14 / 180));

    }

    public static ImageIcon rotate(double angle) {
        try {
            // read the image file from the path given
            String resourcePath = "src/Image/windspeed.png";
            BufferedImage image = ImageIO.read(new File(resourcePath));

            double sin = Math.abs(Math.sin(angle)), cos = Math.abs(Math.cos(angle));
            int w = image.getWidth(), h = image.getHeight();
            int neww = (int) Math.floor(w * cos + h * sin), newh = (int) Math.floor(h * cos + w * sin);
            GraphicsConfiguration gc = getDefaultConfiguration();
            BufferedImage result = gc.createCompatibleImage(neww, newh, Transparency.TRANSLUCENT);
            Graphics2D g = result.createGraphics();
            g.translate((neww - w) / 2, (newh - h) / 2);
            g.rotate(angle, w / 2, h / 2);
            g.drawRenderedImage(image, null);
            g.dispose();

            // returns an image icon so that our component can render it
            return new ImageIcon(result);

        } catch (IOException e) {
            System.out.println(e.toString());
        }

        return null;

    }

    private static GraphicsConfiguration getDefaultConfiguration() {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice gd = ge.getDefaultScreenDevice();
        return gd.getDefaultConfiguration();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 225, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 325, Short.MAX_VALUE));
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
