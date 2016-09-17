package ru.revdaalex.menu;

/**
 * MenuValidator class.
 * Created by revdaalex on 15.09.2016.
 */
public class MenuValidator extends ConsolIO {
    /**
     * Int user choice variable.
     */
    private int uc;
    /**
     * Boolean isValid variable.
     */
    private boolean isValid;

    /**
     * Menu validation method.
     * @return int user choice.
     */
    public int validMenu(){
        int choice = 0;
        isValid = true;
        while (isValid){
            this.uc = Integer.valueOf(super.read());
            if (uc == 0 || uc > 6){
                super.out.println("Нет такого пункта меню.\n Попробуйте еще раз.");
            } else {
                choice = uc;
                isValid = false;
            }
        } return choice;
    }
}
