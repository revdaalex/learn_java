package ru.revdaalex.calculator;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

/**
 * Test CalculatorMenu.
 * Created by RevdaAlex on 19.06.2016.
 */
public class CalculatorMenuTest {
    /**
     * Main info test.
     */
    @Test
    public void whenGetMenuShouldPrintInfo(){
        MockIO mockIO = new MockIO(new String[]{});
        CalculatorMenu calculatorMenu = new CalculatorMenu(mockIO);
        calculatorMenu.showMenu();
        Assert.assertThat(mockIO.getOut().split("\n")[0], is("Выберите действие"));
    }

    /**
     * First menu item test.
     */
    @Test
    public void theFirstMenuItem(){
        MockIO mockIO = new MockIO(new String[]{});
        CalculatorMenu calculatorMenu = new CalculatorMenu(mockIO);
        calculatorMenu.showMenu();
        Assert.assertThat(mockIO.getOut().split("\n")[1], is("1. Сложить"));
    }

    /**
     * Second menu item test.
     */
    @Test
    public void theSecondMenuItem(){
        MockIO mockIO = new MockIO(new String[]{});
        CalculatorMenu calculatorMenu = new CalculatorMenu(mockIO);
        calculatorMenu.showMenu();
        Assert.assertThat(mockIO.getOut().split("\n")[2], is("2. Вычесть"));
    }

    /**
     * Third menu item test.
     */
    @Test
    public void theThirdMenuItem(){
        MockIO mockIO = new MockIO(new String[]{});
        CalculatorMenu calculatorMenu = new CalculatorMenu(mockIO);
        calculatorMenu.showMenu();
        Assert.assertThat(mockIO.getOut().split("\n")[3], is("3. Умножить"));
    }

    /**
     * Fourth menu item test.
     */
    @Test
    public void theFourthMenuItem(){
        MockIO mockIO = new MockIO(new String[]{});
        CalculatorMenu calculatorMenu = new CalculatorMenu(mockIO);
        calculatorMenu.showMenu();
        Assert.assertThat(mockIO.getOut().split("\n")[4], is("4. Делить"));
    }

    /**
     * Fifth menu item test.
     */
    @Test
    public void theFifthMenuItem(){
        MockIO mockIO = new MockIO(new String[]{});
        CalculatorMenu calculatorMenu = new CalculatorMenu(mockIO);
        calculatorMenu.showMenu();
        Assert.assertThat(mockIO.getOut().split("\n")[5], is("5. Произвести вычисление с полученным результатом"));
    }

    /**
     * Sixth menu item test.
     */
    @Test
    public void theSixthMenuItem(){
        MockIO mockIO = new MockIO(new String[]{});
        CalculatorMenu calculatorMenu = new CalculatorMenu(mockIO);
        calculatorMenu.showMenu();
        Assert.assertThat(mockIO.getOut().split("\n")[6], is("6. Очистить"));
    }

    /**
     * Seventh menu item test.
     */
    @Test
    public void theSeventhMenuItem(){
        MockIO mockIO = new MockIO(new String[]{});
        CalculatorMenu calculatorMenu = new CalculatorMenu(mockIO);
        calculatorMenu.showMenu();
        Assert.assertThat(mockIO.getOut().split("\n")[7], is("7. Выйти из калькулятора"));
    }
}