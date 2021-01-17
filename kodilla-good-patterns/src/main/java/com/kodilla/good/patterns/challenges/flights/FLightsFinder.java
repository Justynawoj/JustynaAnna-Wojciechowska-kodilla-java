package com.kodilla.good.patterns.challenges.flights;

import java.util.*;
import java.util.stream.Collectors;

public class FLightsFinder {

    FlightsDB flightsDB;

    public FLightsFinder(FlightsDB flightsDB) {
        this.flightsDB = flightsDB;
    }

    public List<String> getDeparturesFromGivenCity(String cityFrom) {
        return flightsDB.getFlightList().stream()
                .filter(flight -> flight.getName().equals(cityFrom))
                .map(Flight::getDestinations)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    public List<String> getArrivalsToGivenCity(String cityTo) {
        return flightsDB.getFlightList().stream()
                .filter(flight -> flight.getDestinations().contains(cityTo))
                .map(Flight::getName)
                .collect(Collectors.toList());
    }

    public List<String> findFlightWithChange(String cityFrom, String cityTo) {
        List<String> departuresFromGivenCity = getDeparturesFromGivenCity(cityFrom);
        List<String> arrivalsToGivenCity = getArrivalsToGivenCity(cityTo);

        List<String> changeAirport = arrivalsToGivenCity.stream()
                .filter(departuresFromGivenCity::contains)
                .collect(Collectors.toList());
        if(changeAirport.size()==0){
            System.out.println("There is no such connection");

        } else {
            System.out.println("To reach your destination please select one of following destinations: ");
            System.out.println(changeAirport);
        }
        return changeAirport;
    }
}
