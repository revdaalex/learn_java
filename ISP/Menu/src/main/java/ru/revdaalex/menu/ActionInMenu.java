package ru.revdaalex.menu;

import ru.revdaalex.menu.interfaces.IO;
import ru.revdaalex.menu.interfaces.ShowAndAction;

/**
 * Action in menu class.
 * Created by revdaalex on 15.09.2016.
 */
public class ActionInMenu implements ShowAndAction {
    /**
     * Action variable.
     */
    StringBuilder actoin = new StringBuilder("Выберете номер меню");
    /**
     * Menu validator variable.
     */
    MenuValidator menuValidator = new MenuValidator();
    /**
     * IO variable.
     */
    private final IO io;

    /**
     * Main constructor.
     * @param io
     */
    public ActionInMenu(IO io) {
        this.io = io;
    }

    /**
     * User choice method from interface.
     */
    public void userChoice() {
        boolean notExit = true;
        while (notExit){
            int uc = menuValidator.validMenu();
            switch (uc){
                case 1 : this.io.println("Выбрана Задача 1"); break;
                case 2 : this.io.println("Выбрана Задача 1.1"); break;
                case 3 : this.io.println("Выбрана Задача 1.1.1"); break;
                case 4 : this.io.println("Выбрана Задача 1.1.2"); break;
                case 5 : this.io.println("Выбрана Задача 1.2"); break;
                case 6 : System.exit(0); break;
            }
        }
    }

    /**
     * Method show from interface.
     */
    public void show() {
        this.io.println(actoin);
        userChoice();
    }
}
