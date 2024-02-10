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

            new loading();
         
    }

}
