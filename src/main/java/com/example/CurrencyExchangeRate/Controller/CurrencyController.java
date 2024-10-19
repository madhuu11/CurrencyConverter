package com.example.CurrencyExchangeRate.Controller;

//generate a controller class CurrencyController with methods to get all currencies
import com.example.CurrencyExchangeRate.Entity.Currency;
import com.example.CurrencyExchangeRate.Service.CurrencyService;
import com.example.CurrencyExchangeRate.Service.CurrencyValidationService;
import com.example.CurrencyExchangeRate.Service.CurrencyRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CurrencyController {

    @Autowired
    private CurrencyService currencyService;

    @Autowired
    private CurrencyRateService currencyRateService;

    @Autowired
    private CurrencyValidationService currencyValidationService;

    @GetMapping("/currencies")
    public List<Currency> getAllCurrencies(){
        return currencyService.getAllCurrencies();
    }

    @GetMapping("/exchange-rate")
    public BigDecimal getExchangeRate(@RequestParam String currency_code_from, @RequestParam String currency_code_to){
        currencyValidationService.validateCurrencyCode(currency_code_from);
        currencyValidationService.validateCurrencyCode(currency_code_to);
        return currencyRateService.getExchangeRateByCurrencyCode(currency_code_from, currency_code_to);
    }
}
