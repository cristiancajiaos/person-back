package com.example.personback.service;

import com.example.personback.entity.Person;
import com.example.personback.repository.PersonRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

  @Autowired
  private PersonRepository personRepository;

  public Person createOrUpdatePerson(Person person) {
    return personRepository.save(person);
  }

  public List<Person> getAllPersons() {
    return personRepository.findAll();
  }

  public Optional<Person> getPersonById(Long id) {
    return personRepository.findById(id);
  }

  public void deletePersonById(Long id) {
    personRepository.deleteById(id);
  }

}
