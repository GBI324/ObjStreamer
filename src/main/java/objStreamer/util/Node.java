package objStreamer.util;

import java.util.List;

public class Node<T> {
    private T node;
    private List<T> nodes;

    public List<T> getNodes() {
        return nodes;
    }

    public void setNodes(List<T> nodes) {
        this.nodes = nodes;
    }

    public T getNode() {
        return node;
    }

    public void setNode(T node) {
        this.node = node;
    }
}
