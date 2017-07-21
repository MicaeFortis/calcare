package com.home.calculator.repositories;

import com.home.calculator.models.Payer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Michal on 21.07.2017.
 */
public interface PayerDao extends CrudRepository<Payer, Long> {
    List<Payer> findAll();
}
