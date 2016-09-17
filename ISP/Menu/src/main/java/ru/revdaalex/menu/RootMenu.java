package ru.revdaalex.menu;

import ru.revdaalex.menu.interfaces.IO;
import ru.revdaalex.menu.interfaces.ShowMenu;

/**
 * RootMenu class.
 * Created by revdaalex on 14.09.2016.
 */
public class RootMenu implements ShowMenu {
    /**
     * StringBuilder name variable.
     */
    private StringBuilder name = new StringBuilder();
    /**
     * IO variable.
     */
    private final IO io;

    /**
     * Main constructor.
     * @param name
     * @param io
     */
    public RootMenu(String name, IO io) {
        this.name.append(name);
        this.io = io;
    }

    /**
     * Show method from interface.
     */
    public void show() {
        this.io.println(name);
    }
}