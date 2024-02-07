package agricultural.automation.system;

import java.io.*;
import okhttp3.*;

public class AgriculturalAutomationSystem {

  public static void main(String[] args) throws IOException {

    // loading mLoading = new loading();

    OkHttpClient client = new OkHttpClient()
        .newBuilder()
        .build();
    MediaType mediaType = MediaType.parse("text/plain");
    RequestBody body = RequestBody.create(mediaType, "");
    Request request = new Request.Builder()
        .url(
            "api.openweathermap.org/data/2.5/forecast?lat=24.128841&lon=32.899119&appid=ac17ac2d45229dfb2be5e7ef1410a8d3")
        .method("GET", body)
        .build();
    Response response = client.newCall(request).execute();

    // System.out.println(response.toString());

  }

}
