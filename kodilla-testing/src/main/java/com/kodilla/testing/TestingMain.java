package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;


public class TestingMain {

    public static void main(String[] args){

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        }else{
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();

        int addResult = calculator.add(2,2);
        if (addResult==4){
            System.out.println("test add method OK");
        }else{
            System.out.println("Error in add method");
        }

        int substractResult = calculator.substract(5,3);

        if(substractResult == 2){
            System.out.println("test substract method OK");
        }else{
            System.out.println("Error in substract method");
        }

    }
}
