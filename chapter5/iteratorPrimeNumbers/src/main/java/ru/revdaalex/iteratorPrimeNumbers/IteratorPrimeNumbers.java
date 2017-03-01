package ru.revdaalex.iteratorPrimeNumbers;

import java.util.Iterator;

/**
 * IteratorPrimeNumbers class.
 * Created by revdaalex on 28.02.2017.
 */
public class IteratorPrimeNumbers implements Iterator {

    /**
     * Array values.
     */
    private final int[] values;
    /**
     * Index of array.
     */
    private int index = 0;

    public IteratorPrimeNumbers(final int[] values) {
        this.values = values;
    }

    /**
     * Override method hasNext.
     * @return boolean value.
     */
    @Override
    public boolean hasNext() {
        if (values.length > index){
            if(values[index]/values[index] == 1 && values[index]/1 == values[index]) {
                if (values[index]%2 != 0 && values[index] != 1 || values[index] == 2)
                    return true;
            }
        }
        return false;
    }

    /**
     * Override method next.
     * @return Object value.
     */
    @Override
    public Object next() {
        int value = values[index++];
        if (value / value == 1 && value / 1 == value && value%2 != 0 && value != 1 || value == 2)
                return value;

        else return next();
    }
}
