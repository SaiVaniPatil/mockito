package com.intime.unittesting.unittesting.business;

import com.intime.unittesting.unittesting.data.SomeDataService;

public class SomeBusinessImpl{


    SomeDataService someDataService;

    public void setSomeDataService(SomeDataService someDataService) {
        this.someDataService = someDataService;
    }

    public int calculateSum(int[] data)
    {

        int sum=0;

        for(int value:data)
        {
            sum=sum+value;
        }

        return sum;

    }

    public int calculateSumUsingDataService()
    {

        int sum=0;

        int[] data = someDataService.retrieveAllDAta();

        for(int value:data)
        {
            sum=sum+value;
        }

        return sum;

    }
}