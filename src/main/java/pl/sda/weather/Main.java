package pl.sda.weather;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        Location location = new Location("Poznan", "Poland");
        Request request = new Request("City", "Poznan, Poland");

        Weather weather = new Weather(23.23, "Poznan", request, location);
        System.out.println(weather.getTemperature());
        weather.setTemperature(34.33);
        System.out.println(weather.getTemperature());

        mapper.writeValue(new File("data.json"), weather);


        Weather readWeather = mapper.readValue(new File("data.json"),
                Weather.class);
        System.out.println(readWeather.getCity());


    }

}

/*        Book book = new Book("Coben","Prawo", "trzysta");    zrobić w domu jako zadanie domowe
        System.out.println(book.getAuthor());
        book.setAuthor("Coben");
        System.out.println(book.getAuthor());

        Book readBook = mapper.readValue(new File("book.jsaon"), Book.class);*/
