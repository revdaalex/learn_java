package ru.revdaalex.menu;
/**
 * Start class.
 * Created by revdaalex on 14.09.2016.
 */
public class Start {
    /**
     * Method main.
     * @param args
     */
    public static void main(String[] args) {
        AllMenu allMenu = new AllMenu(new ConsolIO());
        allMenu.start();
    }
}
