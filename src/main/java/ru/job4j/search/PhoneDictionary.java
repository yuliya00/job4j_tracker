package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> getSurnames = person -> person.getSurname().contains(key);
        Predicate<Person> getNames = person -> person.getName().contains(key);
        Predicate<Person> getPhones = person -> person.getPhone().contains(key);
        Predicate<Person> getAddress = person -> person.getAddress().contains(key);
        var combine = getSurnames.or(getNames).or(getPhones).or(getAddress);
        var result = new ArrayList<Person>();
        for (var person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
