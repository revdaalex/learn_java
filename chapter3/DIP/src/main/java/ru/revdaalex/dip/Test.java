package ru.revdaalex.dip;

import ru.revdaalex.dip.interfaces.Storage;

/**
 * Created by revdaalex on 14.10.2016.
 */
public class Test {

    public static void main(String[] args) {
        PersonValidation personValidation = new PersonValidation();
        Storage storage = new PersonStorage();
        storage.add("Petya", 20, 1);
        storage.add("Masha", 19, 2);
        if (personValidation.checkBeforeEdit(2, storage)) {
            storage.edit("Dasha", 21, 2, 2);
        }
        storage.delete(1);
    }
}