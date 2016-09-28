package ru.revdaalex.menu;

import java.util.Arrays;

/**
 * Manual testing class Main.
 * Created by revdaalex on 26.09.2016.
 */
public class Main {

    public static void main(String[] args) {
       Menu menu = new Menu();
        menu.showMenu(null, menu.construct(Arrays.asList(new Menu("Задание 1", null, 0),
                new Menu("Задание 1.1", "Задание 1", 1),
                new Menu("Задание 1.1.1", "Задание 1.1", 2), new Menu("Задание 1.1.2", "Задание 1.1", 2),
                new Menu("Задание 1.2", "Задание 1", 1), new Menu("Задание 2", null, 0),
                new Menu("Задание 3", null, 0))));
    }
}