package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> givenNumbers = new ArrayList<>();
        //When
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(givenNumbers);
        ArrayList<Integer> expectedResult = new ArrayList<>();
        System.out.println("Testing empty list");
        //Then
        Assert.assertEquals(expectedResult, result);


    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> givenNumbers = new ArrayList<>();
        givenNumbers.add(1);
        givenNumbers.add(2);
        givenNumbers.add(3);
        givenNumbers.add(4);
        givenNumbers.add(5);
        //When
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(givenNumbers);
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(2);
        expectedResult.add(4);
        System.out.println("Testing normal list");
        //Then
        Assert.assertEquals(expectedResult, result);
    }
}
