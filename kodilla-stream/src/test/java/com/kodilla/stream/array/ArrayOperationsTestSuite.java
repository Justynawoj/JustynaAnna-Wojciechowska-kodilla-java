package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;


import static com.kodilla.stream.array.ArrayOperations.getAverage;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = {5, 10};

        //When
        double result = getAverage(numbers);

        //Then
        Assert.assertEquals(7.5, result, 0.00001);
    }
}
