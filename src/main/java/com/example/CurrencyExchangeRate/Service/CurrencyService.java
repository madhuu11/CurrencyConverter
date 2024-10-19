package com.example.CurrencyExchangeRate.Service;

//generate the interface CurrencyService with methods to get all currencies
import com.example.CurrencyExchangeRate.Entity.Currency;
import java.util.List;

public interface CurrencyService {
    List<Currency> getAllCurrencies();
}
