package nino.potskhishvili.weather.controller;

import nino.potskhishvili.weather.model.Weather;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import static nino.potskhishvili.weather.controller.WeatherRepo.getWeather;

@Path("/weather")
public class WeatherService {


    @GET
    @Path("/weather")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Weather> weatherInfo(){
        return getWeather(); //
    }

    @POST
    @Path("/weather/{cityname}")
    @Produces(MediaType.APPLICATION_JSON)
    public Weather cityInfo(@PathParam("cityname") String cityName){
        Weather answer = null;
        for (Weather weather : getWeather()) {
            if (weather.getCityName().equals(cityName)){
                answer= weather;
            }
        }
        return answer;
    }





}
