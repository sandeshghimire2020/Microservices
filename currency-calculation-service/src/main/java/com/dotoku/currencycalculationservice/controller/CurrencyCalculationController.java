package com.dotoku.currencycalculationservice.controller;

import com.dotoku.currencycalculationservice.facade.CurrencyExchangeProxy;
import com.dotoku.currencycalculationservice.model.CalculatedAmount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyCalculationController {

    @Autowired
    private CurrencyExchangeProxy proxy;
//    @GetMapping("currency-converter/from/{from}/to/{to}/quantity/{quantity}")
//    public CalculatedAmount calculateAmount(@PathVariable String from, @PathVariable String to,
//                                            @PathVariable BigDecimal quantity){
//        Map<String,String> uriVariable = new HashMap<>();
//        uriVariable.put("from",from);
//        uriVariable.put("to",to);
//        ResponseEntity<CalculatedAmount> responseEntity = new RestTemplate().getForEntity(
//                "http://localhost:8001/currency-exchange/from/{from}/to/{to}"
//                ,CalculatedAmount.class,uriVariable);
//
//        CalculatedAmount calculatedAmount = responseEntity.getBody();
//        return new CalculatedAmount(calculatedAmount.getId(),calculatedAmount.getFrom()
//                ,calculatedAmount.getTo(),calculatedAmount.getConvMult(),
//                quantity,quantity.multiply(calculatedAmount.getConvMult()),calculatedAmount.getPort());
//    }



    @GetMapping("currency-converter-feign/from/{from}/to/{to}/quantity/{quantity}")
    public CalculatedAmount calculateAmountFeign(@PathVariable String from, @PathVariable String to,
                                            @PathVariable BigDecimal quantity){

        CalculatedAmount calculatedAmount = proxy.retrieveExchangeValue(from,to);
        return new CalculatedAmount(calculatedAmount.getId(),calculatedAmount.getFrom()
                ,calculatedAmount.getTo(),calculatedAmount.getConvMult(),
                quantity,quantity.multiply(calculatedAmount.getConvMult()),calculatedAmount.getPort());
    }
}
