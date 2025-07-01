package com.example.CurrencyExchangeRate.Controller;

//create a controller class CurrencyRateController that handles the get request with two path variables currency_code_from and currency_code_to
import com.example.CurrencyExchangeRate.Service.CurrencyRateService;
import com.example.CurrencyExchangeRate.Service.CurrencyValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api")
public class CurrencyRateController {

    @Autowired
    private CurrencyRateService currencyRateService;

    @Autowired
    private CurrencyValidationService currencyValidationService;

    @GetMapping("/exchange-rate/{currency_code_from}/{currency_code_to}/{amount}")
    public ResponseEntity<BigDecimal> convertCurrency(
        @PathVariable String currency_code_from,
        @PathVariable String currency_code_to,
        @PathVariable BigDecimal amount) {

        currencyValidationService.validateCurrencyCode(currency_code_from);
        currencyValidationService.validateCurrencyCode(currency_code_to);

        BigDecimal rate = currencyRateService.getExchangeRateByCurrencyCode(currency_code_from, currency_code_to);
        BigDecimal convertedAmount = amount.multiply(rate);

        return ResponseEntity.ok(convertedAmount.setScale(2, RoundingMode.HALF_UP));
    }
}
