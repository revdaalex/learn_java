package ru.revdaalex.menu;

import ru.revdaalex.menu.interfaces.IO;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * ConsolIO class.
 * Created by revdaalex on 14.09.2016.
 */
public class ConsolIO implements IO {
    /**
     * PrintStream variable.
     */
    PrintStream out = new PrintStream(System.out);
    /**
     * Scanner variable.
     */
    Scanner scanner = new Scanner(System.in);

    /**
     * Method println from interface.
     * @param value
     */
    public void println(Object value) {
        out.println(value);
    }

    /**
     * Method read from interface.
     * @return
     */
    public String read() {
        return this.scanner.next();
    }
}
