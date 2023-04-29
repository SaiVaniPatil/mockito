package com.intime.unittesting.unittesting.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.intime.unittesting.unittesting.business.SomeBusinessImpl;
import com.intime.unittesting.unittesting.data.SomeDataService;


@ExtendWith(MockitoExtension.class)
public  class SomeBusinessMockTest {


    @InjectMocks // will call setter method for mock = business.setSomeDataService(dataServiceMock);
    SomeBusinessImpl business = new SomeBusinessImpl();


    @Mock
    SomeDataService dataServiceMock;
    
    //= mock(SomeDataService.class);

    @BeforeEach
    public void before()
    {

       // business.setSomeDataService(dataServiceMock);
    }

    @Test
    public void calculateDataService_basic()
    {
       // SomeBusinessImpl business = new SomeBusinessImpl();

       // SomeDataService mock1 = mock(SomeDataService.class);

        when(dataServiceMock.retrieveAllDAta()).thenReturn(new int[]{1,2,3});

        business.setSomeDataService(dataServiceMock);

        int actualResult = business.calculateSumUsingDataService();
        int expectedREsult =6;

        assertEquals(expectedREsult, actualResult );
    }



    
    
}
