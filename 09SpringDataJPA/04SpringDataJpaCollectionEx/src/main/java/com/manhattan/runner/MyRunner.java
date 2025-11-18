package com.manhattan.runner;

import java.util.HashSet;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.manhattan.entity.Book;
import com.manhattan.repo.MyRepo;

@Component
public class MyRunner implements CommandLineRunner {
    @Autowired
    MyRepo myrepo;

    @Override
    public void run(String... args) throws Exception {
        Set<String> s = new HashSet<>();
        s.add("Prem");
        s.add("Anu");
        s.add("Saanj");

        List<String> l = new ArrayList<>();
        l.add("Raj");
        l.add("Palak");
        l.add("Sid");

        Map<String, String> m = new HashMap<>();
        m.put("v_101", "Quantsoft");
        m.put("v_102", "Halodoc");

        myrepo.save(new Book(1001, "Java", 234.0, s, l, m));
        System.out.println("Book saved successfully!");
    }
}
 