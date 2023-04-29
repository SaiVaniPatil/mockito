package com.intime.unittesting.unittesting.business;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.*;

import com.intime.unittesting.unittesting.data.SomeDataService;

public class SomeBusinessImpl{


    SomeDataService someDataService;

    public void setSomeDataService(SomeDataService someDataService) {
        this.someDataService = someDataService;
    }

    public int calculateSum(int[] data)
    {

        int sum = Arrays.stream(data).reduce(Integer::sum).orElse(0);  

        return sum;

    }

    public int calculateSumUsingDataService()
    {

        int sum=Arrays.stream(someDataService.retrieveAllDAta()).reduce(Integer::sum).orElse(0);;

    //    int[] data = someDataService.retrieveAllDAta();

    //     for(int value:data)
    //     {
    //         sum=sum+value;
    //     } 

    System.out.println("sum is :"+sum);

        return sum;

    }
}