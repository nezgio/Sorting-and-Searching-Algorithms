public class LinearSearch {
    public long operationsCount = 0;

      public int search( int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            operationsCount++;
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public int search(DataSet<Integer> myArray, int target) {
        for (int i = 0; i < myArray.size(); i++) {
            operationsCount++;
            if (myArray.get(i) == target) {
                return i;
            }
        }
        return -1;
    }

    
}


