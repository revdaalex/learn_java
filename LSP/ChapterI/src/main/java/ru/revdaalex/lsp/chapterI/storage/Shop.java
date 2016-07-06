package ru.revdaalex.lsp.chapterI.storage;

import ru.revdaalex.lsp.chapterI.food.Food;
import ru.revdaalex.lsp.chapterI.interfaces.Storage;

import java.util.ArrayList;

/**
 * Shop class.
 * Created by revdaalex on 04.07.2016.
 */
public class Shop implements Storage {
    /**
     * ArrayList shop.
     */
    private final ArrayList<Food> shop = new ArrayList<Food>();

    /**
     * Implements interface method add in Shop.
     * @param food
     */
    public void add(Food food) {
        this.shop.add(food);
    }

    /**
     * Implements interface method SortQuality in Shop.
     * @param food
     * @return
     */
    public boolean SortQuality(Food food) {
        if (food.getExpiryDateInPercents() > 25 & food.getExpiryDateInPercents() < 75){
            return true;
        } else if (food.getExpiryDateInPercents() > 75 & food.getExpiryDateInPercents() < 100){
            food.setDisscount(50);
            return true;
        }
        return false;
    }


}
