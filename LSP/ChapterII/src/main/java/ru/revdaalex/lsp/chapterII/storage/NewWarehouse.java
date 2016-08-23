package ru.revdaalex.lsp.chapterII.storage;

import ru.revdaalex.lsp.chapterI.food.Food;
import ru.revdaalex.lsp.chapterI.interfaces.Storage;
import ru.revdaalex.lsp.chapterI.storage.Warehouse;

import java.util.ArrayList;

/**
 * NewWarehouse class.
 * Created by revdaalex on 10.08.2016.
 */
public class NewWarehouse extends Warehouse implements Storage {

    private final ArrayList<Food> newWarehouse = new ArrayList<>();


    public void add(Food food) {
        this.newWarehouse.add(food);
    }


    public boolean sortQuality(Food food) {
        return super.sortQuality(food);
    }


    public ArrayList<Food> getFood() {
        return this.newWarehouse;
    }
}
