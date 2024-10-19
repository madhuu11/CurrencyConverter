package com.example.CurrencyExchangeRate.Entity;
//define the class Currency for id, currency_code, currency_name, country_name with annotations and required imports like jarkata persistence
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "currency")
public class Currency {

    //define id field as primary key and @GeneratedValue annotation

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String currency_code;
    private String currency_name;
    private String country_name;

    public Currency() {
    }

    public Currency(Integer id,String currency_code, String currency_name, String country_name) {
        this.id = id;
        this.currency_code = currency_code;
        this.currency_name = currency_name;
        this.country_name = country_name;
    }
    //create get and set methods for id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCurrency_code() {
        return currency_code;
    }

    public void setCurrency_code(String currency_code) {
        this.currency_code = currency_code;
    }

    public String getCurrency_name() {
        return currency_name;
    }

    public void setCurrency_name(String currency_name) {
        this.currency_name = currency_name;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }
}
