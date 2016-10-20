package ru.revdaalex.dip.interfaces;

import ru.revdaalex.dip.Person;

import java.util.Map;

/**
 * Created by revdaalex on 14.10.2016.
 */
public interface Storage {

    Map<Integer, Person> getPersonMap();

    void add(String name, int age, int id);

    void edit(String name, int age, int oldId, int newId);

    void delete(int id);
}
