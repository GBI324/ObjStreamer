package objStreamer;

import objStreamer.util.Node;

import java.util.List;

public interface IWriter {
    /**
     * write one line to string
     *
     * @param objects list of objects in tree fields format
     */
    void write(List<Node<String>> objects);
}
