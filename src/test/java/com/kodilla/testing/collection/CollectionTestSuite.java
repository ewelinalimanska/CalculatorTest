package com.kodilla.testing.collection;

import org.junit.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import com.kodilla.testing.collection.OddNumbersExterminator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class CollectionTestSuite {


    @Before
    public void before(){
        System.out.println("Test odd numbers: begin");
    }
    @After
    public void after(){
        System.out.println("Test odd numbers: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {

        //given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<>(Collections.emptyList());

        //when
        ArrayList<Integer> empty = oddNumbersExterminator.exterminate(numbers);

        //then
        Assert.assertArrayEquals(new Integer[0], empty.toArray());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {

        //given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(77, 4, 23, 10, 45, 38, 90));

        //when
        ArrayList<Integer> odd = oddNumbersExterminator.exterminate(numbers);

        //then

        Assert.assertEquals(4, odd.size());

    }
}

