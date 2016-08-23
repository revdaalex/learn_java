package ru.revdaalex.lsp.chapterII.food;

import ru.revdaalex.lsp.chapterI.food.Food;

import java.util.GregorianCalendar;

/**
 * ReproductFood class.
 * Created by revdaalex on 10.08.2016.
 */
public class ReproductFood extends Food {
    /**
     * Food class constructor.
     *
     * @param name
     * @param expaireDate
     * @param createDate
     * @param price
     */
    public ReproductFood(String name, GregorianCalendar expaireDate, GregorianCalendar createDate, double price) {
        super(name, expaireDate, createDate, price);
    }

    /**
     * Can reproduct flag.
     * @return
     */
    public boolean canReproduct(){
        return true;
    }
}
