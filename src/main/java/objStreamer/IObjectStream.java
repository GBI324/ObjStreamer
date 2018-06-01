package objStreamer;


import objStreamer.util.Pair;

import java.util.List;
import java.util.Map;

public interface IObjectStream {
    void writeObjects(Map<String, Object> object);

    void writeObjects(List<Pair<String, Object>> objects);

    void writeObjects(Object... objects);

    Map<String, Object> readObjectsN();

    List<Object> readObjects();

    <T> List<T> readObjects(Class<T> type);

}
