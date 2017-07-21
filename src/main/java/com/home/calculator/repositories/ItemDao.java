package com.home.calculator.repositories;

import com.home.calculator.models.Item;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Michal on 20.07.2017.
 */
public interface ItemDao extends CrudRepository<Item, Long> {
    List<Item> findAll();
}
