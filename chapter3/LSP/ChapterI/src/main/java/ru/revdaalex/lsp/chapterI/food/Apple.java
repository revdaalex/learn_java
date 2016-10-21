package ru.revdaalex.lsp.chapterI.food;

import java.util.GregorianCalendar;

/**
 * Apple class.
 * Created by revdaalex on 27.06.2016.
 */
public class Apple extends Food {
    /**
     * Apple constructor.
     * @param name
     * @param expaireDate
     * @param createDate
     * @param price
     */
    public Apple(String name, GregorianCalendar expaireDate, GregorianCalendar createDate, double price) {
        super(name, expaireDate, createDate, price);
    }
}
