package com.weatherapp.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    private final String API_KEY =
            "YOUR_OPENWEATHER_API_KEY";

    public String getWeather(String city) {

        String url =
                "https://api.openweathermap.org/data/2.5/weather?q="
                        + city
                        + "&appid="
                        + API_KEY
                        + "&units=metric";

        RestTemplate restTemplate =
                new RestTemplate();

        return restTemplate.getForObject(
                url,
                String.class
        );
    }
}
