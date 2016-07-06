package ru.revdaalex.lsp.chapterI.food;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Cherries class.
 * Created by revdaalex on 27.06.2016.
 */
public class Cherries extends Food {
    /**
     * Cherries constructor.
     * @param name
     * @param expaireDate
     * @param createDate
     * @param price
     */
    public Cherries(String name, GregorianCalendar expaireDate, GregorianCalendar createDate, double price) {
        super(name, expaireDate, createDate, price);
    }
}
