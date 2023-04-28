package com.intime.unittesting.business;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


import com.intime.unittesting.unittesting.business.SomeBusinessImpl;
import com.intime.unittesting.unittesting.data.SomeDataService;



class SomeDataServiceStub implements SomeDataService{

  

    @Override
    public int[] retrieveAllDAta() {
        // TODO Auto-generated method stub
        return new int[]{1,2,3};
    }
}

public  class SomeBusinessStubTest {

    @Test
    public void calculateDataService_basic()
    {
        SomeBusinessImpl business = new SomeBusinessImpl();

        business.setSomeDataService(new SomeDataServiceStub());

        int actualResult = business.calculateSumUsingDataService();
        int expectedREsult =6;

        assertEquals(expectedREsult, actualResult );
    }



    
    
}
