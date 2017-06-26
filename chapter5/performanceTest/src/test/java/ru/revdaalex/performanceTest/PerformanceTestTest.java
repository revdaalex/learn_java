package ru.revdaalex.performanceTest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;

import static org.junit.Assert.*;

/**
 * PerformanceTest test class.
 * Created by revdaalex on 26.06.2017.
 */
public class PerformanceTestTest {

    ArrayList arrayTest = new ArrayList();
    LinkedList linkedTest = new LinkedList();
    TreeSet treeSetTest = new TreeSet();

    PerformanceTest pt = new PerformanceTest();

    /**
     * Performance test ArrayList.
     */
    @Test
    public void testArray(){
        System.out.println("Add time Array " + pt.add(arrayTest, 10000));
        System.out.println("Delete time Array " + pt.delete(arrayTest, 1000));
    }

    /**
     * Performance test LinkedList.
     */
    @Test
    public void testLinked(){
        System.out.println("Add time Linked " + pt.add(linkedTest, 10000));
        System.out.println("Delete time Linked " + pt.delete(linkedTest, 1000));
    }

    /**
     * Performance test TreeSet.
     */
    @Test
    public void testTreeSet(){
        System.out.println("Add time TreeSet " + pt.add(treeSetTest, 10000));
        System.out.println("Delete time TreeSet " + pt.delete(treeSetTest, 1000));
    }
}