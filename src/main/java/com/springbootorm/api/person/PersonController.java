package com.springbootorm.api.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    //Request: Create
    @RequestMapping(method = RequestMethod.POST, value = "/persons")
    public void createPerson(@RequestBody Person person){
        personService.addPerson(person);
    }

    //Request: Read all
    @RequestMapping("/persons")
    public List<Person> getAllPersons(){
        return personService.getAllPersons();
    }

    //Request: Read one by id
    @RequestMapping("/persons/{id}")
    public Person readPerson(@PathVariable Integer id){
        System.out.println(personService.getPerson(id).getDate_of_birth());
        return personService.getPerson(id);
    }

    //Request: Update
    @RequestMapping(method = RequestMethod.PUT, value = "/persons/{id}")
    public void updatePerson(@RequestBody Person person, @PathVariable Integer id){
        personService.updatePerson(person,id);
    }

    //Request: Delete by id
    @RequestMapping(method = RequestMethod.DELETE, value = "/persons/{id}")
    public void deletePerson(@PathVariable Integer id){
        /*
        Person undefinedPerson = new Person();
        undefinedPerson.setAddress_id(null);
        undefinedPerson.setFirst_name("undefined");
        undefinedPerson.setLast_name("undefined");
        undefinedPerson.setPerson_id(id);
        Date date = new Date(1111,11,11);
        undefinedPerson.setDate_of_birth(date);
        personService.updatePerson(undefinedPerson,id);
        */
    }

}
