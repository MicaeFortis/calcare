package com.home.calculator.Controllers;

import com.home.calculator.models.Payer;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;

/**
 * Created by Michal on 20.07.2017.
 */
@Controller
@Getter @Setter
public class WorkContext {
    private Payer payer;
}
