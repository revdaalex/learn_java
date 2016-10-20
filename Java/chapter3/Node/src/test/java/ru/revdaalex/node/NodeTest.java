package ru.revdaalex.node;

import org.junit.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by RevdaAlex on 03.10.2016.
 */
public class NodeTest {

    Node root = new Node("Задание 1");

    Node node1 = root.addChildren("Задание 1.1");

    Node node2 = node1.addChildren("Задание 1.1.1");

    Node node3 = node1.addChildren("Задание 1.1.2");

    Node node4 = root.addChildren("Задание 1.2");

    @org.junit.Test
    public void testFindCurrentNode(){
        String result = "Задание 1.1.2";
        root.setSelect(new SelectCurrentNode(root));
        Assert.assertThat(root.select("Задание 1.1.2").getValue(), is(result));

    }

}