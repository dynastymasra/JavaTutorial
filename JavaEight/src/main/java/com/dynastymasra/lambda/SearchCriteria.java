package com.dynastymasra.lambda;

import com.dynastymasra.lambda.enums.Gender;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

/**
 * Author   : Dynastymasra
 * Name     : Dimas Ragil T
 * Email    : dynastymasra@gmail.com
 * LinkedIn : http://www.linkedin.com/in/dynastymasra
 * Blogspot : dynastymasra.wordpress.com | dynastymasra.blogspot.com
 */
public class SearchCriteria {
    private Map<String, Predicate<Person>> map = new HashMap<>();

    public SearchCriteria() {
        initSearchMap();
    }

    private void initSearchMap() {
        Predicate<Person> allDrivers = p -> p.getAge() >= 16;
        Predicate<Person> allDraf = p -> p.getAge() >= 18 && p.getAge() <= 25 && p.getGender() == Gender.Male;
        Predicate<Person> allPilots = p -> p.getAge() >= 23 && p.getAge() <= 65;

        map.put("allDrivers", allDrivers);
        map.put("allDraf", allDraf);
        map.put("allPilots", allPilots);
    }

    public Predicate<Person> getCriteria(String s) {
        Predicate<Person> personPredicate;

        personPredicate = map.get(s);
        if (personPredicate == null) {
            System.out.println("Search not Found....");
            System.exit(0);
        }

        return personPredicate;
    }

    public static SearchCriteria getInstance() {
        return new SearchCriteria();
    }
}
