package com.kodilla.stream.world;

import java.math.BigDecimal;


public final class Country {
    private final String peopleQuantityString;
    private final String countryName;

    public Country(String peopleQuantityString, String countryName) {
        this.peopleQuantityString = peopleQuantityString;
        this.countryName = countryName;
    }

    public BigDecimal getPeopleQuantity() {
        return new BigDecimal(peopleQuantityString);

    }
}