package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    //Given
    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
    //  Calculator calculator = context.getBean(Calculator.class);
    Calculator calculator = (Calculator) context.getBean("calculator");

    @Test
    public void testCalculationsAddMethod() {

        //When
        double addResult = calculator.add(5, 4);
        //Then
        Assert.assertEquals(addResult, 9, 1);
    }

    public void testCalculationsSubMethod() {

        //When
        double subResult = calculator.sub(5, 4);
        //Then
        Assert.assertEquals(subResult, 1, 1);
    }

    public void testCalculationsMulMethod() {
        //When
        double mulResult = calculator.mul(5, 4);
        //Then
        Assert.assertEquals(mulResult, 20, 1);
    }

    public void testCalculationsDivMethod() {
        //When
        double divResult = calculator.div(5, 5);
        //Then
        Assert.assertEquals(divResult, 1, 1);
    }
}




