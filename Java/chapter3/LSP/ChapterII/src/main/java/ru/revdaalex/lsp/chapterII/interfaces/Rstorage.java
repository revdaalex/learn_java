package ru.revdaalex.lsp.chapterII.interfaces;

import ru.revdaalex.lsp.chapterII.food.ReproductFood;

import java.util.ArrayList;

/**
 * Rstorage interface.
 * Created by revdaalex on 05.09.2016.
 */
public interface Rstorage {

    /**
     * add method.
     * @param reproductFood
     */
    void add(ReproductFood reproductFood);

    /**
     * bolean sortQuality method.
     * @param reproductFood
     * @return
     */
    boolean sortQuality(ReproductFood reproductFood);

    /**
     * get method.
     * @return
     */
    ArrayList<ReproductFood> getFood();
}
