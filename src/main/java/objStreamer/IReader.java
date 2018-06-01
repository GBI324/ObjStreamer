package objStreamer;


import objStreamer.util.Node;

import java.util.List;

public interface IReader {
    /**
     * read one line from stream
     *
     * @return list of objects in tree fields format
     */
    List<Node<String>> read();
}
