package com.wrappers;

import com.oop.lesson7.Person;
import com.oop.lesson8.Bugs;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        GenericModule.Professions<String> java = new GenericModule.Professions<>("Teacher");
        GenericModule.Professions<Integer> java1 = new GenericModule.Professions<>(45);
        System.out.println(java);
        System.out.println(java1);
        GenericModule.MaxValueHolder<Person> f = new GenericModule.MaxValueHolder<>(null, null);
        GenericModule.MaxValueHolder<Bugs> f1 = new GenericModule.MaxValueHolder<>(null, null);
        f.put(new Person());
        f1.put(new Bugs());
    }
}
