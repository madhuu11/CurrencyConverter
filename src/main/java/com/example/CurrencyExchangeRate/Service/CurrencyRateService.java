package com.example.CurrencyExchangeRate.Service;

//generate the interface CurrencyRateService with methods to get exchange rate between two selected currencies

import java.math.BigDecimal;

public interface CurrencyRateService {
    BigDecimal getExchangeRateByCurrencyCode(String currency_code_from, String currency_code_to);
}