package com.example.countries;
import java.util.List;

public class Country implements Comparable<Country>{
    final String id;
    final String name;
    final String nativeName;
    final int phoneCode;
    final String continent;
    final String capital;
    final String currency;
    final List<String> languages;
    final List<Byte> flag;


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

    @Override
    public int compareTo(Country o) {
        int phoneCode
            = ((Country)o).phoneCode;
  
        //Ascending order
        return this.phoneCode - phoneCode;
    }
}
