package ru.revdaalex.lsp.chapterI.food;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Cucumbers class.
 * Created by revdaalex on 27.06.2016.
 */
public class Cucumbers extends Food {
    /**
     * Cucumbers constructor.
     * @param name
     * @param expaireDate
     * @param createDate
     * @param price
     */
    public Cucumbers(String name, GregorianCalendar expaireDate, GregorianCalendar createDate, double price) {
        super(name, expaireDate, createDate, price);
    }
}
