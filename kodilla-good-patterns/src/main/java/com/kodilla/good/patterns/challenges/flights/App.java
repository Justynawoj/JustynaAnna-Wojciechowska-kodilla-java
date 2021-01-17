package com.kodilla.good.patterns.challenges.flights;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {


        Flight flight1 = new Flight("WRO");
        Flight flight2 = new Flight("KAT");
        Flight flight3 = new Flight("KRK");
        Flight flight4 = new Flight("WRW");
        Flight flight5 = new Flight("GDN");
        Flight flight6 = new Flight("PZN");

        flight1.addDestination("KRK");
        flight1.addDestination("WRW");
        flight1.addDestination("PZN");

        flight2.addDestination("WRO");
        flight2.addDestination("LBN");
        flight2.addDestination("GDN");

        flight3.addDestination("PZN");
        flight3.addDestination("WRO");
        flight3.addDestination("KAT");

        FlightsDB db = new FlightsDB();

        db.addFlight(flight1);
        db.addFlight(flight2);
        db.addFlight(flight3);

        FLightsFinder FlightsFinder = new FLightsFinder(db);

        FlightsFinder.getArrivalsToGivenCity("WRO");
        FlightsFinder.getDeparturesFromGivenCity("WRO");
        FlightsFinder.findFlightWithChange("WRO","KAT");
    }

}
