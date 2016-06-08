package ru.revdaalex.ood_srp;

/**
 * CalculatorMenu contains all user menus.
 * Created by revdaalex on 08.06.2016.
 */
public class CalculatorMenu {

    /**
     * Show main menu method.
     */
    public void showMenu(){
        System.out.println("Выберите действие");
        System.out.println("1. Сложить\n2. Вычесть\n3. Умножить\n4. Делить\n5. Произвести вычисление с полученным результатом\n6. Очистить\n7. Выйти из калькулятора");
    }

    /**
     * Show CalcResultMenu method.
     */
    public void showCalcResultMenu(){
        System.out.println("Выберете оператор");
        System.out.println("1. Сложить\n2. Вычесть\n3. Умножить\n4. Делить");
    }
}
