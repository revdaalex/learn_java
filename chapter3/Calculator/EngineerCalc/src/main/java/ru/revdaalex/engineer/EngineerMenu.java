package ru.revdaalex.engineer;

import ru.revdaalex.calculator.CalculatorMenu;
import ru.revdaalex.calculator.interfaces.IO;

/**
 * EngineerMenu class.
 * Created by RevdaAlex on 26.06.2016.
 */
public class EngineerMenu extends CalculatorMenu {
    /**
     * Variable standard calculator.
     */
    private static final String STANDART = "1. Стандартный калькулятор";
    /**
     * Variable engineer calculator.
     */
    private static final String ENGINEER = "2. Инженерный калькулятор";
    /**
     * Variable exit calculator.
     */
    private static final String EXIT = "3. Закрыть калькулятор";
    /**
     * Variable Input Output.
     */
    private IO io;

    /**
     * Constructor.
     * @param io
     */
    public EngineerMenu(IO io) {
        super(io);
        this.io = io;
    }

    /**
     * startEngineerMenu method.
     */
    public void startEngineerMenu(){
        this.io.println(STANDART);
        this.io.println(ENGINEER);
        this.io.println(EXIT);
    }

    /**
     * Engineer operator.
     */
    private static final String ENG_OPERATOR = new StringBuilder()
            .append("1. Произвести вычисление синуса\n")
            .append("2. Произвести вычисление косинуса\n")
            .append("3. Произвести вычисление тангенса\n")
            .append("4. Вернуться к выбору типа калькулятора")
            .toString();

    /**
     * showEngineerOperator method.
     */
    public void showEngineerOperator(){
        this.io.println(ENG_OPERATOR);
    }
}