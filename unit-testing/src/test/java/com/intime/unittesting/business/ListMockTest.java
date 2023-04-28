package com.intime.unittesting.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.atMost;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.times;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

public class ListMockTest {

    List mockList =  mock(List.class);
    
    @Test
    public void size_basic()
    {
       


        when(mockList.size()).thenReturn(5);


        assertEquals(5,mockList.size());   
    }

    @Test
    public void returnDifferentValues()
    {
       


        when(mockList.size()).thenReturn(5).thenReturn(10); //


        assertEquals(5,mockList.size());  
        assertEquals(10,mockList.size());   //will return 10 on second calling
    }

    @Test
    public void returnWithParameter()
    {
        //list.get(0);

        when(mockList.get(0)).thenReturn("in28Minutes");
        assertEquals("in28Minutes", mockList.get(0));
        //assertEquals("in28Minutes", mockList.get(1)); //not inserted so should fail
    }

    @Test
    public void returnWithGenericParameters()
    {
        //list.get(0);

        when(mockList.get(anyInt())).thenReturn("in28Minutes");
        assertEquals("in28Minutes", mockList.get(0));
        assertEquals("in28Minutes", mockList.get(1)); 
    }

    @Test
    public void verificationBasics()
    {
        Object value = mockList.get(0);
        Object value2 = mockList.get(1);

        verify(mockList).get(0);
        verify(mockList,times(2)).get(anyInt());
        verify(mockList,times(1)).get(anyInt()); //number of times method is called
        verify(mockList,atLeast(1)).get(anyInt()); //number of times method is called
        verify(mockList,atLeastOnce()).get(anyInt()); //number of times method is called
        verify(mockList,atMost(1)).get(anyInt());
        verify(mockList,atMost(1)).get(2);
 
    }

    @Test
    public void argumentCapturing()
    {
        mockList.add("SomeString");

        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);

        verify(mockList).add(captor.capture());

        assertEquals("SomeString",captor.getValue());


    }

    @Test
    public void multipleArgumentCapturing()
    {
        mockList.add("SomeString1");
        mockList.add("SomeString2");

        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);

       // verify(mockList).add(captor.capture());

       verify(mockList, times(2)).add(captor.capture());

        List<String> allValues = captor.getAllValues();

        assertEquals("SomeString1",allValues.get(0));
        assertEquals("SomeString2",allValues.get(1));


    }

    @Test
    public void mocking()
    {

        ArrayList arrayListMock = mock(ArrayList.class);
        System.out.println(arrayListMock.get(0));
        System.out.println(arrayListMock.size());
        arrayListMock.add("Test");
        arrayListMock.add("Test2");
        System.out.println(arrayListMock.size());
        when(arrayListMock.size()).thenReturn(5);
        System.out.println(arrayListMock.size());
        


    }


    @Test
    public void spying()
    {

        ArrayList arrayListMock = spy(ArrayList.class);
       // System.out.println(arrayListMock.get(0));
        System.out.println(arrayListMock.size());
        arrayListMock.add("Test");
        arrayListMock.add("Test2");
        System.out.println(arrayListMock.size());
        when(arrayListMock.size()).thenReturn(5);
        System.out.println(arrayListMock.size());
        


    }
}
