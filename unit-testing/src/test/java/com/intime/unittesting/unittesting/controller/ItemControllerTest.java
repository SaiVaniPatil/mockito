package com.intime.unittesting.unittesting.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.intime.unittesting.unittesting.business.ItemBusinessService;
import com.intime.unittesting.unittesting.model.Item;

@WebMvcTest(ItemController.class)
public class ItemControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    private ItemBusinessService itemBusinessService; //bydefault will return null, so should be initialized


    @Test
    public void dummyItem_basic() throws Exception
    {
    

        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/dummy-item")
                                                              .accept(MediaType.APPLICATION_JSON);

       // MvcResult result = mockMvc.perform(requestBuilder).andReturn();

       MvcResult result = mockMvc.perform(requestBuilder)
                                 .andExpect(status().isOk())
                                 .andExpect(content().json("{\"id\": 1,\"name\":\"Ball\",\"price\":10,\"quantity\":100}"))
                                 .andReturn();


        //.json will ignore spaces and also assert true if one param is missing
         System.out.println(result.getResponse().getContentAsString());

        // assertEquals("Hello World", result.getResponse().getContentAsString());


        
    }

    @Test
    public void itemFromBusinessService_basic() throws Exception
    {
     
        //initialize business service here

        when(itemBusinessService.retreiveHardCodedItem()).thenReturn(new Item(1,"Ball",10,100));

        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/item-from-business-service")
                                                              .accept(MediaType.APPLICATION_JSON);

       // MvcResult result = mockMvc.perform(requestBuilder).andReturn();

       MvcResult result = mockMvc.perform(requestBuilder)
                                .andExpect(status().isOk())
                                .andExpect(content().json("{\"id\": 1,\"name\":\"Ball\",\"price\":10,\"quantity\":100}"))
                                .andReturn();



        //.json will ignore spaces and also assert true if one param is missing
         System.out.println(result.getResponse().getContentAsString());

        // assertEquals("Hello World", result.getResponse().getContentAsString());


        
    }

    @Test
    public void itemFromBusinessService_diffdata() throws Exception
    {
     
        //initialize business service here

        when(itemBusinessService.retreiveHardCodedItem()).thenReturn(new Item(2,"Item 2",10,10));

        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/item-from-business-service")
                                                              .accept(MediaType.APPLICATION_JSON);

       // MvcResult result = mockMvc.perform(requestBuilder).andReturn();

       MvcResult result = mockMvc.perform(requestBuilder)
                                .andExpect(status().isOk())
                                .andExpect(content().json("{\"id\": 1,\"name\":\"Ball\",\"price\":10,\"quantity\":100}"))
                                .andReturn();



        //.json will ignore spaces and also assert true if one param is missing
         System.out.println(result.getResponse().getContentAsString());

        // assertEquals("Hello World", result.getResponse().getContentAsString());


        
    }

    @Test
    public void retrieveAllItemsFromDatabase() throws Exception
    {
     
       

        when(itemBusinessService.findAllItems()).thenReturn(
            Arrays.asList(new Item(1,"Ball",10,100),
            new Item(2,"Item 2",10,10)));

        RequestBuilder requestBuilder = MockMvcRequestBuilders
                                        .get("/all-items-from-database")
                                                              .accept(MediaType.APPLICATION_JSON);



       MvcResult result = mockMvc.perform(requestBuilder)
                                .andExpect(status().isOk())
                                .andExpect(content().json("[{\"id\": 1,\"name\":\"Ball\",\"price\":10,\"quantity\":100},{\"id\": 2,\"name\":\"Ball2\",\"price\":20,\"quantity\":200}]"))
                                .andReturn();



        //.json will ignore spaces and also assert true if one param is missing
         System.out.println(result.getResponse().getContentAsString());

        // assertEquals("Hello World", result.getResponse().getContentAsString());


        
    }

    

    
}
