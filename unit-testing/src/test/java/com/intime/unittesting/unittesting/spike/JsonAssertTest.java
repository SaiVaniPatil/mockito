package com.intime.unittesting.unittesting.spike;

import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;

public class JsonAssertTest {

    String actualResponse = "{\"id\": 1,\"name\":\"Ball\",\"price\":10,\"quantity\":100}";

    @Test
    public void jsonAssert() throws JSONException
    {
        String expectedResponse = "{\"id\": 1,\"name\":\"Ball\",\"price\":10,\"quantity\":100}";

            JSONAssert.assertEquals(expectedResponse, actualResponse, true);

    }

    @Test
    public void jsonAssertfalse() throws JSONException
    {
        String expectedResponse = "{\"id\": 1,\"name\":\"Ball\",\"price\":10,\"quantity\":100}";

            JSONAssert.assertEquals(expectedResponse, actualResponse, false);

    }


    //added extra spaces below
    @Test
    public void jsonAssertv2() throws JSONException
    {
        String expectedResponse = "{\"id\": 1,\"name\":\"Ball\",\"price\":10,\"quantity\":100}";

            JSONAssert.assertEquals(expectedResponse, actualResponse, true);

    }

    @Test
    public void jsonAssertfalsev2() throws JSONException
    {
        String expectedResponse = "{\"id\": 1,\"name\":\"Ball\",\"price\":10,\"quantity\":100}";

            JSONAssert.assertEquals(expectedResponse, actualResponse, false);

    }

    //removed parts of string

    @Test
    public void jsonAssertv3() throws JSONException
    {
        String expectedResponse = "{\"id\": 1,\"name\":\"Ball\",\"price\":10}";

            JSONAssert.assertEquals(expectedResponse, actualResponse, true);

    }

    @Test
    public void jsonAssertfalsev3() throws JSONException
    {
        String expectedResponse = "{\"id\": 1,\"name\":\"Ball\",\"price\":10}";

            JSONAssert.assertEquals(expectedResponse, actualResponse, false);

    }

    @Test
    public void jsonAssertv4() throws JSONException
    {
        String expectedResponse = "{\"id\": 1,\"name\":\"Ball\",\"price\":11,\"quantity\":100}";

            JSONAssert.assertEquals(expectedResponse, actualResponse, true);

    }

    @Test
    public void jsonAssertfalsev4() throws JSONException
    {
        String expectedResponse = "{\"id\": 1,\"name\":\"Ball\",\"price\":11,\"quantity\":100}";

            JSONAssert.assertEquals(expectedResponse, actualResponse, false);

    }

        //if there are no spaces in values, not required to escape them
    @Test
    public void jsonAssertfalseWithoutEscapeChars() throws JSONException
    {
        String expectedResponse = "{id:1,name:Ball,price:10,quantity:100}";

            JSONAssert.assertEquals(expectedResponse, actualResponse, false);

    }
    
}
