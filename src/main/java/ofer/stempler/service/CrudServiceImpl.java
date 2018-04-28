package ofer.stempler.service;

import ofer.stempler.dao.PersonRepository;
import ofer.stempler.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by ofer on 28/04/18.
 */
@Service
public class CrudServiceImpl implements CrudService {
    @Autowired
    PersonRepository personRepository;

    @Override
    public void add(Person person) {
        personRepository.save(person);
    }

    @Override
    public void delete(Person person) {
        personRepository.delete(person);
    }

    @Override
    public Optional<Person> getPersonById(String id) {
        return personRepository.findById(id);
    }
}
