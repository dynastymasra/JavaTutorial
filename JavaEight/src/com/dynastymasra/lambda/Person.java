package com.dynastymasra.lambda;

import com.dynastymasra.lambda.enums.Gender;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Author   : Dynastymasra
 * Name     : Dimas Ragil T
 * Email    : dynastymasra@gmail.com
 * LinkedIn : http://www.linkedin.com/in/dynastymasra
 * Blogspot : dynastymasra.wordpress.com | dynastymasra.blogspot.com
 */
public class Person {
    private String name;
    private String midName;
    private String lastName;
    private Integer age;
    private Gender gender;
    private String email;
    private String phone;
    private String address;

    public Person(String name, String midName, String lastName, Integer age, Gender gender, String email, String phone, String address) {
        this.name = name;
        this.midName = midName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getMidName() {
        return midName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public static List<Person> createShortList() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Atran", "Ahmad", "Zala", 20, Gender.Male, "Gmail", "123", "Yogyakarta"));
        personList.add(new Person("Lisa", "Aisyah", "Zala", 21, Gender.Female, "Gmail", "123", "Yogyakarta"));
        personList.add(new Person("Dimas", "Ragil T", "Triatmaja", 22, Gender.Male, "Gmail", "123", "Yogyakarta"));
        personList.add(new Person("Saladin", "Al", "Zaid", 23, Gender.Male, "Gmail", "123", "Yogyakarta"));
        personList.add(new Person("Lacas", "", "Clyne", 24, Gender.Female, "Gmail", "123", "Yogyakarta"));

        return personList;
    }

    public String printCustom(Function<Person, String> f) {
        return f.apply(this);
    }

    public void print() {
        System.out.println("Name :" + this.getName() + " " + this.getMidName() + " " + this.getLastName() + "\nAge : " + this.getAge() + "\nGender : " + this.getGender() + "\nEmail :" + this.getEmail() + "\nPhone : " + this.getPhone() + "\nAddress : " + this.getAddress());
    }
}
