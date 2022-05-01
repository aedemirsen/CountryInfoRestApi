package com.example.countries;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @GetMapping("countries")
	public List<Country> countries() throws IOException {
        List<Country> countries = new ArrayList<>();

        //--test
        // List<String> languages = new ArrayList<>();
        // languages.add("tr");
        // Country country = new Country("TR", "Turkey", "Türkiye", 90,
        //                     "AS", "Ankara", "TRY", languages);
        // countries.add(country);

        //parse json to country models and add them to list
        File jsonFile = new File("src/asset/countries.json"); 
        Map<String,Map<String,Object>> result =
                new ObjectMapper().readValue(jsonFile, HashMap.class);
        for (String id : result.keySet()) {
            Map<String,Object> m = result.get(id);
            String name = m.get("name").toString();
            String nativeName = m.get("native").toString();
            int phone;
            try{
                phone = Integer.parseInt(m.get("phone").toString());
            }
            catch(NumberFormatException e){
                phone = -999;
            }
            String continent = m.get("continent").toString();
            String capital = m.get("capital").toString();
            String currency = m.get("currency").toString();
            List<String> languages = (ArrayList<String>)m.get("languages");
            
            Country c = new Country(id,name,nativeName,phone,continent,capital,currency,languages);
            countries.add(c);
        }

        return countries;
    }
}