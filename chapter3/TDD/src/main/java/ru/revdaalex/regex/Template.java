package ru.revdaalex.regex;

import java.util.Map;

/**
 * Created by revdaalex on 27.10.2016.
 */
public interface Template {
    String generate(String template, Map data);
}
