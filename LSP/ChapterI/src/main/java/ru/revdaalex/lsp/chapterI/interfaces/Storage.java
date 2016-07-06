package ru.revdaalex.lsp.chapterI.interfaces;

import ru.revdaalex.lsp.chapterI.food.Food;

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
     * Method SortQuality.
     * @param food
     * @return
     */
    boolean SortQuality(Food food);
}
