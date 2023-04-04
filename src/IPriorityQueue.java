public interface IPriorityQueue<V> {
    void insert(V value);

    V remove();

    V get();

    int count();

    boolean isEmpty();
}
