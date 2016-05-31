package ru.revdaalex.regex;

import java.util.Map;

/**
 * Created by revdaalex on 31.05.2016.
 */
public interface Template {
    String generate(String template, Map data);
}
