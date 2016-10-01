package ru.revdaalex.node;

/**
 * Created by RevdaAlex on 01.10.2016.
 */
public class Test {
    public static void main(String[] args) {

        Node root = new Node("root");

        Node node1 = root.addChildren("node1");
        Node node2 = root.addChildren("node2");
        Node node3 = root.addChildren("node3");
    }
}
