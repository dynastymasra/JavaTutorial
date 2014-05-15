package com.dynastymasra.lambda;

import java.util.List;
import java.util.function.Predicate;

/**
 * Author   : Dynastymasra
 * Name     : Dimas Ragil T
 * Email    : dynastymasra@gmail.com
 * LinkedIn : http://www.linkedin.com/in/dynastymasra
 * Blogspot : dynastymasra.wordpress.com | dynastymasra.blogspot.com
 */
public class ContactLambda {
    public void phoneContacts(List<Person> personList, Predicate<Person> personPredicate) {
        for (Person person:personList) {
            if (personPredicate.test(person)) {
                call(person);
            }
        }
    }

    public void emailContacts(List<Person> personList, Predicate<Person> personPredicate) {
        for (Person person:personList) {
            if (personPredicate.test(person)) {
                email(person);
            }
        }
    }

    public void mailContact(List<Person> personList, Predicate<Person> personPredicate) {
        for (Person person:personList) {
            if (personPredicate.test(person)) {
                mail(person);
            }
        }
    }

    public void call(Person person) {
        System.out.println("Calling " + person.getName() + " age " + person.getAge() + " at " + person.getPhone());
    }

    public void email(Person person) {
        System.out.println("Calling " + person.getName() + " age " + person.getAge() + " at " + person.getEmail());
    }

    public void mail(Person person) {
        System.out.println("Calling " + person.getName() + " age " + person.getAge() + " at " + person.getAddress());
    }
}
