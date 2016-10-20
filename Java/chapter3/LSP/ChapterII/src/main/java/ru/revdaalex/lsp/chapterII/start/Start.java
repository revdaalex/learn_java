package ru.revdaalex.lsp.chapterII.start;

import ru.revdaalex.lsp.chapterI.food.*;
import ru.revdaalex.lsp.chapterI.interfaces.Storage;
import ru.revdaalex.lsp.chapterI.storage.Shop;
import ru.revdaalex.lsp.chapterI.storage.Trash;
import ru.revdaalex.lsp.chapterI.storage.Warehouse;
import ru.revdaalex.lsp.chapterII.food.Meat;
import ru.revdaalex.lsp.chapterII.food.Milk;
import ru.revdaalex.lsp.chapterII.food.Sausages;
import ru.revdaalex.lsp.chapterII.interfaces.Rstorage;
import ru.revdaalex.lsp.chapterII.rcontroll.RCotrollQuality;
import ru.revdaalex.lsp.chapterII.storage.ColdWarehouse;
import ru.revdaalex.lsp.chapterII.storage.NewWarehouse;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 * Start class with main method.
 * Created by revdaalex on 10.08.2016.
 */
public class Start {

    public static void main(String[] args) {

        Apple apple = new Apple("Яблоко", new GregorianCalendar(2016, 9, 30), new GregorianCalendar(2016, 8, 3), 50);

        Grapes grapes = new Grapes("Виноград", new GregorianCalendar(2016, 8, 10), new GregorianCalendar(2016, 8, 3), 70);

        Cucumbers cucumbers = new Cucumbers("Огурцы", new GregorianCalendar(2016, 8, 9), new GregorianCalendar(2016, 7, 30), 25);

        Cherries cherries = new Cherries("Черешня", new GregorianCalendar(2016, 8, 8), new GregorianCalendar(2016, 6, 30), 250);

        Tomatoes tomatoes = new Tomatoes("Томаты", new GregorianCalendar(2016, 7, 5), new GregorianCalendar(2016, 6, 30), 130);

        Milk milk = new Milk("Молоко", new GregorianCalendar(2016, 7, 5), new GregorianCalendar(2016, 6, 30), 130);

        Meat meat = new Meat("Мясо", new GregorianCalendar(2016, 8, 15), new GregorianCalendar(2016, 8, 9), 300);

        Sausages sausages = new Sausages("Сосиски", new GregorianCalendar(2016, 7, 5), new GregorianCalendar(2016, 6, 30), 130);

        RCotrollQuality rCotrollQuality = new RCotrollQuality();
        rCotrollQuality.add(new ColdWarehouse());
        rCotrollQuality.add(new Shop());
        rCotrollQuality.add(new Trash());
        rCotrollQuality.add(new Warehouse());
        rCotrollQuality.add(new NewWarehouse());

        rCotrollQuality.sort(apple);
        rCotrollQuality.sort(grapes);
        rCotrollQuality.sort(cucumbers);
        rCotrollQuality.sort(cherries);
        rCotrollQuality.sort(tomatoes);
        rCotrollQuality.rSort(milk);
        rCotrollQuality.rSort(meat);
        rCotrollQuality.rSort(sausages);
    }
}
