package pl.oremczuk.apicalls;

import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CovidStatsApi {

    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://covid-19-statistics.p.rapidapi.com/reports/total?date=2020-04-07"))
            .header("X-RapidAPI-Host", "covid-19-statistics.p.rapidapi.com")
            .header("X-RapidAPI-Key", "SIGN_UP_FOR_KEY")
            .method("GET", HttpRequest.BodyPublishers.noBody())
            .build();

    public void showCovidStats() throws IOException, InterruptedException {
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }

}




