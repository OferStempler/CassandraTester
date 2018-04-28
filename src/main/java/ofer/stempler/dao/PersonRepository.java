package ofer.stempler.dao;

import ofer.stempler.model.Person;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by ofer on 28/04/18.
 */
@Repository
public interface PersonRepository extends CassandraRepository<Person, String> {

    Optional<Person> findById(String id);
}
