package ru.revdaalex.lsp.chapterI.control;

import ru.revdaalex.lsp.chapterI.food.Food;
import ru.revdaalex.lsp.chapterI.interfaces.Controll;
import ru.revdaalex.lsp.chapterI.interfaces.Storage;

import java.util.ArrayList;

/**
 * ControlQuality class.
 * Created by revdaalex on 04.07.2016.
 */
public class ControllQuality implements Controll {
    ArrayList<Storage> storages = new ArrayList<Storage>();

    /**
     * Start sorting products.
     * @param food
     */
    public void sort(Food food) {
        for (Storage storage : this.storages){
            if (storage.sortQuality(food)){
                storage.add(food);
                break;
            }
        }
    }

    public ArrayList<Storage> getStorages() {
        return storages;
    }

    /**
     * ControllQuality constructor.
     * @param storages
     */
    public ControllQuality(ArrayList<Storage> storages) {
        this.storages = storages;
    }
}
