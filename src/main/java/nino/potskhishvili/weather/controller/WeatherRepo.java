package nino.potskhishvili.weather.controller;

import nino.potskhishvili.weather.model.Weather;

import java.util.ArrayList;
import java.util.List;

public class WeatherRepo {

    public static List<Weather> getWeather() {
        List<Weather> weather = new ArrayList<>();
        weather.add(new Weather("Tbilisi", 20, 15,70,"East",20));
        weather.add(new Weather("Kutaisi", 22, 12,71,"East",20));
        weather.add(new Weather("Batumi", 25, 11,72,"West",20));

        return weather;
    }

}
