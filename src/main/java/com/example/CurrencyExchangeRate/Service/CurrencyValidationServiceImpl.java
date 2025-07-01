package com.example.CurrencyExchangeRate.Service;

//generate the currency validation service implementation class with methods to validate currency with currency code
import com.example.CurrencyExchangeRate.Repository.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class CurrencyValidationServiceImpl implements CurrencyValidationService {
    
    @Autowired
    private CurrencyRepository currencyRepository;

    @Override
    public void validateCurrencyCode(String currency_code) {
    	List<String> allowedCurrencies = currencyRepository.findAllCurrencyCodes();
        //check if the currency code is not present in the allowed currencies
        if (!allowedCurrencies.stream().anyMatch(code -> code.equalsIgnoreCase(currency_code))) {
        	//throw a illegal exception if the currency code is not present in the allowed currencies
            throw new IllegalArgumentException("Currency code not allowed: " + currency_code);
        }

     }
}
