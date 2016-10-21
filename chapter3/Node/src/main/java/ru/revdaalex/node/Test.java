package ru.revdaalex.node;

import java.util.List;

/**
 * Created by RevdaAlex on 04.10.2016.
 */
public class Test {

    public static void main(String[] args) {
        Node root = new Node("Задание 1");

        Node node1 = root.addChildren("Задание 1.1");

        Node node2 = node1.addChildren("Задание 1.1.1");

        Node node3 = node1.addChildren("Задание 1.1.2");

        Node node4 = root.addChildren("Задание 1.2");

        root.setSelect(new SelectCurrentNode(root));
    }
}
