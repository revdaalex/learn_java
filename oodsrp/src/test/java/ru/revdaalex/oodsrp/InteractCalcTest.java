package ru.revdaalex.oodsrp;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * InteractCalc test.
 * Created by revdaalex on 16.06.2016.
 */
public class InteractCalcTest {
    /**
     * Test add.
     */
    @Test
    public void whenTakeSumAndExit(){
        MockIO mockIO = new MockIO(new String[]{"1", "1", "1", "7"});
        Calculator calculator = new Calculator();
        new InteractCalc(calculator, new CalculatorMenu(), mockIO).start();
        Assert.assertThat(calculator.getResult(), is(2.0));
    }

    /**
     * Test subtraction.
     */
    @Test
    public void whenTakeSubAndExit(){
        MockIO mockIO = new MockIO(new String[]{"2", "10", "5", "7"});
        Calculator calculator = new Calculator();
        new InteractCalc(calculator, new CalculatorMenu(), mockIO).start();
        Assert.assertThat(calculator.getResult(), is(5.0));
    }

    /**
     * Test multiplication.
     */
    @Test
    public void whenTakeMultAndExit(){
        MockIO mockIO = new MockIO(new String[]{"3", "10", "2", "7"});
        Calculator calculator = new Calculator();
        new InteractCalc(calculator, new CalculatorMenu(), mockIO).start();
        Assert.assertThat(calculator.getResult(), is(20.0));
    }

    /**
     * Test division.
     */
    @Test
    public void whenTakeDivAndExit(){
        MockIO mockIO = new MockIO(new String[]{"4", "10", "5", "7"});
        Calculator calculator = new Calculator();
        new InteractCalc(calculator, new CalculatorMenu(), mockIO).start();
        Assert.assertThat(calculator.getResult(), is(2.0));
    }

    /**
     * Test add and addition reuse result.
     */
    @Test
    public void whenTakeSumAndSumReuseResultThenExit(){
        MockIO mockIO = new MockIO(new String[]{"1", "10", "5", "5", "5", "1", "7"});
        Calculator calculator = new Calculator();
        new InteractCalc(calculator, new CalculatorMenu(), mockIO).start();
        Assert.assertThat(calculator.getResult(), is(20.0));
    }

    /**
     * Test clear result.
     */
    @Test
    public void whenTakeSumThenClearResultAndExit(){
        MockIO mockIO = new MockIO(new String[]{"1", "100", "30", "6", "7"});
        Calculator calculator = new Calculator();
        new InteractCalc(calculator, new CalculatorMenu(), mockIO).start();
        Assert.assertThat(calculator.getResult(), is(0.0));
    }
}