package com.home.calculator.Controllers;

import com.home.calculator.models.Payer;
import com.home.calculator.repositories.PayerDao;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Created by Michal on 21.07.2017.
 */
@Controller
@Getter
@Setter
public class PayersController {

    @Autowired
    PayerDao payerDao;

    @Autowired
    WorkContext workContext;

    List<Payer> payers;

    public void init() {
        payers = payerDao.findAll();
    }

    public String addPayer() {
        workContext.setPayer(new Payer());
        return "add-payer.xhtml?faces-redirect=true";
    }

    public String editPayer(Payer payer) {
        workContext.setPayer(payer);
        return "add-payer.xhtml?faces-redirect=true";
    }
}
