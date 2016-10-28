package ru.revdaalex.regex;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * SimpleGenerator class.
 * Created by revdaalex on 27.10.2016.
 */
public class SimpleGenerator implements Template {
    /**
     * Method generate String from String with key.
     * @param template String with keys.
     * @param data Map with keys adn values.
     * @return String.
     */
    public String generate(String template, Map data) {
        if (template == null || data == null || data.size() == 0){
            throw new IllegalArgumentException("Bad arguments");
        }
        Pattern p = Pattern.compile("\\$\\{([^}]+)\\}");
        Matcher m = p.matcher(template);
        StringBuffer sb = new StringBuffer();
        Set<String> usedKeys = new HashSet<>();
        while (m.find())
        {
            if (data.containsKey(m.group(1))) {
                usedKeys.add(m.group(1));
                m.appendReplacement(sb, data.get(m.group(1)).toString());
            } else {
                throw new IllegalArgumentException("Bad arguments!");
            }
        }
        m.appendTail(sb);
        Set<String> allKeys = data.keySet();
        for(String key : allKeys) {
            if(!usedKeys.contains(key)) {
                throw new IllegalArgumentException(String.format("This key not use. %s", key));
            }
        }
        return sb.toString();
    }
}
