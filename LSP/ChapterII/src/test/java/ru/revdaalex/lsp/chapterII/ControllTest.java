package ru.revdaalex.lsp.chapterII;

import org.junit.Assert;
import org.junit.Test;
import ru.revdaalex.lsp.chapterI.control.ControllQuality;
import ru.revdaalex.lsp.chapterI.food.Apple;
import ru.revdaalex.lsp.chapterI.interfaces.Storage;
import ru.revdaalex.lsp.chapterII.food.Meat;
import ru.revdaalex.lsp.chapterII.storage.ColdWarehouse;
import ru.revdaalex.lsp.chapterII.storage.NewWarehouse;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 * Test new storage Class.
 * Created by revdaalex on 18.08.2016.
 */
public class ControllTest {

    ArrayList<Storage> list = new ArrayList<Storage>();

    /**
     * Test sort food in new warehouse.
     */
    @Test
    public void testSortNewWarehouse(){
        Storage newWarehouse = new NewWarehouse();
        list.add(newWarehouse);
        ControllQuality controll = new ControllQuality(list);
        Apple apple = new Apple("Яблоко", new GregorianCalendar(2016, 10, 21), new GregorianCalendar(2016, 8, 3), 50);
        controll.sort(apple);
        Assert.assertTrue(newWarehouse.getFood().contains(apple));
    }

    /**
     * Test sotr food in Cold Warehouse.
     */
    @Test
    public void testSortColdWarehouse(){
        Storage coldWarehouse = new ColdWarehouse();
        list.add(coldWarehouse);
        ControllQuality controll = new ControllQuality(list);
        Meat meat = new Meat("Мясо", new GregorianCalendar(2016, 8, 15), new GregorianCalendar(2016, 8, 9), 300);
        controll.sort(meat);
        Assert.assertTrue(coldWarehouse.getFood().contains(meat));
    }
}
