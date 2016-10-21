package ru.revdaalex.lsp.chapterI.interfaces;

import ru.revdaalex.lsp.chapterI.food.Food;

import java.util.ArrayList;

/**
 * Storage interface.
 * Created by revdaalex on 04.07.2016.
 */
public interface Storage {
    /**
     * Method add.
     * @param food
     */
    void add(Food food);

    /**
     * Method sortQuality.
     * @param food
     * @return
     */
    boolean sortQuality(Food food);

    ArrayList<Food> getFood();
}
