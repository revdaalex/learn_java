package ru.revdaalex.engineer;

import ru.revdaalex.calculator.Calculator;
import ru.revdaalex.calculator.InteractCalc;
import ru.revdaalex.calculator.interfaces.IO;

/**
 * EngineerCalc class.
 * Created by revdaalex on 26.06.2016.
 */
public class EngineerCalc extends InteractCalc {
    /**
     * Variable engineerMenu.
     */
    EngineerMenu engineerMenu;
    /**
     * Variable user choice.
     */
    private int uc;
    /**
     * Variable rad.
     */
    private double rad;
    /**
     * Variable degree.
     */
    private double degree;
    /**
     * Main constructor.
     *
     * @param calculator calculator.
     * @param io         io.
     */
    public EngineerCalc(Calculator calculator, IO io) {
        super(calculator, io);
        this.engineerMenu = new EngineerMenu(io);
    }

    /**
     * Override start method.
     */
    @Override
    public void start() {
        boolean notExit = true;
        while(notExit) {
            engineerMenu.startEngineerMenu();
            this.uc = menuValidator.validEngineerMenu();
            switch (uc){
                case 1: super.start();break;
                case 2: engineerOperator();break;
                case 3: notExit = false;break;
            }
        }
    }

    /**
     * Method engineer calculator.
     */
    private void engineerOperator(){
        boolean notExit = true;
        while (notExit){
            engineerMenu.showEngineerOperator();
            this.uc = menuValidator.validEngineerOperation();
            switch (uc) {
                case 1:
                    degree = validator.getDouble("Введите градусы угла");
                    rad = degreeInRad(degree, Math.PI);
                    calculator.sinus(rad);
                    this.io.println(String.format("%s %s", result, calculator.getResult()));break;

                case 2:
                    degree = validator.getDouble("Введите градусы угла");
                    rad = degreeInRad(degree, Math.PI);
                    calculator.cosine(rad);
                    this.io.println(String.format("%s %s", result, calculator.getResult()));
                    break;

                case 3:
                    degree = validator.getDouble("Введите градусы угла");
                    rad = degreeInRad(degree, Math.PI);
                    calculator.tangent(rad);
                    this.io.println(String.format("%s %s", result, calculator.getResult()));break;

                case 4: notExit = false;break;
            }
        }
    }

    /**
     * Method degree in radian.
     * @param degree degree.
     * @param pi pi.
     * @return
     */
    private double degreeInRad(double degree, double pi) {
        rad = (degree * pi) / 180;
        return rad;
    }
}
