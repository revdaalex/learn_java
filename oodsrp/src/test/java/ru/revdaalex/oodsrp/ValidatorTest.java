package ru.revdaalex.oodsrp;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Test Validator class.
 * Created by RevdaAlex on 19.06.2016.
 */
public class ValidatorTest {
    /**
     * Test validation user input.
     */
    @Test
    public void userInputVerificationNumber(){
        MockIO mockIO = new MockIO(new String[]{"1.7"});
        Validator validator = new Validator(mockIO);
        Assert.assertThat(validator.getDouble("Введите число"), is(1.7));
    }

}