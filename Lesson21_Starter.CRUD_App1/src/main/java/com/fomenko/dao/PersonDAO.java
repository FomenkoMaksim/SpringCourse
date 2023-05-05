package com.fomenko.dao;

import com.fomenko.models.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;
//    private List<Person> people;

//    {
//        people = new ArrayList<>();
//
//        people.add(new Person(++PEOPLE_COUNT, "Maksim", 26, "maksim@gmail.com"));
//        people.add(new Person(++PEOPLE_COUNT, "Ksenia", 24, "ksenia@Gmail,com"));
//        people.add(new Person(++PEOPLE_COUNT, "Mark", 30, "mark@gmail.com"));
//        people.add(new Person(++PEOPLE_COUNT, "John", 10, "john@gmail.com"));
//    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
//        return people.stream().filter(people -> people.getId() == id).findAny().orElse(null);
    }

    public void save(Person person) {
        person.setId(++PEOPLE_COUNT);
        people.add(person);
    }

    public void update(int id, Person updatedPerson) {
//        Person personToBeUpdated = show(id);
//
//        personToBeUpdated.setName(updatedPerson.getName());
//        personToBeUpdated.setAge(updatedPerson.getAge());
//        personToBeUpdated.setEmail(updatedPerson.getEmail());
    }

    public void delete(int id) {
        people.removeIf(person -> person.getId() == id);
    }
}
