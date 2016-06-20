package ru.revdaalex.oodsrp;

import ru.revdaalex.oodsrp.interfaces.IO;

import java.util.Scanner;

/**
 * InteractCalc starts calculator.
 * Created by revdaalex on 07.06.2016.
 */
public class InteractCalc {
    /**
     * Variable calculatorMenu.
     */
    private CalculatorMenu calculatorMenu;
    /**
     * Variable menuValidator.
     */
    private MenuValidator menuValidator;
    /**
     * Variable validator.
     */
    private Validator validator;
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
     * Variable String result.
     */
    private String result = "Результат:";

    /**
     * Main constructor.
     * @param calculator calculator.
     * @param io io.
     */
    public InteractCalc(Calculator calculator, IO io) {
        this.calculator = calculator;
        this.io = io;
        this.calculatorMenu = new CalculatorMenu(io);
        this.menuValidator = new MenuValidator(io);
        this.validator = new Validator(io);
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
        return menuValidator.validMainMenu();
    }

    /**
     * validate user choice in CalcResult method.
     * @return int number of choice in CalcResultMenu.
     */
    private int validCalcResultMenu(){
        return menuValidator.validCalcResultMenu();
    }

    /**
     * add method with input numbers validation.
     */
    public void add(){
        first = validator.getDouble("Введите первое число");
        second = validator.getDouble("Введите второе число");
        calculator.add(first, second);
        this.io.println(String.format("%s %s", result, calculator.getResult()));
    }

    /**
     * sub method with input numbers validation.
     */
    private void sub(){
        first = validator.getDouble("Введите первое число");
        second = validator.getDouble("Введите второе число");
        calculator.sub(first, second);
        this.io.println(String.format("%s %s", result, calculator.getResult()));
    }

    /**
     * mult method with input numbers validation.
     */
    private void mult(){
        first = validator.getDouble("Введите первое число");
        second = validator.getDouble("Введите второе число");
        calculator.mult(first, second);
        this.io.println(String.format("%s %s", result, calculator.getResult()));
    }

    /**
     * div method with input numbers validation.
     */
    private void div(){
        first = validator.getDouble("Введите первое число");
        isValid = true;
        while (isValid) {
            second = validator.getDouble("Введите второе число");
            if (second == 0) {
                this.io.println("Деление на нуль не возможно!\nПовторите ввод данных.");
            } else {
                isValid = false;
            }
        }
        calculator.div(first, second);
        this.io.println(String.format("%s %s", result, calculator.getResult()));
    }

    /**
     * Cleaning the result.
     */
    private void clear(){
        if (calculator.getResult() == 0){
            this.io.println("Результат отсутствует");
        } else {
            calculator.clear();
            this.io.println("Результат сброшен");
        }
    }

    /**
     * calcResult method with input numbers validation.
     */
    private void calcResult() {
        first = validator.getDouble("Введите число");
        calculatorMenu.showCalcResultMenu();
        uc = validCalcResultMenu();
        switch (uc) {
            case 1:
                calculator.add(first, calculator.getResult());
                this.io.println(String.format("%s %s", result, calculator.getResult()));break;

            case 2:
                calculator.sub(first, calculator.getResult());
                this.io.println(String.format("%s %s", result, calculator.getResult()));break;

            case 3:
                calculator.mult(first, calculator.getResult());
                this.io.println(String.format("%s %s", result, calculator.getResult()));break;

            case 4: {
                if (calculator.getResult() == 0){
                    this.io.println("Деление на нуль не возможно!");

                }else {
                    calculator.div(first, calculator.getResult());
                    this.io.println(String.format("%s %s", result, calculator.getResult()));
                    break;
                }
            }
        }
    }
}