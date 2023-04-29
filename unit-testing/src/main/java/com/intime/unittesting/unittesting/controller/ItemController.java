package com.intime.unittesting.unittesting.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intime.unittesting.unittesting.business.ItemBusinessService;
import com.intime.unittesting.unittesting.model.Item;

@RestController
public class ItemController {

    @Autowired
    private ItemBusinessService itembusinessService;

    @GetMapping("/dummy-item")
    public Item dummyItem()
    {
        return new Item(1,"Ball",10,100);
    }

    @GetMapping("/item-from-business-service")
    public Item itembusinessService()
    {
        return itembusinessService.retreiveHardCodedItem();
    }


    
    @GetMapping("/all-items-from-database")
    public List<Item> allItemsFromDatabase()
    {
        return itembusinessService.findAllItems();
    }

    
}
