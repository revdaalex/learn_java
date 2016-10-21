package ru.revdaalex.calculator;

import ru.revdaalex.calculator.interfaces.IO;

/**
 * MockIO implements IO interface.
 * Created by revdaalex on 16.06.2016.
 */
public class MockIO implements IO {
    /**
     * Answers index.
     */
    private int index = 0;
    /**
     * Answers collection.
     */
    private final String[] answers;
    /**
     * Output variable.
     */
    private final StringBuilder out = new StringBuilder();

    /**
     * MockIO constructor.
     * @param answers answers.
     */
    public MockIO(String[] answers) {
        this.answers = answers;
    }

    /**
     * Method read answers.
     * @return String answers.
     */
    public String read() {
        return this.answers[index++];
    }

    /**
     * Println method
     * @param value value.
     */
    public void println(Object value) {
        this.out.append(value).append("\n");
    }

    /**
     * Get output.
     * @return String output.
     */
    public String getOut(){
        return this.out.toString();
    }
}
