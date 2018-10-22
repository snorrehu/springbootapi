package com.springbootorm.api.person;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person,Integer> {
    //public List<Person> findBy(String teamid);
}
