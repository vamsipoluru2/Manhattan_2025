package com.manhattan.bean;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyObjConfig {

    @Bean
    public List books() {
        return Arrays.asList("The Hobbit", "Harry Potter", "The Alchemist", "The Da Vinci Code");
    }

    @Bean
    public Set novels() {
        Set set = new HashSet();
        set.add("War and Peace");
        set.add("Les Misérables");
        return set;
    }

    @Bean
    public Map bookMap() {
        Map map = new HashMap();
        map.put("c001", "Don Quixote");
        map.put("c002", "Anna Karenina");
        return map;
    }
}
