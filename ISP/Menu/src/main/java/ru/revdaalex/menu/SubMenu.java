package ru.revdaalex.menu;

import ru.revdaalex.menu.interfaces.IO;
import ru.revdaalex.menu.interfaces.ShowMenu;

/**
 * SubMenu class.
 * Created by revdaalex on 15.09.2016.
 */
public class SubMenu implements ShowMenu {
    /**
     * StringBuilder prefixAndName variable.
     */
    private StringBuilder prefixAndName = new StringBuilder("------");
    /**
     * IO variable.
     */
    private final IO io;

    /**
     * Main constructor.
     * @param name
     * @param io
     */
    public SubMenu(String name, IO io) {
        this.prefixAndName.append(name);
        this.io = io;
    }

    /**
     * Show method from interface.
     */
    public void show() {
        this.io.println(prefixAndName);
    }
}
