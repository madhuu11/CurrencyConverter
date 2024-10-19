package com.example.CurrencyExchangeRate.Repository;

//create a repository interface CurrencyRepository that extends JpaRepository with Currency and Integer as type arguments
import com.example.CurrencyExchangeRate.Entity.Currency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyRepository extends JpaRepository<Currency, Integer> {
}
