package com.home.calculator.Controllers;

import com.home.calculator.models.Bill;
import com.home.calculator.repositories.BillDao;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by Michal on 20.07.2017.
 */
@Controller
@Getter @Setter
public class BillController {

    @Autowired
    private BillDao billDao;

    public Bill bill;

    @PostConstruct
    public void init() {
        bill = new Bill();
    }

    public void addBill() {
        addBillFinal();
    }

    public String addBillFinal() {
        billDao.save(bill);
        return "index.xhtml?faces-redirect=true";
    }

}
