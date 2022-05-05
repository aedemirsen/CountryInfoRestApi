package com.example.countries;
import java.util.List;

public class Country implements Comparable<Country>{
    private final String id;
    private final String name;
    private final String nativeName;
    private final int phoneCode;
    private final String continent;
    private final String capital;
    private final String currency;
    private final List<String> languages;
    private final List<Byte> flag;


    public Country(String id, String name,String nativeName, 
                int phoneCode, String continent, String capital, 
                String currency, List<String> languages,List<Byte> flag) {
        this.id = id;
        this.name = name;
        this.nativeName = nativeName;
        this.phoneCode = phoneCode;
        this.continent = continent;
        this.capital = capital;
        this.currency = currency;
        this.languages = languages;
        this.flag = flag;
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

    public List<Byte> getFlag() {
        return this.flag;
    }



    @Override
    public int compareTo(Country o) {
        int phoneCode
            = ((Country)o).getPhoneCode();
  
        //Ascending order
        return this.phoneCode - phoneCode;
    }




}
