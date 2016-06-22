package ru.revdaalex.oodocp;

import ru.revdaalex.oodocp.interfaces.IO;

/**
 * EngineerCalcMenu.
 * Created by revdaalex on 22.06.2016.
 */
public class EngineerCalcMenu extends CalculatorMenu {
    /**
     * Variable io.
     */
    private IO io;
    /**
     * Engineer menu variable.
     */
    private static final String ENGITEM = "8. Перейти в инжинерный калькулятор";
    /**
     * Engineer operator.
     */
    private static final String ENG_OPERATOR = new StringBuilder()
            .append("1. Произвести вычисление синуса\n")
            .append("2. Произвести вычисление косинуса\n")
            .append("3. Произвести вычисление тангенса")
            .toString();

    /**
     * Constructor.
     * @param io io.
     */
    public EngineerCalcMenu(IO io) {
        super(io);
        this.io = io;
    }

    /**
     * Override method showMenu from parent class.
     */
    @Override
    public void showMenu() {
        super.showMenu();
        this.io.println(ENGITEM);
    }

    /**
     * Method show engineer operator.
     */
    public void showEngineerOperator(){
        this.io.println(ENG_OPERATOR);
    }
}
