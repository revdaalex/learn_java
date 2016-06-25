import ru.revdaalex.calculator.Calculator;
import ru.revdaalex.calculator.ConsoleIO;
import ru.revdaalex.calculator.InteractCalc;


import java.util.Scanner;

/**
 *
 * Created by revdaalex on 24.06.2016.
 */
public class Test {
    public static void main(String[] args) {
        new InteractCalc(new Calculator(), new ConsoleIO(new Scanner(System.in), System.out)).start();
    }
}
