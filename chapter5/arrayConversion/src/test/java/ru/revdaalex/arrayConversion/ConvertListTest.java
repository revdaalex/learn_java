package ru.revdaalex.arrayConversion;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * ConvertListTest class.
 * Created by revdaalex on 17.07.2017.
 */
public class ConvertListTest {

    ConvertList convertList;

    @Before
    public void setUp(){
        convertList = new ConvertList();
    }

    @Test
    public void testConvertArrayToArrayList(){
        int[][] array = {{1, 2, 3},{4, 5, 6}};

        List list = convertList.toList(array);
        List result = Arrays.asList(1, 2, 3, 4, 5, 6);

        assertThat(result, is(list));
    }

    @Test
    public void testConvertArrayListToArrayMultiple(){
        List list = new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        int[][] array = convertList.toArray(list, 3);
        int[][] result = {{1, 2, 3},{4, 5, 6},{7, 8 ,9}};

        assertThat(result, is(array));
    }

    @Test
    public void testConvertArrayListToArrayNotMultiple(){
        List list = new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        int[][] array = convertList.toArray(list, 3);
        int[][] result = {{1, 2, 3},{4, 5, 6},{7, 0 ,0}};

        assertThat(result, is(array));
    }

    @Test
    public void testConvertListArraysToListInteger(){
        List<int[]> list = new ArrayList<int[]>();
        list.add(new int[]{1, 2});
        list.add(new int[]{3, 4, 5, 6});

        List<Integer> first = convertList.convert(list);
        List<Integer> result = Arrays.asList(1, 2, 3, 4, 5, 6);

        assertThat(result, is(first));
    }

}