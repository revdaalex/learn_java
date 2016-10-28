package ru.revdaalex.regex;

import org.junit.Assert;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * SimpleGeneratorTest class.
 * Created by revdaalex on 27.10.2016.
 */
public class SimpleGeneratorTest {
    @Test
    public void generateWithCorrectArg(){
        Template template = new SimpleGenerator();
        String text = "I am a ${name}, Who are ${subject}?";
        Map<String, String> map = new HashMap();
        map.put("name", "Alex");
        map.put("subject", "you");
        String checked = "I am a Alex, Who are you?";

        String result = template.generate(text, map);

        Assert.assertThat(result, is(checked));
    }

    @Test(expected = IllegalArgumentException.class)
    public void generateWithWrongArgsWhenValuesMoreThenKeys(){
        Template template = new SimpleGenerator();
        String text = "I am a ${name}, Who are ${subject}?";
        Map<String, String> map = new HashMap();
        map.put("name", "Alex");
        map.put("subject", "you");
        map.put("test", "test");
        String checked = "I am a Alex, Who are you?";

        String result = template.generate(text, map);

        Assert.assertThat(result, is(checked));
    }

    @Test(expected = IllegalArgumentException.class)
    public void generateWithWrongArgsWhenKeysMoreThenValues(){
        Template template = new SimpleGenerator();
        String text = "I am a ${name}, Who are ${subject}?, ${test}";
        Map<String, String> map = new HashMap();
        map.put("name", "Alex");
        map.put("subject", "you");
        String checked = "I am a Alex, Who are you?";

        String result = template.generate(text, map);

        Assert.assertThat(result, is(checked));
    }

    @Test(expected = IllegalArgumentException.class)
    public void generateWithNullData(){
        Template template = new SimpleGenerator();
        String text = "I am a ${name}, Who are ${subject}?, ${test}";
        Map<String, String> map = null;

        String result = template.generate(text, map);
    }

    @Test(expected = IllegalArgumentException.class)
    public void generateWithNullTemplateString(){
        Template template = new SimpleGenerator();
        String text = null;
        Map<String, String> map = new HashMap();
        map.put("name", "Alex");
        map.put("subject", "you");

        String result = template.generate(text, map);
    }
}