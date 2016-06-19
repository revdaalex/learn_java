package ru.revdaalex.oodsrp;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

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

}