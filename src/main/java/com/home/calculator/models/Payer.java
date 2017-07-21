package com.home.calculator.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Michal on 21.07.2017.
 */
@Entity
@Getter
@Setter
public class Payer {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String name;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Item> items;
}
