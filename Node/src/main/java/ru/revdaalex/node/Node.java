package ru.revdaalex.node;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by RevdaAlex on 01.10.2016.
 */
public class Node {
    private String value;

    private Node parent;

    private List<Node> children;

    public Node(String value) {
        this.value = value;
        this.children = new LinkedList<Node>();
    }

    public Node addChildren(String value){
        Node child = new Node(value);
        child.parent = this;
        this.children.add(child);
        return child;
    }
}
