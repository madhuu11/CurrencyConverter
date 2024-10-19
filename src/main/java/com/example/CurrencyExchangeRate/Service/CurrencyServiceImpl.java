package com.example.CurrencyExchangeRate.Service;

//generate the currency service implementation class with methods to get all currencies
import com.example.CurrencyExchangeRate.Entity.Currency;
import com.example.CurrencyExchangeRate.Repository.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrencyServiceImpl implements CurrencyService {

    @Autowired
    private CurrencyRepository currencyRepository;

    @Override
    public List<Currency> getAllCurrencies() {
        return currencyRepository.findAll();
    }
}
