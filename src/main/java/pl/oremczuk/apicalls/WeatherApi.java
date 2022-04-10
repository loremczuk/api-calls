package pl.oremczuk.apicalls;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class WeatherApi {

    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://weatherapi-com.p.rapidapi.com/forecast.json?q=Lublin&days=1"))
            .header("X-RapidAPI-Host", "weatherapi-com.p.rapidapi.com")
            .header("X-RapidAPI-Key", "SIGN_UP_FOR_KEY")
            .method("GET", HttpRequest.BodyPublishers.noBody())
            .build();

    public void showWeatherForecast() throws IOException, InterruptedException {
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }


}
