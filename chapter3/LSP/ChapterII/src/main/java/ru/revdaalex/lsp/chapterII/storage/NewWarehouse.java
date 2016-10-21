package ru.revdaalex.lsp.chapterII.storage;

import ru.revdaalex.lsp.chapterI.food.Food;
import ru.revdaalex.lsp.chapterI.interfaces.Storage;
import ru.revdaalex.lsp.chapterI.storage.Warehouse;
import ru.revdaalex.lsp.chapterII.food.ReproductFood;
import ru.revdaalex.lsp.chapterII.interfaces.Rstorage;

import java.util.ArrayList;

/**
 * NewWarehouse class.
 * Created by revdaalex on 10.08.2016.
 */
public class NewWarehouse extends Warehouse implements Storage {

    private final ArrayList<Food> newWarehouse = new ArrayList<Food>();

    /**
     * add method from parent class.
     * @param food
     */
    public void add(Food food) {
        this.newWarehouse.add(food);
    }

    /**
     * boolean sortQuality method from parent class.
     * @param food
     * @return
     */
    public boolean sortQuality(Food food) {
        return super.sortQuality(food);
    }

    /**
     * get method from parent class.
     * @return
     */
    public ArrayList<Food> getFood() {
        return this.newWarehouse;
    }
}
