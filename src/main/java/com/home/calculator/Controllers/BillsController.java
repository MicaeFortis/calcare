package com.home.calculator.Controllers;

import com.home.calculator.models.Bill;
import com.home.calculator.models.Item;
import com.home.calculator.repositories.BillDao;
import com.home.calculator.repositories.ItemDao;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * Created by Michal on 20.07.2017.
 */
@Controller
@Getter @Setter
public class BillsController {

    @Autowired
    private BillDao billDao;

    public List<Bill> bills;

    @PostConstruct
    public void init() {
        bills = billDao.findAll();
    }

    public String addBill() {
        return "faces/add-bill.xhtml?faces-redirect=true";
    }

}
