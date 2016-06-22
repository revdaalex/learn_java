package ru.revdaalex.oodocp;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

/**
 * Test EngineerCalcMenu class.
 * Created by revdaalex on 22.06.2016.
 */
public class EngineerCalcMenuTest {
    /**
     * Main info test.
     */
    @Test
    public void whenGetMenuShouldPrintInfo(){
        MockIO mockIO = new MockIO(new String[]{});
        EngineerCalcMenu engineerCalcMenu = new EngineerCalcMenu(mockIO);
        engineerCalcMenu.showMenu();
        Assert.assertThat(mockIO.getOut().split("\n")[0], is("Выберите действие"));
    }

    /**
     * First engineer menu item test.
     */
    @Test
    public void theFirstMenuItem(){
        MockIO mockIO = new MockIO(new String[]{});
        EngineerCalcMenu engineerCalcMenu = new EngineerCalcMenu(mockIO);
        engineerCalcMenu.showMenu();
        Assert.assertThat(mockIO.getOut().split("\n")[1], is("1. Сложить"));
    }

    /**
     * Second engineer menu item test.
     */
    @Test
    public void theSecondMenuItem(){
        MockIO mockIO = new MockIO(new String[]{});
        EngineerCalcMenu engineerCalcMenu = new EngineerCalcMenu(mockIO);
        engineerCalcMenu.showMenu();
        Assert.assertThat(mockIO.getOut().split("\n")[2], is("2. Вычесть"));
    }

    /**
     * Third engineer menu item test.
     */
    @Test
    public void theThirdMenuItem(){
        MockIO mockIO = new MockIO(new String[]{});
        EngineerCalcMenu engineerCalcMenu = new EngineerCalcMenu(mockIO);
        engineerCalcMenu.showMenu();
        Assert.assertThat(mockIO.getOut().split("\n")[3], is("3. Умножить"));
    }

    /**
     * Fourth engineer menu item test.
     */
    @Test
    public void theFourthMenuItem(){
        MockIO mockIO = new MockIO(new String[]{});
        EngineerCalcMenu engineerCalcMenu = new EngineerCalcMenu(mockIO);
        engineerCalcMenu.showMenu();
        Assert.assertThat(mockIO.getOut().split("\n")[4], is("4. Делить"));
    }

    /**
     * Fifth engineer menu item test.
     */
    @Test
    public void theFifthMenuItem(){
        MockIO mockIO = new MockIO(new String[]{});
        EngineerCalcMenu engineerCalcMenu = new EngineerCalcMenu(mockIO);
        engineerCalcMenu.showMenu();
        Assert.assertThat(mockIO.getOut().split("\n")[5], is("5. Произвести вычисление с полученным результатом"));
    }

    /**
     * Sixth engineer menu item test.
     */
    @Test
    public void theSixthMenuItem(){
        MockIO mockIO = new MockIO(new String[]{});
        EngineerCalcMenu engineerCalcMenu = new EngineerCalcMenu(mockIO);
        engineerCalcMenu.showMenu();
        Assert.assertThat(mockIO.getOut().split("\n")[6], is("6. Очистить"));
    }

    /**
     * Seventh engineer menu item test.
     */
    @Test
    public void theSeventhMenuItem(){
        MockIO mockIO = new MockIO(new String[]{});
        EngineerCalcMenu engineerCalcMenu = new EngineerCalcMenu(mockIO);
        engineerCalcMenu.showMenu();
        Assert.assertThat(mockIO.getOut().split("\n")[7], is("7. Выйти из калькулятора"));
    }

    /**
     * Eighth engineer engineer menu item test.
     */
    @Test
    public void engineerEighthMenuItem(){
        MockIO mockIO = new MockIO(new String[]{});
        EngineerCalcMenu engineerCalcMenu = new EngineerCalcMenu(mockIO);
        engineerCalcMenu.showMenu();
        Assert.assertThat(mockIO.getOut().split("\n")[8], is("8. Перейти в инжинерный калькулятор"));
    }

    // Test Engineer operators item.

    /**
     * First engineer operator test.
     */
    @Test
    public void firstEngineerOperator(){
        MockIO mockIO = new MockIO(new String[]{});
        EngineerCalcMenu engineerCalcMenu = new EngineerCalcMenu(mockIO);
        engineerCalcMenu.showEngineerOperator();
        Assert.assertThat(mockIO.getOut().split("\n")[0], is("1. Произвести вычисление синуса"));
    }

    /**
     * Second engineer operator test.
     */
    @Test
    public void secondEngineerOperator(){
        MockIO mockIO = new MockIO(new String[]{});
        EngineerCalcMenu engineerCalcMenu = new EngineerCalcMenu(mockIO);
        engineerCalcMenu.showEngineerOperator();
        Assert.assertThat(mockIO.getOut().split("\n")[1], is("2. Произвести вычисление косинуса"));
    }

    /**
     * Third engineer operator test.
     */
    @Test
    public void thirdEngineerOperator(){
        MockIO mockIO = new MockIO(new String[]{});
        EngineerCalcMenu engineerCalcMenu = new EngineerCalcMenu(mockIO);
        engineerCalcMenu.showEngineerOperator();
        Assert.assertThat(mockIO.getOut().split("\n")[2], is("3. Произвести вычисление тангенса"));
    }

}