package ru.revdaalex.oodocp;

import ru.revdaalex.oodocp.interfaces.IO;

/**
 * CalculatorMenu contains all user menus.
 * Created by revdaalex on 08.06.2016.
 */
public class CalculatorMenu {
    private static final String SELECT = "Выберите действие";
    /**
     * Base operations.
     */
    private static final String BASE_OPTS = new StringBuilder()
            .append("1. Сложить\n2. Вычесть\n")
            .append("3. Умножить\n4. Делить")
            .toString();
    /**
    * Additional operations.
    */
    private static final String ADD__OPTS = new StringBuilder()
            .append("5. Произвести вычисление с полученным результатом\n")
            .append("6. Очистить\n")
            .append("7. Выйти из калькулятора")
            .toString();

    private final IO io;

    public CalculatorMenu(IO io) {
        this.io = io;
    }


    /**
     * Show main menu method.
     */
    public void showMenu(){
        this.io.println(SELECT);
        this.io.println(BASE_OPTS);
        this.io.println(ADD__OPTS);
    }

    /**
     * Show CalcResultMenu method.
     */
    public void showCalcResultMenu(){
        this.io.println(BASE_OPTS);
    }
}
