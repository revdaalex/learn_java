package ru.revdaalex.node;

import ru.revdaalex.node.interfaces.Select;

import java.util.List;

/**
 *
 * Created by revdaalex on 11.10.2016.
 */
public class SelectCurrentNode implements Select {
    /**
     * Variable Node.
     */
    private final Node node;

    /**
     * Main constructor.
     * @param node
     */
    public SelectCurrentNode(Node node) {
        this.node = node;
    }

    /**
     * Method select from interface.
     * @param index
     * @return Node.
     */
    public Node select(String index) {
        List<Node> nodes = node.getAllNodes();
        for (Node findNode : nodes){
            if (findNode.getValue().equals(index)){
                return findNode;
            }
        }
        return null;
    }
}
