package com.home.calculator.models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Michal on 20.07.2017.
 */
@Entity
@Getter @Setter
public class Item {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String name;

    private double cost;

    private double divider;

    @ManyToOne(fetch = FetchType.LAZY)
    private Bill bill;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Payer> payers;

}
