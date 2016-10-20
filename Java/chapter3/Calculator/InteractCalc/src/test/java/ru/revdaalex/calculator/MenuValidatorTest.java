package ru.revdaalex.calculator;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

/**
 * Test MenuValidator.
 * Created by RevdaAlex on 19.06.2016.
 */
public class MenuValidatorTest {
    /**
     * Test validMainMenu() method.
     */
    @Test
    public void checkWhenTheUserSelectsMenuItem(){
        MockIO mockIO = new MockIO(new String[]{"1"});
        MenuValidator menuValidator = new MenuValidator(mockIO);
        Assert.assertThat(menuValidator.validMainMenu(), is(1));
    }

    /**
     * Test validCalcResultMenu() method.
     */
    @Test
    public void checkWhenTheUserSelectsOperator(){
        MockIO mockIO = new MockIO(new String[]{"3"});
        MenuValidator menuValidator = new MenuValidator(mockIO);
        Assert.assertThat(menuValidator.validCalcResultMenu(), is(3));
    }

    /**
     * Test validEngineerMenu() method.
     */
    @Test
    public void checkWhenTheUserSelectEngineerMenu(){
        MockIO mockIO = new MockIO(new String[]{"1"});
        MenuValidator menuValidator = new MenuValidator(mockIO);
        Assert.assertThat(menuValidator.validEngineerMenu(), is(1));
    }

    /**
     * Test validEngineerOperation() method.
     */
    @Test
    public void checkWhenUserSelectEngineerOperator(){
        MockIO mockIO = new MockIO(new String[]{"3"});
        MenuValidator menuValidator = new MenuValidator(mockIO);
        Assert.assertThat(menuValidator.validEngineerOperation(), is(3));
    }

}