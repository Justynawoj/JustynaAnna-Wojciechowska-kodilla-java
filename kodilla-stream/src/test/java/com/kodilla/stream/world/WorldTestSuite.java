package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;


public class WorldTestSuite {

    @Test
    public void testMethod() {

        //Given
        Country poland = new Country("10000000000", "Polska");
        Country germany = new Country("10000000000000", "Deutchland");
        Country italy = new Country("10000000", "Italia");

        Country indie = new Country("1000000", "India");
        Country russia = new Country("100000000", "Russoa");

        Continent europe = new Continent();

        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(italy);

        Continent asia = new Continent();
        asia.addCountry(indie);
        asia.addCountry(russia);

        Continent africa = new Continent();

        ArrayList<Continent> continents = new ArrayList<>();
        continents.add(europe);
        continents.add(asia);
        continents.add(africa);

        World earth = new World(continents);

        //When
        BigDecimal result = earth.getPeopleQuantity();

        //Then
        BigDecimal expectedResult = new BigDecimal("10010111000000");
        Assert.assertEquals(expectedResult, result);
    }

}
