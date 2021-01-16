package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigmacBuilder() {

        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("bun")
                .sauce("barbecue")
                .ingredients("cebula")
                .burgers(2)
                .ingredients("bekon")
                .build();

        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngedients().size();
        Assert.assertEquals(2, howManyIngredients);
    }
}
