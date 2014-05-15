package com.dynastymasra.lambda;

import java.util.List;
import java.util.OptionalDouble;

/**
 * Author   : Dynastymasra
 * Name     : Dimas Ragil T
 * Email    : dynastymasra@gmail.com
 * LinkedIn : http://www.linkedin.com/in/dynastymasra
 * Blogspot : dynastymasra.wordpress.com | dynastymasra.blogspot.com
 */
public class CalculatingWithMap {
    public static void main(String[] args) {
        List<Person> personList = Person.createShortList();

        SearchCriteria searchCriteria = SearchCriteria.getInstance();

        System.out.println("-----Old Style-----");
        Integer sum = 0;
        Integer count = 0;

        for (Person person:personList) {
            if (person.getAge() >= 23 && person.getAge() <= 65) {
                sum = sum + person.getAge();
                count++;
            }
        }

        long average = sum / count;
        System.out.println("Total Ages: " + sum);
        System.out.println("Total Average : " + average);
        System.out.println("-----Lambda Style-----");

        Integer totalAge = personList.parallelStream().filter(searchCriteria.getCriteria("allPilots")).mapToInt(p -> p.getAge()).sum();
        System.out.println("-----Get Average Age-----");
        OptionalDouble averageAge = personList.parallelStream().filter(searchCriteria.getCriteria("allPilots")).mapToDouble(p -> p.getAge()).average();
        System.out.println("Total Ages : " + totalAge);
        System.out.println("Average Age : " + averageAge);
    }
}
