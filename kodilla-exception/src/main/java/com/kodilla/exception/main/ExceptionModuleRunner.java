package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.io.FileReaderWithoutHandling;
import com.kodilla.exception.test.ExceptionHandling;
import com.kodilla.exception.test.SecondChallenge;


public class ExceptionModuleRunner {
    public static void main(String[] args) {

        FileReaderWithoutHandling fileReaderWithoutHandling = new FileReaderWithoutHandling();
        FileReader fileReader = new FileReader();

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


    }
}
