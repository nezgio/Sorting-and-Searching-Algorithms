public class SelectionSort {
    public long operationsCount;

    public void sort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int maxIndex = max(array, i);
            int temp = array[i];
            array[i] = array[maxIndex];
            array[maxIndex] = temp;
        }
    }

    private int max(int[] array, int n){
        int pos = 0;
        for (int i = 1; i < n; i++) {
            operationsCount++;
            if (array[pos] < array[i])
                pos = i;
        }
        return pos;
    }

      public int sort(DataSet<Integer> myArray) {
        for (int size = myArray.size() - 1; size > 0; size--) {
            int j = max(myArray,size);
            int dummy = myArray.get(j);
            myArray.set(j, myArray.get(size-1));
            myArray.set(size-1, dummy);
        }
        return 1;
    }
    
    private int max(DataSet<Integer> myArray, int n){
        int pos = 0;
        for (int i = 1; i < n; i++) {
            operationsCount++;
            if (myArray.get(pos) < myArray.get(i))
                pos = i;
        }
        return pos;
    }
}
