package com.intime.unittesting.unittesting.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intime.unittesting.unittesting.model.Item;

public interface ItemRepository extends JpaRepository<Item,Integer> {
    
}
