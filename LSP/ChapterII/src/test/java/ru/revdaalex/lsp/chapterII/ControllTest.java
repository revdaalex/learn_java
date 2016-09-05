package ru.revdaalex.lsp.chapterII;

import org.junit.Assert;
import org.junit.Test;
import ru.revdaalex.lsp.chapterI.interfaces.Storage;
import ru.revdaalex.lsp.chapterII.food.Meat;
import ru.revdaalex.lsp.chapterII.food.Sausages;
import ru.revdaalex.lsp.chapterII.interfaces.Rstorage;
import ru.revdaalex.lsp.chapterII.rcontroll.RCotrollQuality;
import ru.revdaalex.lsp.chapterII.storage.ColdWarehouse;
import ru.revdaalex.lsp.chapterII.storage.NewWarehouse;

import java.util.GregorianCalendar;

/**
 * Test new storage Class.
 * Created by revdaalex on 18.08.2016.
 */
public class ControllTest {

    /**
     * Test sort food in new warehouse.
     */
    @Test
    public void testSortNewWarehouse(){
        Storage newWarehouse = new NewWarehouse();
        RCotrollQuality controll = new RCotrollQuality();
        controll.add(newWarehouse);
        Sausages sausages = new Sausages("Сосиски", new GregorianCalendar(2016, 12, 21), new GregorianCalendar(2016, 8, 3), 50);
        controll.rSort(sausages);
        Assert.assertTrue(newWarehouse.getFood().contains(sausages));
    }

    /**
     * Test sotr food in Cold Warehouse.
     */
    @Test
    public void testSortColdWarehouse(){
        Rstorage coldWarehouse = new ColdWarehouse();
        RCotrollQuality controll = new RCotrollQuality();
        controll.add(coldWarehouse);
        Meat meat = new Meat("Мясо", new GregorianCalendar(2016, 8, 15), new GregorianCalendar(2016, 8, 9), 300);
        controll.rSort(meat);
        Assert.assertTrue(coldWarehouse.getFood().contains(meat));
    }
}
