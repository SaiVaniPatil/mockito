package com.intime.unittesting.business;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


import com.intime.unittesting.unittesting.business.SomeBusinessImpl;



public  class SomeBusinessTest {


   


    @Test
    public void calculateSum_basic()
    {
        SomeBusinessImpl business = new SomeBusinessImpl();

        int actualResult = business.calculateSum(new int[] {1,2,3});
        int expectedREsult =6;

        assertEquals(expectedREsult, actualResult );
    }


    @Test
    public void calculateSum_empty()
    {
        SomeBusinessImpl business = new SomeBusinessImpl();

        int actualResult = business.calculateSum(new int[] {});
        int expectedREsult = 0;

        assertEquals(expectedREsult, actualResult );
    }


    // @Test
    // public void calculateSumUsingDataService()
    // {
    //     SomeBusinessImpl business = new SomeBusinessImpl();

    //     int actualResult = some
    //     int expectedREsult = 0;

    //     assertEquals(expectedREsult, actualResult );
    // }
    
    
}
