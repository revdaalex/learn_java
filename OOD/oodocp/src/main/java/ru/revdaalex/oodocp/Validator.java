package ru.revdaalex.oodocp;

import ru.revdaalex.oodocp.interfaces.IO;

/**
 * Number validation.
 * Created by revdaalex on 15.06.2016.
 */
public class Validator {
    private final IO io;

    public Validator(IO io) {
        this.io = io;
    }

    public double getDouble(String message) {
        boolean check = false;
        do {
            try {
                System.out.println(message);
                return Double.valueOf(this.io.read());
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не целое число\nПопробуйте еще раз.");
                check = true;
            }
        } while (check);
        throw new UnsupportedOperationException();
    }
}
