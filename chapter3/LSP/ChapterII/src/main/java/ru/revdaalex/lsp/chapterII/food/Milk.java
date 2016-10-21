package ru.revdaalex.lsp.chapterII.food;

import ru.revdaalex.lsp.chapterI.food.Food;

import java.util.GregorianCalendar;

/**
 * Created by revdaalex on 10.08.2016.
 */
public class Milk extends ReproductFood {

    /**
     * Food class constructor.
     *
     * @param name
     * @param expaireDate
     * @param createDate
     * @param price
     */
    public Milk(String name, GregorianCalendar expaireDate, GregorianCalendar createDate, double price) {
        super(name, expaireDate, createDate, price);
    }
}
