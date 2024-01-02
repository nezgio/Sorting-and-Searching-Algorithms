public class DataSet<E extends Object> implements LinearList<E> {
    private E[] myArray;
    private int size;

    public DataSet(int size){
        myArray = (E[]) new Object[size];
        this.size = 0;
    }
    @Override
    public boolean isEmpty() {
        return (size <= 0 );
    }
    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }

        if (size == myArray.length) {
            // Handle resizing the array if necessary
        }

        // Shift elements to the right to make space for the new element
        for (int i = size; i > index; i--) {
            myArray[i] = myArray[i - 1];
        }

        // Add the new element to the specified index
        myArray[index] = element;
        size++;
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }

        E removedElement = (E) myArray[index]; // Cast to type E
        // Shift elements to the left to fill the gap
        for (int i = index; i < size - 1; i++) {
            myArray[i] = myArray[i + 1];
        }

        myArray[size - 1] = null; // Clear the last element
        size--;
        return removedElement;
    }
    public int indexOf(E element) {
        for (int i = 0; i < size; i++) {
            if (myArray[i] != null && myArray[i].equals(element)) {
                return i;
            }
        }
        return -1; // Element not found
    }
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        return (E) myArray[index]; // Cast to type E
    }

    public void set(int index, E element) {
        myArray[index] = element;
    }

    public int size() {
        return size;
    }

}
