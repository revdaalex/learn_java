package ru.revdaalex.iteratorEvenNumbers;

import java.util.Iterator;

/**
 * Iterator even numbers.
 * Created by revdaalex on 31.01.2017.
 */
public class IteratorEvenNumbers implements Iterator{

    /**
     * Array values.
     */
    private final int[] values;
    /**
     * Index of array.
     */
    private int index = 0;

    /**
     * Main constructor.
     * @param values
     */
    public IteratorEvenNumbers(final int[] values) {
        this.values = values;
    }

    /**
     * Implement method hasNext.
     * @return boolean value.
     */
    public boolean hasNext() {
        return values.length > index;
    }

    /**
     * implement method next.
     * @return Object next.
     */
    public Object next() {
        int value = values[index++];
        if (value%2 == 0){
            return value;
        }
        else return next();
    }
}