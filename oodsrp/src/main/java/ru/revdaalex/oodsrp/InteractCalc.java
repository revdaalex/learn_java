package ru.revdaalex.ood_srp;

import java.util.Scanner;

/**
 * InteractCalc starts calculator.
 * Created by revdaalex on 07.06.2016.
 */
public class InteractCalc {
    /**
     * Variable calculator.
     */
    private Calculator calculator;
    /**
     * Variable scanner.
     */
    private Scanner scanner;
    /**
     * Variable calculatorMenu.
     */
    private CalculatorMenu calculatorMenu;
    /**
     * Variable user choice.
     */
    private int uc;
    /**
     * Variable firstNumber.
     */
    private int firstNumber;
    /**
     * Variable secondNumber.
     */
    private int secondNumber;
    /**
     * Variable validation.
     */
    private boolean isValid;

    /**
     * main constructor.
     * @param calculator calculator.
     * @param scanner scanner.
     * @param calculatorMenu calculatorMenu.
     */
    public InteractCalc(Calculator calculator, Scanner scanner, CalculatorMenu calculatorMenu) {
        this.calculator = calculator;
        this.scanner = scanner;
        this.calculatorMenu = calculatorMenu;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        CalculatorMenu calculatorMenu = new CalculatorMenu();
        InteractCalc interactCalc = new InteractCalc(calculator, scanner, calculatorMenu);
        interactCalc.start();
    }

    /**
     * start method.
     */
    private void start(){
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
     * @return int number of choice in meu.
     */
    private int userChoice(){
       int choice = 0;
        isValid = true;
        while (isValid) {
            this.uc = scanner.nextInt();
            if(uc == 0 || uc > 7) {
                System.out.println("Нет такого пункта меню\nПопробуйте еще раз.");
            } else {
                choice = uc;
                isValid = false;
            }
        } return choice;
    }

    /**
     * validate user choice in CalcResult method.
     * @return int number of choice in CalcResultMenu.
     */
    private int validCalcResultMenu(){
        int choice = 0;
        isValid = true;
        while (isValid) {
            this.uc = scanner.nextInt();
            if(uc == 0 || uc > 4) {
                System.out.println("Нет такого оператора\nПопробуйте еще раз.");
            } else {
                choice = uc;
                isValid = false;
            }
        } return choice;
    }

    /**
     * add method with input numbers validation.
     * @throws NumberFormatException if failed validation.
     */
    private void add() {
        boolean firstCheck = true;
        boolean secondCheck = true;
        System.out.println("Введите первое целое число");
        while (firstCheck) {
            try {
                String number = scanner.next();
                firstNumber = Integer.parseInt(number);
                firstCheck = false;
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не целое число\nПопробуйте еще раз.");
            }
        }
        System.out.println("Введите второе число");
        while (secondCheck) {
            try {
                String number = scanner.next();
                secondNumber = Integer.parseInt(number);
                secondCheck = false;
            }catch (NumberFormatException e){
                System.out.println("Вы ввели не целое число\nПопробуйте еще раз.");
            }
        }
        calculator.add(firstNumber, secondNumber);
        System.out.println("Результат: " + calculator.getResult());
    }

    /**
     * sub method with input numbers validation.
     * @throws NumberFormatException if failed validation.
     */
    private void sub(){
        boolean firstCheck = true;
        boolean secondCheck = true;
        System.out.println("Введите первое целое число");
        while (firstCheck) {
            try {
                String number = scanner.next();
                firstNumber = Integer.parseInt(number);
                firstCheck = false;
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не целое число\nПопробуйте еще раз.");
            }
        }
        System.out.println("Введите второе число");
        while (secondCheck) {
            try {
                String number = scanner.next();
                secondNumber = Integer.parseInt(number);
                secondCheck = false;
            }catch (NumberFormatException e){
                System.out.println("Вы ввели не целое число\nПопробуйте еще раз.");
            }
        }
        calculator.sub(firstNumber, secondNumber);
        System.out.println("Результат: " + calculator.getResult());
    }

    /**
     * mult method with input numbers validation.
     * @throws NumberFormatException if failed validation.
     */
    private void mult(){
        boolean firstCheck = true;
        boolean secondCheck = true;
        System.out.println("Введите первое целое число");
        while (firstCheck) {
            try {
                String number = scanner.next();
                firstNumber = Integer.parseInt(number);
                firstCheck = false;
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не целое число\nПопробуйте еще раз.");
            }
        }
        System.out.println("Введите второе число");
        while (secondCheck) {
            try {
                String number = scanner.next();
                secondNumber = Integer.parseInt(number);
                secondCheck = false;
            }catch (NumberFormatException e){
                System.out.println("Вы ввели не целое число\nПопробуйте еще раз.");
            }
        }
        calculator.mult(firstNumber, secondNumber);
        System.out.println("Результат: " + calculator.getResult());
    }

    /**
     * div method with input numbers validation.
     * @throws NumberFormatException if failed validation.
     */
    private void div(){
        isValid = true;
        System.out.println("Введите первое целое число");
        while (isValid) {
            try {
                String number = scanner.next();
                firstNumber = Integer.parseInt(number);
                isValid = false;
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не целое число\nПопробуйте еще раз.");
            }
        }
        isValid = true;
        while (isValid) {
            System.out.println("Введите второе целое число");
            try {
                String number = scanner.next();
                secondNumber = Integer.parseInt(number);
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не целое число\nПопробуйте еще раз.");
            }
            if (secondNumber == 0) {
                System.out.println("Деление на нуль не возможно!\nПовторите ввод данных.");
            } else {
                isValid = false;
            }
        }
        calculator.div(firstNumber, secondNumber);
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
     * @throws NumberFormatException if failed validation.
     */
    private void calcResult() {
        isValid = true;
        System.out.println("Введите целое число");
        while (isValid) {
            try {
                String number = scanner.next();
                firstNumber = Integer.parseInt(number);
                isValid = false;
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не целое число\nПопробуйте еще раз.");
            }
        }
        calculatorMenu.showCalcResultMenu();
        uc = validCalcResultMenu();
        switch (uc) {
            case 1:
                System.out.println("Результат: " + calculator.add(firstNumber, calculator.getResult()));break;

            case 2:
                System.out.println("Результат: " + calculator.sub(firstNumber, calculator.getResult()));break;

            case 3:
                System.out.println("Результат: " + calculator.mult(firstNumber, calculator.getResult()));break;

            case 4: {
                if (calculator.getResult() == 0){
                    System.out.println("Деление на нуль не возможно!");

                }else {
                    System.out.println("Результат: " + calculator.div(firstNumber, calculator.getResult()));
                    break;
                }
            }
        }
    }
}
