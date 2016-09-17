package ru.revdaalex.menu;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 *
 * Created by revdaalex on 15.09.2016.
 */
public class MenuTest {
    /**
     * Test RootMenu.
     */
    @Test
    public void whenCreateRootMenuLevel(){
        MockIO mockIO = new MockIO(new String[]{});
        RootMenu rootMenu = new RootMenu("Задача 1", mockIO);
        rootMenu.show();
        Assert.assertThat(mockIO.getOut().split("\n")[0], is("Задача 1"));
    }

    /**
     * Test ChapterMenu.
     */
    @Test
    public void whenCreateChapterMenuLevel(){
        MockIO mockIO = new MockIO(new String[]{});
        ChapterMenu chapterMenu = new ChapterMenu("Задача 1.1", mockIO);
        chapterMenu.show();
        Assert.assertThat(mockIO.getOut().split("\n")[0], is("----Задача 1.1"));
    }

    /**
     * Test SubMenu.
     */
    @Test
    public void whenCreateSubMenuLevel(){
        MockIO mockIO = new MockIO(new String[]{});
        SubMenu subMenu = new SubMenu("Задача 1.1.1", mockIO);
        subMenu.show();
        Assert.assertThat(mockIO.getOut().split("\n")[0], is("------Задача 1.1.1"));
    }
}