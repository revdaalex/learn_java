package ru.revdaalex.lsp.chapterII.rcontroll;

import ru.revdaalex.lsp.chapterI.control.ControllQuality;
import ru.revdaalex.lsp.chapterI.food.Food;
import ru.revdaalex.lsp.chapterI.interfaces.Storage;
import ru.revdaalex.lsp.chapterII.food.ReproductFood;
import ru.revdaalex.lsp.chapterII.interfaces.Rstorage;

import java.util.ArrayList;

/**
 *
 * Created by revdaalex on 24.08.2016.
 */
public class RCotrollQuality  {

    /**
     * ArrayList Storage.
     */
    private ArrayList<Storage> storages = new ArrayList<>();

    /**
     * ArrayList Rstorage.
     */
    private ArrayList<Rstorage> rstorages = new ArrayList<>();

    /**
     * ControllQuality.
     */
    ControllQuality controllQuality = new ControllQuality(storages);


    /**
     * add storage method.
     * @param storage
     */
    public void add(Storage storage){
        this.storages.add(storage);
    }

    /**
     * add rstorage method.
     * @param rstorage
     */
    public void add(Rstorage rstorage){
        this.rstorages.add(rstorage);
    }

    /**
     * sort method.
     * @param food
     */
    public void sort(Food food) {
        controllQuality.sort(food);
    }

    /**
     * rSort method.
     * @param reproductFood
     */
    public void rSort(ReproductFood reproductFood){
        for (Rstorage rstorage : this.rstorages){
            if (rstorage.sortQuality(reproductFood)){
                rstorage.add(reproductFood);
                break;
            }
        }
        controllQuality.sort(reproductFood);
    }
}
