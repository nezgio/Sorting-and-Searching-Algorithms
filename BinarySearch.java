public class BinarySearch {
    public long operationsCount = 0;

     public int search(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            operationsCount++;
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            }

            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
     
    public int search(DataSet<Integer> array, int target) {
        int left = 0;
        int right = array.size() - 1;

        while (left <= right) {
            operationsCount++;
            int mid = left + (right - left) / 2;

            if (array.get(mid) == target) {
                return mid;
            }

            if (array.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
