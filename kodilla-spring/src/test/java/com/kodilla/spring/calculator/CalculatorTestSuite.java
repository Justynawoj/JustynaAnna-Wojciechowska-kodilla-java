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

    @Test
    public void testCalculations() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        //  Calculator calculator = context.getBean(Calculator.class);
        Calculator calculator = (Calculator) context.getBean("calculator");

        //When
        double addResult = calculator.add(5,4);
        double subResult = calculator.sub(5,4);
        double mulResult = calculator.mul(5,4);
        double divResult = calculator.div(5,5);

        //Then
        Assert.assertEquals(addResult,9,1);
        Assert.assertEquals(subResult,1,1);
        Assert.assertEquals(mulResult,20,1);
        Assert.assertEquals(divResult,1,1);
    }
}
