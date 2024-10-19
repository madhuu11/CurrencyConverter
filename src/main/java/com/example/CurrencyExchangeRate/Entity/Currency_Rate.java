package com.example.CurrencyExchangeRate.Entity;

//define the class Currency_Rate for currency_code_from, currency_code_to, exchange_rate with annotations and required imports
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;

import java.math.BigDecimal;

@Entity
@Table(name = "currency_rate")

public class Currency_Rate {

    //define id field as primary key and @GeneratedValue annotation

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String currency_code_from;
    private String currency_code_to;
    private BigDecimal exchange_rate;

    public Currency_Rate() {
    }

    public Currency_Rate(Integer id, String currency_code_from, String currency_code_to, BigDecimal exchange_rate) {
        this.id = id;
        this.currency_code_from = currency_code_from;
        this.currency_code_to = currency_code_to;
        this.exchange_rate = exchange_rate;
    }

    //create get and set methods for id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCurrency_code_from() {
        return currency_code_from;
    }

    public void setCurrency_code_from(String currency_code_from) {
        this.currency_code_from = currency_code_from;
    }

    public String getCurrency_code_to() {
        return currency_code_to;
    }

    public void setCurrency_code_to(String currency_code_to) {
        this.currency_code_to = currency_code_to;
    }

    //getters and setters for exchange_rate
    public BigDecimal getExchange_rate() {
        return exchange_rate;
    }

    public void setExchange_rate(BigDecimal exchange_rate) {
        this.exchange_rate = exchange_rate;
    }
}
