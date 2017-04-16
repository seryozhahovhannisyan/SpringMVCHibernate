package seryozha.hovhannisyan.spring.dao;

import seryozha.hovhannisyan.spring.model.Person;

import java.util.List;

/**
 * Created by User on 17.04.2017.
 */
public interface PersonDAO {

    public void addPerson(Person p);
    public void updatePerson(Person p);
    public List<Person> listPersons();
    public Person getPersonById(int id);
    public void removePerson(int id);
}