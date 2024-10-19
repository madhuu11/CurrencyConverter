package com.example.CurrencyExchangeRate.Service;

//generate the currency rate service implementation class with methods to get exchange rate between two selected currencies
import com.example.CurrencyExchangeRate.Entity.Currency_Rate;
import com.example.CurrencyExchangeRate.Repository.CurrencyRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Optional;

@Service
public class CurrencyRateServiceImpl implements CurrencyRateService {

    @Autowired
    private CurrencyRateRepository currencyRateRepository;

    @Override
    public BigDecimal getExchangeRateByCurrencyCode(String currency_code_from, String currency_code_to) {

        //check if the exchange rate is already available in the database
       Optional<Currency_Rate> currency_rate = currencyRateRepository.findByCurrency_code_fromAndCurrency_code_to(currency_code_from, currency_code_to);

       //if the exchange rate is available, return the exchange rate
        if(currency_rate.isPresent()){
            return currency_rate.get().getExchange_rate();
        }
        //else the exchange rate is not available, calculate the reverse exchange rate if not available
        else{
            Optional<Currency_Rate> currency_rate_reverse = currencyRateRepository.findByCurrency_code_fromAndCurrency_code_to(currency_code_to, currency_code_from);
            if(currency_rate_reverse.isPresent()){
                return BigDecimal.ONE.divide(currency_rate_reverse.get().getExchange_rate(), 4, BigDecimal.ROUND_HALF_UP);
            }
            //throw new runtime exception if the exchange rate is not available
            else{
                throw new RuntimeException("Exchange rate not available for the selected currencies");
            }
        }
    }
}

