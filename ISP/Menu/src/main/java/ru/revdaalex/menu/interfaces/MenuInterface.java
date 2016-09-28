package ru.revdaalex.menu.interfaces;

/**
 * Menu Interface.
 * Created by revdaalex on 26.09.2016.
 */
public interface MenuInterface {

    String getName();

    String getParent();

    int getMenuLevel();

    void setSelected();
}
