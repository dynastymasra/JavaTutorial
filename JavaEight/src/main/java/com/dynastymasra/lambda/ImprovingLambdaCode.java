package com.dynastymasra.lambda;

import com.dynastymasra.lambda.enums.Gender;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Author   : Dynastymasra
 * Name     : Dimas Ragil T
 * Email    : dynastymasra@gmail.com
 * LinkedIn : http://www.linkedin.com/in/dynastymasra
 * Blogspot : dynastymasra.wordpress.com | dynastymasra.blogspot.com
 */
public class ImprovingLambdaCode {
    public static void main(String[] args) {
        List<Person> personList = Person.createShortList();
        ContactLambda contactLambda = new ContactLambda();

        Predicate<Person> allDrivers = p -> p.getAge() >= 16;
        Predicate<Person> allDraf = p -> p.getAge() >= 18 && p.getAge() <= 25 && p.getGender() == Gender.Male;
        Predicate<Person> allPilots = p -> p.getAge() >= 23 && p.getAge() <= 65;

        System.out.println("-----Phone-----");
        contactLambda.phoneContacts(personList, allDrivers);
        System.out.println("-----Email-----");
        contactLambda.emailContacts(personList, allDraf);
        System.out.println("-----Mail-----");
        contactLambda.mailContact(personList, allPilots);

        //print custom
        System.out.println("-----Custom List-----");
        for (Person person:personList) {
            System.out.println(person.printCustom(p -> "Name : " + p.getName() + " " + p.getMidName() + " " + p.getLastName()));
        }

        //forEach
        System.out.println("-----For Each Print-----");
        personList.forEach(p -> p.print());
        System.out.println("-----For Each Print 2-----");
        personList.forEach(Person::print);
        System.out.println("-----For Each Custom Print-----");
        personList.forEach(p -> System.out.println(p.printCustom(r -> "Name : " + r.getName())));

        //Filtering
        SearchCriteria searchCriteria = SearchCriteria.getInstance();

        System.out.println("-----Filtering 1-----");
        personList.parallelStream().filter(searchCriteria.getCriteria("allPilots")).forEach(p -> p.print());
        System.out.println("-----Filtering 2-----");
        personList.parallelStream().filter(searchCriteria.getCriteria("allDraf")).forEach(p -> p.print());
        System.out.println("-----Filtering 3-----");
        personList.parallelStream().filter(searchCriteria.getCriteria("allPilots")).forEach(p -> p.print());

        System.out.println("-----Make a New List after filtering-----");
        List<Person> persons = personList.parallelStream().filter(searchCriteria.getCriteria("allPilots")).collect(Collectors.toList());
        persons.parallelStream().forEach(p -> p.print());
    }
}
