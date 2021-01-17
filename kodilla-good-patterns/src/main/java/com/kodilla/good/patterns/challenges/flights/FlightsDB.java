package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;

public class FlightsDB {


    private List<Flight> flightList = new ArrayList<>();

    public void addFlight(Flight flight) {
            flightList.add(flight);
    }

    public List<Flight> getFlightList() {
        return flightList;
    }
}
