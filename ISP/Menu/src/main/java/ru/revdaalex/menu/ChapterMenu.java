package ru.revdaalex.menu;

import ru.revdaalex.menu.interfaces.IO;
import ru.revdaalex.menu.interfaces.ShowMenu;

/**
 * ChapterMenu class.
 * Created by revdaalex on 14.09.2016.
 */
public class ChapterMenu implements ShowMenu {
    /**
     * IO variables.
     */
    private final IO io;
    /**
     * PrefixAndName variable.
     */
    StringBuilder prefixAndName = new StringBuilder("----");

    /**
     * Main constructor.
     * @param name
     * @param io
     */
    public ChapterMenu(String name, IO io) {
        this.prefixAndName.append(name);
        this.io = io;
    }

    /**
     * Method show from interface.
     */
    public void show() {
        this.io.println(prefixAndName);
    }
}
