package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.test.Flight;
import com.kodilla.exception.test.FlightFinder;
import com.kodilla.exception.test.RouteNotFoundException;

public class ExceptionModuleRunner {
    public static void main(String[] args) {

        FileReader fileReader = new FileReader();
     //   fileReader.readFile();

        // 8.4

        FlightFinder flightFinder = new FlightFinder();
        try{
            System.out.println(flightFinder.findFlight(new Flight("WRO","FRA")));

        } catch (RouteNotFoundException e){
            System.out.println("Route not found");
        } finally{
            System.out.println("Thank you for flying with airplanes");
        }
    }
}
