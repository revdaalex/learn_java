package ru.revdaalex.node;

import java.util.ArrayList;
import java.util.List;

/**
 * Class Node.
 * Created by RevdaAlex on 01.10.2016.
 */
public class Node {
    /**
     * Variable value.
     */
    private String value;
    /**
     * Variable parent.
     */
    private Node parent;
    /**
     * List variable children.
     */
    private List<Node> children;
    /**
     * Variable SelectCurrentNode.
     */
    private SelectCurrentNode select;

    /**
     * Main constructor.
     * @param value
     */
    public Node(String value) {
        this.value = value;
        this.children = new ArrayList<Node>();
    }

    /**
     * Getter.
     * @return value.
     */
    public String getValue() {
        return value;
    }

    /**
     * Setter.
     * @param select
     */
    public void setSelect(SelectCurrentNode select) {
        this.select = select;
    }

    /**
     * Method select.
     * @param index
     * @return Node.
     */
    public Node select(String index){
        return select.select(index);
    }

    /**
     * Method add node children.
     * @param value
     * @return Node.
     */
    public Node addChildren(String value){
        Node child = new Node(value);
        child.parent = this;
        this.children.add(child);
        return child;
    }

    /**
     * Method get all nodes.
     * @return Node.
     */
    public List<Node> getAllNodes(){
        List<Node> nodes = new ArrayList<Node>();
        nodes.add(this);
        for (Node child : children){
            nodes.addAll(child.getAllNodes());
        }
        return nodes;
    }
}
