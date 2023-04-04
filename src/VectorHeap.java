import java.util.ArrayList;
import java.util.List;

public class VectorHeap<E extends Comparable<E>> implements IPriorityQueue<E> {
    private List<E> data;

    public VectorHeap() {
        data = new ArrayList<>();
    }

    @Override
    public void insert(E value) {
        data.add(value);
        int index = data.size() - 1;
        while (index > 0 && data.get(index).compareTo(data.get((index - 1) / 2)) < 0) {
            E temp = data.get(index);
            data.set(index, data.get((index - 1) / 2));
            data.set((index - 1) / 2, temp);
            index = (index - 1) / 2;
        }
    }

    @Override
    public E get() {
        return data.get(0);
    }
 
    @Override
    public E remove() {
        E result = data.get(0);
        E last = data.remove(data.size() - 1);
        if (!data.isEmpty()) {
            data.set(0, last);
            int index = 0;
            boolean done = false;
            while (!done) {
                int left = 2 * index + 1;
                int right = 2 * index + 2;
                int min = left;

                if (right < data.size() && data.get(right).compareTo(data.get(left)) < 0) {
                    min = right;
                }

                if (left < data.size() && data.get(min).compareTo(data.get(index)) < 0) {
                    E temp = data.get(index);
                    data.set(index, data.get(min));
                    data.set(min, temp);
                    index = min;
                } else {
                    done = true;
                }
            }
        }
        return result;
    }

    @Override
    public int count() {
        return data.size();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }
}
