package com.intime.unittesting.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;


import com.intime.unittesting.unittesting.business.SomeBusinessImpl;
import com.intime.unittesting.unittesting.data.SomeDataService;

import static org.mockito.Mockito.mock;




public  class SomeBusinessMockTest {

    @Test
    public void calculateDataService_basic()
    {
        SomeBusinessImpl business = new SomeBusinessImpl();

        SomeDataService mock1 = mock(SomeDataService.class);

        when(mock1.retrieveAllDAta()).thenReturn(new int[]{1,2,3});

        business.setSomeDataService(new SomeDataServiceStub());

        int actualResult = business.calculateSumUsingDataService();
        int expectedREsult =6;

        assertEquals(expectedREsult, actualResult );
    }



    
    
}
