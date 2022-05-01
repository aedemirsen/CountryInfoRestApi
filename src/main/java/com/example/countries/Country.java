package com.example.countries;

import java.util.List;

public class Country {
    private final String id;
    private final String name;
    private final String nativeName;
    private final int phoneCode;
    private final String continent;
    private final String capital;
    private final String currency;
    private final List<String> languages;


    public Country(String id, String name,String nativeName, 
                int phoneCode, String continent, String capital, 
                String currency, List<String> languages) {
        this.id = id;
        this.name = name;
        this.nativeName = nativeName;
        this.phoneCode = phoneCode;
        this.continent = continent;
        this.capital = capital;
        this.currency = currency;
        this.languages = languages;
    }
    


    public String getId() {
        return this.id;
    }


    public String getName() {
        return this.name;
    }

    public String getNativeName() {
        return this.nativeName;
    }


    public int getPhoneCode() {
        return this.phoneCode;
    }


    public String getContinent() {
        return this.continent;
    }


    public String getCapital() {
        return this.capital;
    }


    public String getCurrency() {
        return this.currency;
    }


    public List<String> getLanguages() {
        return this.languages;
    }




}
