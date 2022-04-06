package pl.oremczuk.apicalls;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class GoogleTranslateApi {

    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://google-translate1.p.rapidapi.com/language/translate/v2"))
            .header("content-type", "application/x-www-form-urlencoded")
            .header("Accept-Encoding", "application/gzip")
            .header("X-RapidAPI-Host", "google-translate1.p.rapidapi.com")
            .header("X-RapidAPI-Key", "dc1635070fmsh3d333e12439d6f3p1a02e6jsne30b1c8bde83")
            .method("POST", HttpRequest.BodyPublishers.ofString("source=en&target=pl&q=Learning%20in%20progress"))
            .build();

    public void showGoogleTranslation() throws IOException, InterruptedException {
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }

}
