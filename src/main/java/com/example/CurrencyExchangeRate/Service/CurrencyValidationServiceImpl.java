package com.example.CurrencyExchangeRate.Service;

//generate the currency validation service implementation class with methods to validate currency with currency code
import com.example.CurrencyExchangeRate.Repository.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class CurrencyValidationServiceImpl implements CurrencyValidationService {

    //define a set of allowed currencies for validation
    private final String[] allowedCurrencies = {"USD", "INR", "EUR", "GBP", "JPY"};

    @Override
    public void validateCurrencyCode(String currency_code) {
        //check if the currency code is not present in the allowed currencies
        if(!Arrays.asList(allowedCurrencies).contains(currency_code)){
            //throw a illegal exception if the currency code is not present in the allowed currencies
            throw new IllegalArgumentException("Currency code not allowed");
        }
    }
}