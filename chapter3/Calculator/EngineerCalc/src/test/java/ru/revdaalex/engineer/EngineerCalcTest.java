package ru.revdaalex.engineer;

import org.junit.Assert;
import org.junit.Test;
import ru.revdaalex.calculator.Calculator;
import ru.revdaalex.calculator.MockIO;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 *
 * Created by RevdaAlex on 26.06.2016.
 */
public class EngineerCalcTest {
    @Test
    public void whenTakeSinusAndExit(){
        MockIO mockIO = new MockIO(new String[]{"2", "1", "100", "4", "3"});
        Calculator calculator = new Calculator();
        new EngineerCalc(calculator,  mockIO).start();
        Assert.assertThat(calculator.getResult(), is(0.984807753012208));
    }

    @Test
    public void whenTakeCosineAndExit(){
        MockIO mockIO = new MockIO(new String[]{"2", "2", "100", "4", "3"});
        Calculator calculator = new Calculator();
        new EngineerCalc(calculator,  mockIO).start();
        Assert.assertThat(calculator.getResult(), is(-0.1736481776669303));
    }

    @Test
    public void whenTakeTangentAndExit(){
        MockIO mockIO = new MockIO(new String[]{"2", "3", "100", "4", "3"});
        Calculator calculator = new Calculator();
        new EngineerCalc(calculator,  mockIO).start();
        Assert.assertThat(calculator.getResult(), is(-5.671281819617711));
    }
}