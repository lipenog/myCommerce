package com.example.mycommerce.services;

import com.example.mycommerce.user.Person;
import com.example.mycommerce.user.User;

import java.util.HashSet;
import java.util.Set;

public class UserService {
    private Set<Person> people;
    private static UserService singleton;

    private UserService(){
        people = new HashSet<>();
    }

    public static UserService getInstance(){
        if(singleton == null){
            singleton = new UserService();
        }
        return singleton;
    }
    public Person findById(String personId){
        for(Person person : people){
            if(person.getId() == personId){
                return person;
            }
        }
        return null;
    }
    public void addUser(String personId, String firstName, String lastName){
        if(findById(personId) != null){
            return;
        }
        people.add(new User(personId, firstName, lastName));
    }

    public void removePerson(String personId){
        if(findById(personId) == null){
            return;
        }
        people.remove(findById(personId));
    }

    public void logPeople(){
        for(Person person: people){
            System.out.println(person);
        }
    }
}
