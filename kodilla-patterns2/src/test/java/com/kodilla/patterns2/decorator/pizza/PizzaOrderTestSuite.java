package com.kodilla.patterns2.decorator.pizza;


import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrderGetCost(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();

        //When
        BigDecimal cost = pizzaOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(15),cost);
    }
    @Test
    public void testBasicPizzaOrderGetDescription(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();

        //When
        String description = pizzaOrder.getDescription();
        //Then
        Assert.assertEquals("Pizza: bottom, tomato sauce, cheese",description);
    }

    @Test
    public void testPizzaWithExtraCheeseGetCost(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraCheese(pizzaOrder);

        //When
        BigDecimal cost = pizzaOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(22),cost);
    }
    @Test
    public void testPizzaWithExtraCheeseGetDescription(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraCheese(pizzaOrder);
        //When
        String description = pizzaOrder.getDescription();
        //Then
        Assert.assertEquals("Pizza: bottom, tomato sauce, cheese, extra cheese",description);
    }
}
