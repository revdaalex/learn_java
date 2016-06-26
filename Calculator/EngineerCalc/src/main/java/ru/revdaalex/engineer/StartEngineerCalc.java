package ru.revdaalex.engineer;

import ru.revdaalex.calculator.Calculator;
import ru.revdaalex.calculator.ConsoleIO;


import java.util.Scanner;

/**
 *
 * Created by revdaalex on 24.06.2016.
 */
public class StartEngineerCalc {
    public static void main(String[] args) {
        new EngineerCalc(new Calculator(), new ConsoleIO(new Scanner(System.in), System.out)).start();
    }
}
