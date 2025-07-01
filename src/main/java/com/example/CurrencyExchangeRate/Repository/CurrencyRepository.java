package com.example.CurrencyExchangeRate.Repository;

//create a repository interface CurrencyRepository that extends JpaRepository with Currency and Integer as type arguments
import com.example.CurrencyExchangeRate.Entity.Currency;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyRepository extends JpaRepository<Currency, Integer> {
	@Query("SELECT c.currency_code FROM Currency c")
	List<String> findAllCurrencyCodes();
}
