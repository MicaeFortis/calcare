package com.home.calculator.repositories;

import com.home.calculator.models.Bill;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Michal on 20.07.2017.
 */
public interface BillDao extends CrudRepository<Bill, Long> {
    List<Bill> findAll();
}
