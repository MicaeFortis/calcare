package com.home.calculator.models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.FetchMode;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Michal on 20.07.2017.
 */
@Entity
@Getter @Setter
public class Bill {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String name;

    private Date created;

    private String note;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Item> items;
}
