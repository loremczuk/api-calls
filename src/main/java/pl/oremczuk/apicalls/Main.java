package pl.oremczuk.apicalls;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        CovidStatsApi covidStatsApi = new CovidStatsApi();
        GoogleTranslateApi googleTranslateApi = new GoogleTranslateApi();
        WeatherApi weatherApi = new WeatherApi();

        try {
            covidStatsApi.showCovidStats();
            googleTranslateApi.showGoogleTranslation();
            weatherApi.showWeatherForecast();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }




    }
}
