package ru.revdaalex.lsp.chapterII.storage;

import ru.revdaalex.lsp.chapterII.food.ReproductFood;
import ru.revdaalex.lsp.chapterII.interfaces.Rstorage;

import java.util.ArrayList;

/**
 * ColdWarehouse class.
 * Created by revdaalex on 10.08.2016.
 */
public class ColdWarehouse implements Rstorage {
    /**
     * ArrayList coldWarehouse.
     */
    private final ArrayList<ReproductFood> coldWarehouse = new ArrayList<>();


    /**
     * Implements interface method add in ColdWarehouse.
     * @param
     */
    @Override
    public void add(ReproductFood reproductFood) {
        this.coldWarehouse.add(reproductFood);
    }

    /**
     * Implements interface method sortQuality in ColdWarehouse.
     * @param reproductFood
     * @return
     */

    @Override
    public boolean sortQuality(ReproductFood reproductFood) {
        if (reproductFood.canReproduct()) {
            if (reproductFood.getExpiryDateInPercents() >= 100) {
                return true;
            }
        }
        return false;
    }

    /**
     * Get method.
     * @return arrayList.
     */
    public ArrayList<ReproductFood> getFood() {
        return coldWarehouse;
    }
}
