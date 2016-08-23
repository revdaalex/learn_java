package ru.revdaalex.lsp.chapterII.storage;

import ru.revdaalex.lsp.chapterI.food.Food;
import ru.revdaalex.lsp.chapterI.interfaces.Storage;
import ru.revdaalex.lsp.chapterII.food.ReproductFood;

import java.util.ArrayList;

/**
 * ColdWarehouse class.
 * Created by revdaalex on 10.08.2016.
 */
public class ColdWarehouse implements Storage {
    /**
     * ArrayList coldWarehouse.
     */
    private final ArrayList<Food> coldWarehouse = new ArrayList<Food>();

    /**
     * New soet method with reproduct flag.
     * @param reproductFood
     * @return
     */
    public boolean rSortQuality(ReproductFood reproductFood) {
        if (reproductFood.getExpiryDateInPercents() >= 100){
            if (reproductFood.canReproduct()){
                return true;
            }
        }
        return false;
    }


    /**
     * Implements interface method add in ColdWarehouse.
     * @param food
     */
    public void add(Food food) {
        this.coldWarehouse.add(food);
    }

    /**
     * Implements interface method sortQuality in ColdWarehouse.
     * @param food
     * @return
     */
    public boolean sortQuality(Food food) {
        if (rSortQuality((ReproductFood) food)){
            return true;
        }
        return false;
    }

    /**
     * Get method.
     * @return arrayList.
     */
    public ArrayList<Food> getFood() {
        return coldWarehouse;
    }
}
