package com.dynastymasra.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Author   : Dynastymasra
 * Name     : Dimas Ragil T
 * Email    : dynastymasra@gmail.com
 * LinkedIn : http://www.linkedin.com/in/dynastymasra
 * Blogspot : dynastymasra.wordpress.com | dynastymasra.blogspot.com
 */
public class LambdaExamples {
    public static void main(String[] args) {
        System.out.println("-----Runnable Test-----");
        //Anonymous Runnable
        Runnable runOne = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World Java!");
            }
        };
        //Lambda Runnable
        Runnable runTWo = () -> System.out.println("Hello World Lambda!");
        //Run All
        runOne.run();
        runTWo.run();

        List<Person> personList = Person.createShortList();
        //Sort with Inner class
        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (Person p:personList) {
            System.out.println(p.getName());
        }
        //Use Lambda instead
        System.out.println("-----Lambda sorted ASC name-----");
        Collections.sort(personList, (p1, p2) -> p1.getName().compareTo(p2.getName()));
        for (Person p:personList) {
            System.out.println(p.getName());
        }
        System.out.println("-----Lambda sorted DSC name-----");
        Collections.sort(personList, (p1, p2) -> p2.getName().compareTo(p1.getName()));
        for (Person p:personList) {
            System.out.println(p.getName());
        }
    }
}
