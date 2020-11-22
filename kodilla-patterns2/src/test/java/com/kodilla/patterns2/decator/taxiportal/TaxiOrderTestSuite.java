package com.kodilla.patterns2.decator.taxiportal;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class TaxiOrderTestSuite {
    @Test
    public void testBasicOrderGetCost() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        //WHen
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(5), calculatedCost);
    }

    @Test
    public void testBasicTaxiOrderGetDescription() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        //When
        String description = theOrder.getDescription();
        //Then
        Assert.assertEquals("Drive a course", description);
    }

    @Test
    public void testTaxiNetworkGetCost() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        //WHen
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(40), calculatedCost);

    }

    @Test
    public void testTaxiNetworkGetDescription() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        Assert.assertEquals("Drive a course by Taxi Network", description);
    }

    @Test
    public void testMyTaxiWithChildSeatGetCost() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new MyTaxiNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        //When
        BigDecimal costOfMyTaxiAndChildSeat = theOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(37), costOfMyTaxiAndChildSeat);

    }

    @Test
    public void testMyTaxiWithChildSeatGetDescription() {
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new MyTaxiNetworkOrderDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);

        //When
        String description = taxiOrder.getDescription();

        //Then
        Assert.assertEquals("Drive a course by MyTaxi Network + child seat", description);
    }

    @Test
    public void testChildSeatWithMyTaxiWithGetDescription() {
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        taxiOrder = new MyTaxiNetworkOrderDecorator(taxiOrder);

        //When
        String description = taxiOrder.getDescription();

        //Then
        Assert.assertEquals("Drive a course + child seat by MyTaxi Network", description);
    }
    @Test
    public void testUberWithTwoChildSeatGetCost(){
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new UberNetworkOrderDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);

        //When
        BigDecimal cost = taxiOrder.getCost();

        //Then
        Assert.assertEquals(new BigDecimal(29), cost);
    }
    @Test
    public void testUberWithTwoChildSeatGetDescription(){
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new UberNetworkOrderDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);

        //When
        String descripion = taxiOrder.getDescription();

        //Then
        Assert.assertEquals("Drive a course by Uber Network + child seat + child seat", descripion);
    }
    @Test
    public void testVipTaxiWithChildSeatExpressGetCost(){
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new TaxiNetworkOrderDecorator(taxiOrder);
        taxiOrder = new VipCarDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        //When
        BigDecimal cost = taxiOrder.getCost();

        //Then
        Assert.assertEquals(new BigDecimal(52), cost);
    }
    @Test
    public void testVipTaxiWithChildSeatExpressGetDescription(){
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new TaxiNetworkOrderDecorator(taxiOrder);
        taxiOrder = new VipCarDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        //When
        String descripion = taxiOrder.getDescription();

        //Then
        Assert.assertEquals("Drive a course by Taxi Network variant VIP + child seat", descripion);

    }
}