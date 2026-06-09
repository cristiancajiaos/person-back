package com.example.personback.controller;

import com.example.personback.entity.Person;
import com.example.personback.service.PersonService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/v1/persons")
public class PersonController {

  @Autowired
  private PersonService personService;

  @PostMapping
  public Person createOrUpdatePerson (@RequestBody Person person) {
    return personService.createOrUpdatePerson(person);
  }

  @GetMapping
  public List<Person> getAllPersons() {
    return personService.getAllPersons();
  }

  @GetMapping("{id}")
  public Optional<Person> getPersonById(@PathVariable("id") Long id) {
    return personService.getPersonById(id);
  }
}
