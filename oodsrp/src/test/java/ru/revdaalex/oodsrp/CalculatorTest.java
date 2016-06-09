package ru.revdaalex.oodsrp;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by revdaalex on 09.06.2016.
 */
public class CalculatorTest {
    Calculator calculator= new Calculator();

    @Test
    public void add() throws Exception {
        int test = calculator.add(30, 27);
        Assert.assertEquals(test, 57);
    }

    @Test
    public void sub() throws Exception {
        int test = calculator.sub(200, 50);
        Assert.assertEquals(test, 150);
    }

    @Test
    public void mult() throws Exception {
        int test = calculator.mult(537, 34);
        Assert.assertEquals(test, 18258);
    }

    @Test
    public void div() throws Exception {
        int test = calculator.div(2000, 50);
        Assert.assertEquals(test, 40);
    }

}