package ru.revdaalex.oodocp;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

/**
 * Calculator test.
 * Created by revdaalex on 09.06.2016.
 */
public class CalculatorTest {
    private static Calculator calculator;

    /**
     *Initialization Calculator object.
     */
    @BeforeClass
    public static void runTest(){
        calculator = new Calculator();
    }

    /**
     * Test add method.
     * @throws Exception
     */
    @Test
    public void add() throws Exception {
        double test = calculator.add(30, 27);
        Assert.assertThat(test, is(57.0));
    }

    /**
     * Test sub method.
     * @throws Exception
     */
    @Test
    public void sub() throws Exception {
        double test = calculator.sub(200, 50);
        Assert.assertThat(test, is(150.0));
    }

    /**
     * Test mult method.
     * @throws Exception
     */
    @Test
    public void mult() throws Exception {
        double test = calculator.mult(537, 34);
        Assert.assertThat(test, is(18258.0));
    }

    /**
     * Test div method.
     * @throws Exception
     */
    @Test
    public void div() throws Exception {
        double test = calculator.div(2000, 50);
        Assert.assertThat(test, is(40.0));
    }

}