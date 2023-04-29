package com.intime.unittesting.unittesting.business;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.intime.unittesting.unittesting.data.ItemRepository;
import com.intime.unittesting.unittesting.model.Item;

@Component
public class ItemBusinessService {

    @Autowired
    private ItemRepository repository;

    public Item retreiveHardCodedItem() {
        return new Item(1,"Ball",10,100);
    }

    public List<Item> findAllItems()
    {

        List<Item> items =  repository.findAll();

        for(Item item:items)
        {
            int value = item.getPrice()*item.getQuantity();
            item.setValue(value);
        }
        return repository.findAll();
    }

}
