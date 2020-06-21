package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;


public final class World {
    private final ArrayList<Continent> continents;

    public World(ArrayList<Continent> continents) {
        this.continents = continents;
    }

    public BigDecimal getPeopleQuantity(){

        return continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
