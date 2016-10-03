package ru.revdaalex.node;

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

}