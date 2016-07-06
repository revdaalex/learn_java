package ru.revdaalex.lsp.chapterI.storage;

import ru.revdaalex.lsp.chapterI.food.Food;
import ru.revdaalex.lsp.chapterI.interfaces.Storage;

import java.util.ArrayList;

/**
 * Trash class.
 * Created by revdaalex on 04.07.2016.
 */
public class Trash implements Storage {
    /**
     * ArrayList trash.
     */
    private final ArrayList<Food> trash = new ArrayList<Food>();

    /**
     * Implements interface method add in Trash.
     * @param food
     */
    public void add(Food food) {
        this.trash.add(food);
    }

    /**
     * Implements interface method SortQuality in Trash.
     * @param food
     * @return
     */
    public boolean SortQuality(Food food) {
        if (food.getExpiryDateInPercents() >= 100){
            return true;
        }
        return false;
    }
}
