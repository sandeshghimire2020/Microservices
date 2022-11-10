package com.dotoku.currencyexchangeservice.controller;


import com.dotoku.currencyexchangeservice.model.ExchangeValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController {

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchangeValue retriveExchangeValue(@PathVariable String from, @PathVariable String to){

        return new ExchangeValue("USA","NRS",100L,BigDecimal.valueOf(130));
    }

}
