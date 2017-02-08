package ru.revdaalex.iteratorEvenNumbers;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Test methods in class IteratorEvenNumber.
 * Created by revdaalex on 06.02.2017.
 */
public class IteratorEvenNumbersTest {

    @Test
    public void whenGetNextCallShouldReturnEvenNumber(){
        IteratorEvenNumbers it = new IteratorEvenNumbers(new int[]{1, 2, 3, 4, 5});

        it.next();
        int result = (int) it.next();

        assertThat(result, is(4));
    }

    @Test
    public void checkNextPositionValueIsEvenNumber(){
        IteratorEvenNumbers it = new IteratorEvenNumbers(new int[]{2, 4});

        it.next();
        it.hasNext();

        boolean result = it.hasNext();

        assertThat(result, is(true));
    }
}