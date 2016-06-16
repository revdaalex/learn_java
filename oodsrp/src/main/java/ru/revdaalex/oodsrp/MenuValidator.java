package ru.revdaalex.oodsrp;

import ru.revdaalex.oodsrp.interfaces.IO;

/**
 * Validate calculator menu.
 * Created by revdaalex on 16.06.2016.
 */
public class MenuValidator {
    /**
     * Variable IO.
     */
    private final IO io;
    /**
     * Variable user choice.
     */
    private int uc;
    /**
     * Validation variable.
     */
    private boolean isValid;

    /**
     * Constructor.
     * @param io
     */
    public MenuValidator(IO io) {
        this.io = io;
    }

    /**
     * Validation main menu.
     * @return choice number.
     */
    public int validMainMenu(){
        int choice = 0;
        isValid = true;
        while (isValid) {
            this.uc = Integer.valueOf(this.io.read());
            if(uc == 0 || uc > 7) {
                System.out.println("Нет такого пункта меню\nПопробуйте еще раз.");
            } else {
                choice = uc;
                isValid = false;
            }
        } return choice;
    }

    /**
     * Validation CalcResultMenu
     * @return number operator.
     */
    public int validCalcResultMenu(){
        int choice = 0;
        isValid = true;
        while (isValid) {
            this.uc = Integer.valueOf(this.io.read());
            if(uc == 0 || uc > 4) {
                System.out.println("Нет такого оператора\nПопробуйте еще раз.");
            } else {
                choice = uc;
                isValid = false;
            }
        } return choice;
    }
}
