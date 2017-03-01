package ru.revdaalex.iteratorPrimeNumbers;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Test methods from class IteratorPrimeNumbers.
 * Created by revdaalex on 01.03.2017.
 */
public class IteratorPrimeNumbersTest {


    @Test
    public void whenGetNextCallShouldReturnPrimeNumber(){
        IteratorPrimeNumbers it = new IteratorPrimeNumbers(new int[]{1,2,3,4});

        it.next();
        int result = (Integer) it.next();

        assertThat(result, is(3));
    }

    @Test
    public void checkNextPositionValueIsPrimeNumber(){
        IteratorPrimeNumbers it = new IteratorPrimeNumbers(new int[]{4,6,8});

        it.hasNext();
        boolean result = it.hasNext();

        assertThat(result, is(false));
    }

}