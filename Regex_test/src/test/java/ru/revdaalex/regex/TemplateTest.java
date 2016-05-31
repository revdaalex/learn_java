package ru.revdaalex.regex;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by revdaalex on 31.05.2016.
 */
public class TemplateTest {
    private static Template template;
    private String text = "I am a ${name}, Who are ${subject}?";
    private static Map map = new HashMap();
    static {
        map.put("name", "Petr");
        map.put("subject", "you");
        map.put("test", "test");
    }

    @BeforeClass
    public static void run(){
        template = new SimpleGenerator();
    }
    @Test
    public void testGenerate(){
        String result = template.generate(text, map);
        String checked = "I am a Petr, Who are you?";

        Assert.assertThat(result, is(checked));
    }

    @Test
    public void noKeyCheck(){
        if (map.size() == 0)Assert.fail("Отсутствуют значения");
    }

    @Test
    public void toManyKeyCheck(){
        if (map.size() > 2)Assert.fail("Лишние значения");
    }
}