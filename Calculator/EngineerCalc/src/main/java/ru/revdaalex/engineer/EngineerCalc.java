package ru.revdaalex.engineer;

import ru.revdaalex.calculator.Calculator;
import ru.revdaalex.calculator.InteractCalc;
import ru.revdaalex.calculator.interfaces.IO;

/**
 * Created by revdaalex on 26.06.2016.
 */
public class EngineerCalc extends InteractCalc {
    /**
     * Main constructor.
     *
     * @param calculator calculator.
     * @param io         io.
     */
    public EngineerCalc(Calculator calculator, IO io) {
        super(calculator, io);
    }

    @Override
    public void start() {
        super.start();
    }
}
