package ru.revdaalex.dip;

import ru.revdaalex.dip.interfaces.Storage;

import java.util.HashMap;
import java.util.Map;

/**
 * Class PersonStorage.
 * Created by revdaalex on 14.10.2016.
 */
public class PersonStorage implements Storage {
    /**
     * Variable personMap.
     */
    private Map<Integer, Person> personMap = new HashMap<Integer, Person>();

    /**
     * Get method from interface.
     * @return personMap.
     */
    public Map<Integer, Person> getPersonMap() {
        return personMap;
    }

    /**
     * Method add from interface.
     * @param name name.
     * @param age age.
     * @param id id.
     */
    public void add(String name, int age, int id) {
        Person person = new Person(name, age, id);
        personMap.put(id, person);
    }

    /**
     * Method edit from interface.
     * @param name name.
     * @param age age.
     * @param oldId oldId.
     * @param newId newId.
     */
    public void edit(String name, int age, int oldId, int newId) {
        personMap.get(oldId).setName(name);
        personMap.get(oldId).setAge(age);
        personMap.get(oldId).setId(newId);
        personMap.put(newId, personMap.get(oldId));
        if (oldId != newId){
            personMap.remove(oldId);
        }
    }

    /**
     * Method delete from interface.
     * @param id id.
     */
    public void delete(int id) {
        personMap.remove(id);
    }
}