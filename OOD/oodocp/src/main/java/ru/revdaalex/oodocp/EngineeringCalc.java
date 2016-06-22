package ru.revdaalex.oodocp;

import ru.revdaalex.oodocp.interfaces.IO;

/**
 * EngineeringCalc class.
 * Created by revdaalex on 21.06.2016.
 */
public class EngineeringCalc extends InteractCalc {
    /**
     * Variable calculator.
     */
    private Calculator calculator;
    /**
     * Variable calculatorMenu.
     */
    private EngineerCalcMenu engineerCalcMenu;
    /**
     * Variable menuValidator.
     */
    private MenuValidator menuValidator;
    /**
     * Variable validator.
     */
    private Validator validator;
    /**
     * Variable io.
     */
    private IO io;
    /**
     * Variable user choice.
     */
    private int uc;
    /**
     * Variable degree.
     */
    private double degree;
    /**
     * Variable rad.
     */
    private double rad;
    /**
     * Variable result.
     */
    private String result = "Результат:";
    /**
     * Main constructor.
     * @param calculator calculator.
     * @param io         io.
     */
    public EngineeringCalc(Calculator calculator, IO io) {
        super(calculator, io);
        this.io = io;
        this.calculator = calculator;
        this.engineerCalcMenu = new EngineerCalcMenu(io);
        this.menuValidator = new MenuValidator(io);
        this.validator = new Validator(io);
    }

    /**
     * Override method start from parent class.
     */
    @Override
    public void start() {
        boolean notExit = true;
        while(notExit){
            engineerCalcMenu.showMenu();
            uc = userChoice();
            switch (uc){
                case 1: add();break;

                case 2: sub();break;

                case 3: mult();break;

                case 4: div();break;

                case 5: calcResult();break;

                case 6: clear();break;

                case 7: notExit = false;break;

                case 8: engineerCalc(); break;
            }
        }
    }

    /**
     * Validate user choice in menu.
     * @return int user choice.
     */
    private int userChoice(){
        return menuValidator.validEngineerMenu();
    }

    /**
     * Method engineer calculator.
     */
    private void engineerCalc() {
        degree = validator.getDouble("Введите градусы угла");
        rad = degreeInRad(degree, Math.PI);
        engineerCalcMenu.showEngineerOperator();
        uc = menuValidator.validEngineerOperation();
        switch (uc) {
            case 1:
                calculator.sinus(rad);
                this.io.println(String.format("%s %s", result, calculator.getResult()));break;

            case 2:
                calculator.cosine(rad);
                this.io.println(String.format("%s %s", result, calculator.getResult()));
                break;

            case 3:
                calculator.tangent(rad);
                this.io.println(String.format("%s %s", result, calculator.getResult()));break;
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
