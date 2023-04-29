package com.intime.unittesting.unittesting.spike;

import org.junit.jupiter.api.Test;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

public class JsonPathTest {
    @Test
    public void learning()
    {
        String responseFromService = "["+"{\"id\":100,\"name\":\"Pencil\",\"quantity\":5},"+
        "{\"id\":101,\"name\":\"Pen\",\"quantity\":15},"+
        "{\"id\":102,\"name\":\"Eraser\",\"quantity\":5}" +"]";


        DocumentContext context = JsonPath.parse(responseFromService);
        int length = context.read("$.length()");
        assertThat(length).isEqualTo(3);

       List<Integer> ids = context.read("$..id");

       assertThat(ids).containsExactly(100,101,102);


        System.out.println(context.read("$.length()").toString());
        System.out.println(context.read("$.[1]").toString());
		System.out.println(context.read("$.[0:2]").toString());
		System.out.println(context.read("$.[?(@.name=='Eraser')]").toString());
		System.out.println(context.read("$.[?(@.quantity==5)]").toString());
    }
    
}
