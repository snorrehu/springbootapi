package com.springbootorm.api.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    //Create
    public void addPerson(Person person){
        personRepository.save(person);
    }

    //Read all
    public List<Person> getAllPersons(){
        List<Person> persons = new ArrayList<>();
        personRepository.findAll().forEach(persons::add);
        return persons;
    }

    //Read one
    public ArrayList<Person> getPerson(Integer id){
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(personRepository.findById(id).get());
        return personList;
    }

    //Update
    public void updatePerson(Person person, Integer id) {
        personRepository.save(person);
    }

    //Delete
    public void deletePerson(Integer id) {
        personRepository.deleteById(id);
    }

    //Check if exists
    public boolean checkIfExists(Integer id){
        return personRepository.existsById(id);
    }

}