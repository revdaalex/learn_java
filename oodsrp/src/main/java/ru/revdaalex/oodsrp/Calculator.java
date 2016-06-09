package ru.revdaalex.oodsrp;

/**
 * Calculator logic.
 * Created by revdaalex on 07.06.2016.
 */
public class Calculator {

    /**
     * final result.
     */
    private int result;

    /**
     * Summation of numbers.
     * @param first int first.
     * @param second int second.
     * @return result.
     */
    public int add(int first, int second){
        return result = first + second;
    }

    /**
     * Subtraction of numbers.
     * @param first int first.
     * @param second int second.
     * @return result.
     */
    public int sub(int first, int second){
        return result = first - second;
    }

    /**
     * Multiplication.
     * @param first int first.
     * @param second int second.
     * @return result.
     */
    public int mult(int first, int second){
        return result = first * second;
    }

    /**
     * Divide numbers.
     * @param first int first.
     * @param second int second.
     * @return result.
     */
    public int div(int first, int second){
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
    public int getResult() {
        return result;
    }
}
