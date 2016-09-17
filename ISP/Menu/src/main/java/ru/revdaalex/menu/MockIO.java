package ru.revdaalex.menu;

import ru.revdaalex.menu.interfaces.IO;

/**
 * MockIO class.
 * Created by revdaalex on 15.09.2016.
 */
public class MockIO implements IO {
    /**
     * Int index variable.
     */
    private int index = 0;
    /**
     * Answers[] variable.
     */
    private String[] answers;
    /**
     * StringBuilder out variable.
     */
    private final StringBuilder out = new StringBuilder();

    /**
     * Main constructor.
     * @param answers
     */
    public MockIO(String[] answers) {
        this.answers = answers;
    }

    /**
     * Read method from interface.
     * @return
     */
    public String read() {
        return this.answers[index++];
    }

    /**
     * Println method from interface.
     * @param value
     */
    public void println(Object value) {
        this.out.append(value).append("\n");
    }

    public String getOut(){
        return this.out.toString();
    }
}
