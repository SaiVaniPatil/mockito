package com.intime.unittesting.unittesting.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.apache.catalina.connector.Request;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(HelloWorldController.class)
public class HelloWorldControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void helloWorld_basic() throws Exception
    {
        //call /hello-world and verify response contains "Hello World"

        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/hello-world")
                                                              .accept(MediaType.APPLICATION_JSON);

       // MvcResult result = mockMvc.perform(requestBuilder).andReturn();

       MvcResult result = mockMvc.perform(requestBuilder)
                                 .andExpect(status().isOk())
                                 .andExpect(content().string("Hello World"))
                                 .andReturn();

        // System.out.println(result.getResponse().getContentAsString());

        // assertEquals("Hello World", result.getResponse().getContentAsString());


        
    }

    
}
