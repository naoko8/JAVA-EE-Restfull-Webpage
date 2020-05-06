package nino.potskhishvili.weather.controller;

public class Request {
    private String city;

    public Request(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Request{" +
                "city='" + city + '\'' +
                '}';
    }
}
