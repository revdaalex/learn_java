package ru.revdaalex.menu;

import ru.revdaalex.menu.interfaces.Action;
import ru.revdaalex.menu.interfaces.MenuInterface;
import ru.revdaalex.menu.interfaces.SelectInterface;

import java.util.*;

/**
 * Menu class.
 * Created by revdaalex on 27.09.2016.
 */
public class Menu implements MenuInterface, SelectInterface {

    /**
     * Variable menu name.
     */
    private String name;

    /**
     * Variable menu parent.
     */
    private String parent;

    /**
     * Variable menu level.
     */
    private int menuLevel;

    /**
     * Variable menu selected.
     */
    private boolean selected;

    /**
     * Variable Action.
     */
    private Action action;

    /**
     * Name getter.
     * @return name.
     */
    public String getName() {
        return name;
    }

    /**
     * Parent gettes
     * @return parent.
     */
    public String getParent() {
        return parent;
    }

    /**
     * MenuLevel getter.
     * @return menuLevel.
     */
    public int getMenuLevel() {
        return menuLevel;
    }

    /**
     * Implement method from MenuInterface.
     */
    public void setSelected() {
        this.selected = true;
    }

    /**
     * Implement method from SelectInterface.
     * @return selected.
     */
    public boolean isSelected() {
        return selected;
    }

    /**
     * Action method.
     */
    public void action(){
        this.action.action();
    }

    /**
     * Main constructor.
     */
    public Menu() {
    }

    /**
     * Second constructor.
     * @param name name.
     * @param parent parent.
     * @param menuLevel menuLevel.
     */
    public Menu(String name, String parent, int menuLevel) {
        this.name = name;
        this.parent = parent;
        this.menuLevel = menuLevel;
    }

    /**
     * Build tree menu method.
     * @param menuList menuList.
     * @return Map.
     */
    private Map<String, ArrayList<Menu>> buildMenu(List<Menu> menuList){
        Map<String, ArrayList<Menu>> menuMap = new HashMap<String, ArrayList<Menu>>();
        for (Menu menu : menuList){
            if (!menuMap.containsKey(menu.getParent())){
                menuMap.put(menu.getParent(), new ArrayList<Menu>());
            }
            menuMap.get(menu.getParent()).add(menu);
        }
        return menuMap;
    }

    /**
     * Show menu in console.
     * @param name name.
     * @param menuMap menuMap.
     */
    protected void showMenu(String name, Map<String, ArrayList<Menu>> menuMap){
        if (menuMap.containsKey(name)) {
            for (Menu menuName : menuMap.get(name)) {
                if (menuName.getMenuLevel() > 0){
                    System.out.printf("%" + menuName.getMenuLevel() * 3 + "s%s%n", "", menuName.getName());
                } else System.out.println(menuName.getName());
                showMenu(menuName.getName(), menuMap);
            }
        }
    }

    /**
     * Construction menu method.
     * @param menuList menuList
     * @return Map.
     */
    protected Map<String, ArrayList<Menu>> construct(List<Menu> menuList){
        final Map<String, ArrayList<Menu>> menuMap = buildMenu(menuList);
        return menuMap;
    }
}