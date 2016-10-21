package ru.revdaalex.lsp.chapterI.start;

import ru.revdaalex.lsp.chapterI.control.ControllQuality;
import ru.revdaalex.lsp.chapterI.food.*;
import ru.revdaalex.lsp.chapterI.interfaces.Controll;
import ru.revdaalex.lsp.chapterI.interfaces.Storage;
import ru.revdaalex.lsp.chapterI.storage.Shop;
import ru.revdaalex.lsp.chapterI.storage.Trash;
import ru.revdaalex.lsp.chapterI.storage.Warehouse;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 * Start class.
 * Created by revdaalex on 04.07.2016.
 */
public class Start {
    public static void main(String[] args) {
        /**
         * ArrayList contains Storage implements.
         */
        ArrayList<Storage> list = new ArrayList<Storage>();
        /**
         * new Apple().
         */
        Apple apple = new Apple("Яблоко", new GregorianCalendar(2016, 8, 25), new GregorianCalendar(2016, 8, 3), 50);
        /**
         * new Grapes().
         */
        Grapes grapes = new Grapes("Виноград", new GregorianCalendar(2016, 8, 10), new GregorianCalendar(2016, 8, 3), 70);
        /**
         * new Cucumbers().
         */
        Cucumbers cucumbers = new Cucumbers("Огурцы", new GregorianCalendar(2016, 8, 9), new GregorianCalendar(2016, 7, 30), 25);
        /**
         * new Cherries().
         */
        Cherries cherries = new Cherries("Черешня", new GregorianCalendar(2016, 8, 8), new GregorianCalendar(2016, 6, 30), 250);
        /**
         * new Tomatoes.
         */
        Tomatoes tomatoes = new Tomatoes("Томаты", new GregorianCalendar(2016, 7, 5), new GregorianCalendar(2016, 6, 30), 130);
        /**
         * Method add new Shop Storage.
         */
        list.add(new Shop());
        /**
         * Method add new Warehouse Storage.
         */
        list.add(new Warehouse());
        /**
         * Method add new Trash Storage.
         */
        list.add(new Trash());
        /**
         * New ControllQuality object.
         */
        Controll controll = new ControllQuality(list);
        /**
         * Method sort apple.
         */
        controll.sort(apple);
        System.out.println(apple.getExpiryDateInPercents());
        /**
         * Method sort grapes.
         */
        controll.sort(grapes);
        System.out.println(grapes.getExpiryDateInPercents());
        /**
         * Method sort cucumbers.
         */
        controll.sort(cucumbers);
        System.out.println(cucumbers.getExpiryDateInPercents());
        /**
         * Method sort cherries.
         */
        controll.sort(cherries);
        System.out.println(cherries.getExpiryDateInPercents());
        /**
         * Method sort tomatoes.
         */
        controll.sort(tomatoes);
        System.out.println(tomatoes.getExpiryDateInPercents());
    }
}