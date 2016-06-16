package ru.revdaalex.oodsrp;

import ru.revdaalex.oodsrp.interfaces.IO;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * ConsoleIO implements IO interface.
 * Created by revdaalex on 15.06.2016.
 */
public class ConsoleIO implements IO {
    /**
     * Scanner variable.
     */
    private final Scanner scanner;
    /**
     * Output variable.
     */
    private final PrintStream out;

    /**
     * ConsoleIO constructor.
     * @param scanner scanner.
     * @param out out.
     */
    public ConsoleIO(final Scanner scanner, final PrintStream out) {
        this.scanner = scanner;
        this.out = out;
    }

    /**
     * Read method.
     * @return user input.
     */
    public String read() {
        return this.scanner.next();
    }

    /**
     * Println method.
     * @param value value.
     */
    public void println(Object value) {
        this.out.println(value);
    }
}
