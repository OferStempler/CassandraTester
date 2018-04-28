package ofer.stempler.service;

import ofer.stempler.model.Person;

import java.util.Optional;

/**
 * Created by ofer on 28/04/18.
 */

public interface CrudService {

     void add(Person person);
     void delete(Person person);
     Optional<Person> getPersonById(String id);
}
