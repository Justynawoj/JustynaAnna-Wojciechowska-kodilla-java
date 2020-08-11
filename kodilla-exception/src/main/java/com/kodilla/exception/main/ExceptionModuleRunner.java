package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.io.FileReaderWithoutHandling;
import com.kodilla.exception.test.ExceptionHandling;
import com.kodilla.exception.test.SecondChallenge;
import com.kodilla.exception.test.Flight;
import com.kodilla.exception.test.FlightFinder;
import com.kodilla.exception.test.RouteNotFoundException;


public class ExceptionModuleRunner {
    public static void main(String[] args) {

        FileReaderWithoutHandling fileReaderWithoutHandling = new FileReaderWithoutHandling();
        FileReader fileReader = new FileReader();

     //   fileReader.readFile();


        try{
            fileReader.readFile();
        } catch (FileReaderException e){
            System.out.println("Problem while reading file!");
        }

        //Second challenge

        SecondChallenge secondChallenge = new SecondChallenge();
        try{
            System.out.println(secondChallenge.probablyIWillThrowException(5,5));
        } catch (ExceptionHandling e){
            System.out.println("Wrong x and/or y value");
        }



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
