public interface LinearList<E> {
    boolean isEmpty();
    int size();
    E get(int index);
    int indexOf(E elem);
    E remove(int index);
    void add(int index, E elem);
    @Override
    String toString();
}


