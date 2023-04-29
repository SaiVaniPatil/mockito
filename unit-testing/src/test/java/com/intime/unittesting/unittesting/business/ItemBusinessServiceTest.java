package com.intime.unittesting.unittesting.business;

import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.intime.unittesting.unittesting.data.ItemRepository;
import com.intime.unittesting.unittesting.model.Item;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class ItemBusinessServiceTest {

    @InjectMocks // will call constructor or setter method
    private ItemBusinessService itemBusinessService = new ItemBusinessService();


    @Mock
    private ItemRepository repository;
    
    @Test
    public void finaAllElemens()
    {
        when(repository.findAll()).thenReturn(Arrays.asList(new Item(1001,"Item1",10,20),
        new Item(1002,"Item2",5,10)));
        List<Item> items = itemBusinessService.findAllItems();
        assertEquals(100,items.get(0).getValue());
        assertEquals(100,items.get(0).getValue());

    }
    
}
