package ru.revdaalex.oodsrp;

/**
 * Calculator logic.
 * Created by revdaalex on 07.06.2016.
 */
public class Calculator {

    /**
     * final result.
     */
    private double result;

    /**
     * Summation of numbers.
     * @param first int first.
     * @param second int second.
     * @return result.
     */
    public double add(double first, double second){
        return result = first + second;
    }

    /**
     * Subtraction of numbers.
     * @param first int first.
     * @param second int second.
     * @return result.
     */
    public double sub(double first, double second){
        return result = first - second;
    }

    /**
     * Multiplication.
     * @param first int first.
     * @param second int second.
     * @return result.
     */
    public double mult(double first, double second){
        return result = first * second;
    }

    /**
     * Divide numbers.
     * @param first int first.
     * @param second int second.
     * @return result.
     */
    public double div(double first, double second){
        return result = first / second;
    }

    /**
     * Clear results.
     */
    public void clear(){
        this.result = 0;
    }

    /**
     * Return the result.
     * @return result.
     */
    public double getResult() {
        return result;
    }
}
