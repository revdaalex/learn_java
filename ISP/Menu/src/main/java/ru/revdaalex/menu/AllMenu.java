package ru.revdaalex.menu;

import ru.revdaalex.menu.interfaces.IO;
import ru.revdaalex.menu.interfaces.ShowMenu;

import java.util.ArrayList;
import java.util.List;

/**
 * AllMenu class.
 * Created by revdaalex on 15.09.2016.
 */
public class AllMenu {
    /**
     * IO variable.
     */
    protected final IO io;

    /**
     * Main constructor.
     * @param io
     */
    public AllMenu(IO io) {
        this.io = io;
    }

    /**
     * Start method.
     */
    public void start(){
        RootMenu rootMenu = new RootMenu("Задача 1", io);
        ChapterMenu chapterMenu = new ChapterMenu("Задача 1.1", io);
        SubMenu subMenu = new SubMenu("Задача 1.1.1", io);
        SubMenu subMenuTwo = new SubMenu("Задача 1.1.2", io);
        ChapterMenu chapterMenuTwo = new ChapterMenu("Задача 1.2", io);
        ActionInMenu actionInMenu = new ActionInMenu(io);
        List<ShowMenu> showMenus = new ArrayList<ShowMenu>();
        showMenus.add(rootMenu);
        showMenus.add(chapterMenu);
        showMenus.add(subMenu);
        showMenus.add(subMenuTwo);
        showMenus.add(chapterMenuTwo);
        showMenus.add(actionInMenu);
        for (ShowMenu menu : showMenus){
            menu.show();
        }
    }
}