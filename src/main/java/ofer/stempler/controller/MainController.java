package ofer.stempler.controller;

import ofer.stempler.model.Person;
import ofer.stempler.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

/**
 * Created by ofer on 28/04/18.
 */
//1. Install Cassandra
//2. run service : sudo systemctl start/stop cassandra.service
//3. verify Cassandra is running: sudo nodetool status
//4. enter cqlsh:  cqlsh
//5. Create node with keySpace (here called "test": use test
@Controller
public class MainController {

    @Autowired
    CrudService service;

    @RequestMapping (value = "/test", method = RequestMethod.GET)
    public @ResponseBody String test(){
        return "Cassandra app is up";
    }


    @RequestMapping (value = "/add")
    public @ResponseBody String addPerson(@RequestBody Person person){
        service.add(person);
        return "Person added";
    }
    @RequestMapping (value = "/delete")
    public void delete(@RequestBody  Person person){
        service.delete(person);

    } @RequestMapping (value = "/get", method = RequestMethod.GET)
    public @ResponseBody Optional<Person> getPerson(String id){
        return service.getPersonById(id);
    }
}
