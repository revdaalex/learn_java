package ru.revdaalex.dip;

import org.junit.*;
import org.junit.Test;
import ru.revdaalex.dip.interfaces.Storage;
import ru.revdaalex.dip.interfaces.Validation;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Class PersonStorageTest.
 * Created by revdaalex on 15.10.2016.
 */
public class PersonStorageTest {

    @Test
    public void testMethodAdd(){
        Storage personStorage = new PersonStorage();
        String result = "Alex";
        personStorage.add("Alex", 25, 1);
        Assert.assertThat(personStorage.getPersonMap().get(1).getName(), is(result));
    }

    @Test
    public void testMethodDelete(){
        Storage personStorage = new PersonStorage();
        boolean result = false;
        personStorage.add("Alex", 25, 1);
        personStorage.delete(1);
        Assert.assertThat(personStorage.getPersonMap().containsKey(1), is(result));
    }

    @Test
    public void checkPersonBeforeEdit(){
        Storage personStorage = new PersonStorage();
        Validation validation = new PersonValidation();
        boolean result = true;
        personStorage.add("Alex", 25, 1);
        Assert.assertThat(validation.checkBeforeEdit(1, personStorage), is(result));
    }

    @Test
    public void testEditMethod(){
        Storage personStorage = new PersonStorage();
        personStorage.add("Alex", 25, 1);
        personStorage.edit("Bob", 31, 1, 2);
        String result = "Bob";
        Assert.assertThat(personStorage.getPersonMap().get(2).getName(), is(result));
    }

}