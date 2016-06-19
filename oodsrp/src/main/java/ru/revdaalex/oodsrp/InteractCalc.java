package ru.revdaalex.oodsrp;

import ru.revdaalex.oodsrp.interfaces.IO;

import java.util.Scanner;

/**
 * InteractCalc starts calculator.
 * Created by revdaalex on 07.06.2016.
 */
public class InteractCalc {
    /**
     * Variable input output.
     */
    private final IO io;
    /**
     * Variable calculator.
     */
    private Calculator calculator;
    /**
     * Variable user choice.
     */
    private int uc;
    /**
     * Variable firstNumber.
     */
    private double first;
    /**
     * Variable secondNumber.
     */
    private double second;
    /**
     * Variable validation.
     */
    private boolean isValid;

    /**
     * main constructor.
     * @param calculator calculator.
     */
    public InteractCalc(Calculator calculator, IO io) {
        this.calculator = calculator;
        this.io = io;
    }

    public static void main(String[] args) {
        new InteractCalc(new Calculator(),
                new ConsoleIO(new Scanner(System.in), System.out)).start();
    }

    /**
     * start method.
     */
    public void start(){
        boolean notExit = true;
        CalculatorMenu calculatorMenu = new CalculatorMenu(io);
        while(notExit){
            calculatorMenu.showMenu();
            uc = userChoice();
            switch (uc){
                case 1: add();break;

                case 2: sub();break;

                case 3: mult();break;

                case 4: div();break;

                case 5: calcResult();break;

                case 6: clear();break;

                case 7: notExit = false;break;
            }
        }
    }

    /**
     * validate user choice in main menu.
     * @return int number of choice in menu.
     */
    private int userChoice(){
        MenuValidator menuValidator = new MenuValidator(io);
        return uc = menuValidator.validMainMenu();
    }

    /**
     * validate user choice in CalcResult method.
     * @return int number of choice in CalcResultMenu.
     */
    private int validCalcResultMenu(){
        MenuValidator menuValidator = new MenuValidator(io);
        return uc = menuValidator.validCalcResultMenu();
    }

    /**
     * add method with input numbers validation.
     */
    public void add(){
        Validator validator = new Validator(io);
        first = validator.getDouble("Введите первое число");
        second = validator.getDouble("Введите второе число");
        calculator.add(first, second);
        System.out.println("Результат: " + calculator.getResult());
    }

    /**
     * sub method with input numbers validation.
     */
    private void sub(){
        Validator validator = new Validator(io);
        first = validator.getDouble("Введите первое число");
        second = validator.getDouble("Введите второе число");
        calculator.sub(first, second);
        System.out.println("Результат: " + calculator.getResult());
    }

    /**
     * mult method with input numbers validation.
     */
    private void mult(){
        Validator validator = new Validator(io);
        first = validator.getDouble("Введите первое число");
        second = validator.getDouble("Введите второе число");
        calculator.mult(first, second);
        System.out.println("Результат: " + calculator.getResult());
    }

    /**
     * div method with input numbers validation.
     */
    private void div(){
        Validator validator = new Validator(io);
        first = validator.getDouble("Введите первое число");
        isValid = true;
        while (isValid) {
            second = validator.getDouble("Введите второе число");
            if (second == 0) {
                System.out.println("Деление на нуль не возможно!\nПовторите ввод данных.");
            } else {
                isValid = false;
            }
        }
        calculator.div(first, second);
        System.out.println("Результат: " + calculator.getResult());
    }

    /**
     * Cleaning the result.
     */
    private void clear(){
        if (calculator.getResult() == 0){
            System.out.println("Результат отсутствует");
        } else {
            calculator.clear();
            System.out.println("Результат сброшен");
        }
    }

    /**
     * calcResult method with input numbers validation.
     */
    private void calcResult() {
        CalculatorMenu calculatorMenu = new CalculatorMenu(io);
        Validator validator = new Validator(io);
        first = validator.getDouble("Введите число");
        calculatorMenu.showCalcResultMenu();
        uc = validCalcResultMenu();
        switch (uc) {
            case 1:
                System.out.println("Результат: " + calculator.add(first, calculator.getResult()));break;

            case 2:
                System.out.println("Результат: " + calculator.sub(first, calculator.getResult()));break;

            case 3:
                System.out.println("Результат: " + calculator.mult(first, calculator.getResult()));break;

            case 4: {
                if (calculator.getResult() == 0){
                    System.out.println("Деление на нуль не возможно!");

                }else {
                    System.out.println("Результат: " + calculator.div(first, calculator.getResult()));
                    break;
                }
            }
        }
    }
}
