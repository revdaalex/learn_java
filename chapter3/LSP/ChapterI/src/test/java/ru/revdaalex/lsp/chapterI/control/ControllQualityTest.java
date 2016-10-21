package ru.revdaalex.lsp.chapterI.control;

import org.junit.Assert;
import org.junit.Test;
import ru.revdaalex.lsp.chapterI.food.Apple;
import ru.revdaalex.lsp.chapterI.food.Cucumbers;
import ru.revdaalex.lsp.chapterI.food.Tomatoes;
import ru.revdaalex.lsp.chapterI.interfaces.Storage;
import ru.revdaalex.lsp.chapterI.storage.Shop;
import ru.revdaalex.lsp.chapterI.storage.Trash;
import ru.revdaalex.lsp.chapterI.storage.Warehouse;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import static org.junit.Assert.*;

/**
 * ControllQuality Class Test.
 * Created by revdaalex on 28.07.2016.
 */
public class ControllQualityTest {
    ArrayList<Storage> list = new ArrayList<Storage>();

    /**
     * Test sort food in warehouse.
     */
    @Test
    public void testSortWarehouse(){
        Storage warehouse = new Warehouse();
        list.add(warehouse);
        ControllQuality control = new ControllQuality(list);
        Apple apple = new Apple("Яблоко", new GregorianCalendar(2016, 9, 25), new GregorianCalendar(2016, 10, 3), 50);
        control.sort(apple);
        Assert.assertTrue(warehouse.getFood().contains(apple));
    }

    /**
     * Test sort food in shop.
     */
    @Test
    public void testSortShop(){
        Storage shop = new Shop();
        list.add(shop);
        ControllQuality control = new ControllQuality(list);
        Cucumbers cucumbers = new Cucumbers("Огурцы", new GregorianCalendar(2016, 11, 9), new GregorianCalendar(2016, 9, 30), 25);
        control.sort(cucumbers);
        Assert.assertTrue(shop.getFood().contains(cucumbers));
    }

    /**
     * Test sort food in trash.
     */
    @Test
    public void testSortTrash(){
        Storage trash = new Trash();
        list.add(trash);
        ControllQuality control = new ControllQuality(list);
        Tomatoes tomatoes = new Tomatoes("Томаты", new GregorianCalendar(2016, 7, 5), new GregorianCalendar(2016, 6, 30), 130);
        control.sort(tomatoes);
        Assert.assertTrue(trash.getFood().contains(tomatoes));
    }

}