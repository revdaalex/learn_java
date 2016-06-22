package ru.revdaalex.oodocp;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

/**
 * Test EngineeringCalc class.
 * Created by revdaalex on 22.06.2016.
 */
public class EngineeringCalcTest {
    @Test
    public void testSin100Degree(){
        MockIO mockIO = new MockIO(new String[]{"7", "100", "1", "8"});
        Calculator calculator = new Calculator();
        new EngineeringCalc(calculator,  mockIO).start();
        Assert.assertThat(calculator.getResult(), is(0.984807753012208));
    }

    @Test
    public void testCos100Degree(){
        MockIO mockIO = new MockIO(new String[]{"7", "100", "2", "8"});
        Calculator calculator = new Calculator();
        new EngineeringCalc(calculator,  mockIO).start();
        Assert.assertThat(calculator.getResult(), is(-0.1736481776669303));
    }

    @Test
    public void testTan100Degree(){
        MockIO mockIO = new MockIO(new String[]{"7", "100", "3", "8"});
        Calculator calculator = new Calculator();
        new EngineeringCalc(calculator,  mockIO).start();
        Assert.assertThat(calculator.getResult(), is(-5.671281819617711));
    }

}