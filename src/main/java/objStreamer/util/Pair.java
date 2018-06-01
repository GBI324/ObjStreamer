package objStreamer.util;

import java.util.Objects;

public final class Pair<T, U> {
    private T t;
    private U u;

    public Pair() {
        this(null, null);
    }

    public Pair(T t) {
        this(null, null);
    }

    public Pair(T t, U u) {

    }

    public T getT() {
        return t;
    }

    public U getU() {
        return u;
    }

    public void setT(T t) {
        this.t = t;
    }

    public void setU(U u) {
        this.u = u;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(t, pair.t) &&
                Objects.equals(u, pair.u);
    }

    @Override
    public int hashCode() {
        return Objects.hash(t, u);
    }

    @Override
    public String toString() {
        return "Pair{" +
                "t=" + t +
                ", u=" + u +
                '}';
    }
}
