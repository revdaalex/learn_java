package ru.revdaalex.menu;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 *
 * Created by revdaalex on 28.09.2016.
 */
public class MenuTest {

    ArrayList<Menu> menus = new ArrayList<Menu>(Arrays.asList(new Menu("Задание 1", null, 0),
            new Menu("Задание 1.1", "Задание 1", 1),
            new Menu("Задание 1.1.1", "Задание 1.1", 2), new Menu("Задание 1.1.2", "Задание 1.1", 2),
            new Menu("Задание 1.2", "Задание 1", 1), new Menu("Задание 2", null, 0)));

    @Test
    public void test0LevelMenu(){
        Menu menu = new Menu();
        Map<String, ArrayList<Menu>> menuMap = menu.construct(menus);
        String expected = menuMap.get(null).get(0).getName();
        String result = "Задание 1";
        Assert.assertThat(expected, is(result));
    }

    @Test
    public void test1LevelMenu(){
        Menu menu = new Menu();
        Map<String, ArrayList<Menu>> menuMap = menu.construct(menus);
        String expected = menuMap.get("Задание 1").get(1).getName();
        String result = "Задание 1.2";
        Assert.assertThat(expected, is(result));
    }

    @Test
    public void test2LevelMenu(){
        Menu menu = new Menu();
        Map<String, ArrayList<Menu>> menuMap = menu.construct(menus);
        String expected = menuMap.get("Задание 1.1").get(1).getName();
        String result = "Задание 1.1.2";
        Assert.assertThat(expected, is(result));
    }

}