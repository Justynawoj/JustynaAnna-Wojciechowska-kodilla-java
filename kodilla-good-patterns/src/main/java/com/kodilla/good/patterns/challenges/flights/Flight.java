package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.Objects;

public class Flight {

    private String name;

    private ArrayList<String> destinations = new ArrayList<>();

    public Flight(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getDestinations() {
        return destinations;
    }

    public void addDestination(String destination){
        destinations.add(destination);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(name, flight.name) &&
                Objects.equals(destinations, flight.destinations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, destinations);
    }
}
