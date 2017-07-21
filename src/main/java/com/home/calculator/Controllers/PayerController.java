package com.home.calculator.Controllers;

import com.home.calculator.models.Bill;
import com.home.calculator.models.Payer;
import com.home.calculator.repositories.BillDao;
import com.home.calculator.repositories.PayerDao;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;

/**
 * Created by Michal on 20.07.2017.
 */
@Controller
@Getter @Setter
public class PayerController {

    @Autowired
    private PayerDao payerDao;

    @Autowired
    WorkContext workContext;
    public Payer payer;

    @PostConstruct
    public void init() {
        payer = workContext.getPayer();
    }

    public void addPayer() {
        addPayerFinal();
    }

    public String addPayerFinal() {
        payerDao.save(payer);
        return "list-payers.xhtml?faces-redirect=true";
    }

}
