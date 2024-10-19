package com.example.CurrencyExchangeRate.Repository;

//create a repository interface CurrencyRateRepository that extends JpaRepository with Currency_Rate and Integer as type arguments
import com.example.CurrencyExchangeRate.Entity.Currency_Rate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CurrencyRateRepository extends JpaRepository<Currency_Rate, Integer> {
    Optional<Currency_Rate> findByCurrency_code_fromAndCurrency_code_to(String currencyCodeFrom, String currencyCodeTo);
}
