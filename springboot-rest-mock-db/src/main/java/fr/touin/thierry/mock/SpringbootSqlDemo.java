package fr.touin.thierry.mock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.touin.thierry.mock.dao.PersonDao;
import fr.touin.thierry.mock.domain.Person;
import fr.touin.thierry.mock.domain.PersonEntity;
import fr.touin.thierry.mock.domain.PersonRepository;

@SpringBootApplication
public class SpringbootSqlDemo implements CommandLineRunner{

  Logger logger = LoggerFactory.getLogger(SpringbootSqlDemo.class);
  
  @Autowired
  PersonDao personDao;
  
  @Autowired
  PersonRepository personRepository;
  
  public void run(String... args) {
    Person person = new Person();
    person.setFirstName("FName");
    person.setLastName("LName");
    person.setAge(20);
    person.setPlace("Place");
    
    if ( personDao.addPerson(person) > 0){
      logger.info("Person saved successfully");
    }
    
    for(Person p : personDao.getAllPerson()){
      logger.info(p.toString());
    }
    
    logger.info("Using JPA for insert and find");
    PersonEntity personEntity = new PersonEntity("fName2", "lName2", 24, "Bangalore");
    personEntity = personRepository.save(personEntity);
    logger.info("Person with ID: " + personEntity.getId() + " saved successfully");
    
    for ( PersonEntity pEntity : personRepository.findAll()){
      logger.info(pEntity.toString());
    }
  }
  
  public static void main(String[] args) {
    SpringApplication.run(SpringbootSqlDemo.class, args);
    
  }
 
}
