package ru.revdaalex.regex;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by revdaalex on 31.05.2016.
 */
public class SimpleGenerator implements Template {
    public String generate(String template, Map data) {
        Pattern p = Pattern.compile("\\$\\{([^}]+)\\}");
        Matcher m = p.matcher(template);
        StringBuffer sb = new StringBuffer();
        while (m.find())
        {
            m.appendReplacement(sb, data.get(m.group(1)).toString());
        }
        m.appendTail(sb);
        return sb.toString();
    }
}
