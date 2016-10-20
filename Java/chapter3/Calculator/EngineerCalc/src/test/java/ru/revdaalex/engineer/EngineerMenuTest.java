package ru.revdaalex.engineer;

import org.junit.Assert;
import org.junit.Test;
import ru.revdaalex.calculator.MockIO;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 *
 * Created by RevdaAlex on 26.06.2016.
 */
public class EngineerMenuTest {

    @Test
    public void whenUserSelectStandardCalculator(){
        MockIO mockIO = new MockIO(new String[]{});
        EngineerMenu engineerMenu = new EngineerMenu(mockIO);
        engineerMenu.startEngineerMenu();
        Assert.assertThat(mockIO.getOut().split("\n")[0], is("1. Стандартный калькулятор"));
    }

    @Test
    public void whenUserSelectEngineerCalculator(){
        MockIO mockIO = new MockIO(new String[]{});
        EngineerMenu engineerMenu = new EngineerMenu(mockIO);
        engineerMenu.startEngineerMenu();
        Assert.assertThat(mockIO.getOut().split("\n")[1], is("2. Инженерный калькулятор"));
    }

    @Test
    public void whenUserSelectExitCalculator(){
        MockIO mockIO = new MockIO(new String[]{});
        EngineerMenu engineerMenu = new EngineerMenu(mockIO);
        engineerMenu.startEngineerMenu();
        Assert.assertThat(mockIO.getOut().split("\n")[2], is("3. Закрыть калькулятор"));
    }

    @Test
    public void firstEngineerOperator(){
        MockIO mockIO = new MockIO(new String[]{});
        EngineerMenu engineerMenu = new EngineerMenu(mockIO);
        engineerMenu.showEngineerOperator();
        Assert.assertThat(mockIO.getOut().split("\n")[0], is("1. Произвести вычисление синуса"));
    }

    @Test
    public void secondEngineerOperator(){
        MockIO mockIO = new MockIO(new String[]{});
        EngineerMenu engineerMenu = new EngineerMenu(mockIO);
        engineerMenu.showEngineerOperator();
        Assert.assertThat(mockIO.getOut().split("\n")[1], is("2. Произвести вычисление косинуса"));
    }

    @Test
    public void thirdEngineerOperator(){
        MockIO mockIO = new MockIO(new String[]{});
        EngineerMenu engineerMenu = new EngineerMenu(mockIO);
        engineerMenu.showEngineerOperator();
        Assert.assertThat(mockIO.getOut().split("\n")[2], is("3. Произвести вычисление тангенса"));
    }

    @Test
    public void fourthEngineerOperator(){
        MockIO mockIO = new MockIO(new String[]{});
        EngineerMenu engineerMenu = new EngineerMenu(mockIO);
        engineerMenu.showEngineerOperator();
        Assert.assertThat(mockIO.getOut().split("\n")[3], is("4. Вернуться к выбору типа калькулятора"));
    }
}