package ru.revdaalex.lsp.chapterII.food;

import java.util.GregorianCalendar;

/**
 * Sausages class.
 * Created by revdaalex on 10.08.2016.
 */
public class Sausages extends ReproductFood {
    /**
     * Food class constructor.
     *
     * @param name
     * @param expaireDate
     * @param createDate
     * @param price
     */
    public Sausages(String name, GregorianCalendar expaireDate, GregorianCalendar createDate, double price) {
        super(name, expaireDate, createDate, price);
    }
}
