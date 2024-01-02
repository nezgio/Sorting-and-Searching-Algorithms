public class Cubic {
    public long operationsCount = 0;

     public int execute(int[] array) {

        int till = array.length;
        for (int i = 0; i < till; i++) {
            for (int j = 0; j < till; j++) {
                for (int k = 0; k < till; k++) {
                    operationsCount++;
                    int result = array[i]*array[j]*array[k];
                }
            }
        }
        return 1;
    }
     
    public int execute(DataSet<Integer> dataSet) {

        int till = dataSet.size();
        for (int i = 0; i < till; i++) {
            for (int j = 0; j < till; j++) {
                for (int k = 0; k < till; k++) {
                    operationsCount++;
                    int result = dataSet.get(i)*dataSet.get(j)*dataSet.get(k);
                }
            }
        }
        return 1;
    }
}
