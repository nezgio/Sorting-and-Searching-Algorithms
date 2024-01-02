import java.util.Random;

public class DataSetFactory {

    public static int[][] generateArrays(int[] arraysSizes) {
        int[][] arrays = new int[arraysSizes.length][];

        for (int i = 0; i < arraysSizes.length; i++) {
            int currentSize = arraysSizes[i];
            arrays[i] = generateRandomArray(currentSize);
        }

        return arrays;
    }

      private static int[] generateRandomArray(int size) {
        int[] randomArray = new int[size];

        for (int i = 0; i < size; i++) {
            int randomNum = new Random().nextInt();
            randomArray[i] = randomNum;
        }

        return  randomArray;
    }
    
     public static DataSet<Integer>[] generateDatasets(int[] dataSetsSizes) {
        DataSet<Integer>[] dataSets = new DataSet[dataSetsSizes.length];

        for (int i = 0; i < dataSetsSizes.length; i++) {
            int currentSize = dataSetsSizes[i];
            dataSets[i] = generateRandomDataset(currentSize);
        }

        return dataSets;
    }
    
    private static DataSet<Integer> generateRandomDataset(int size) {
        DataSet<Integer> randomDataSet = new DataSet<>(size);

        for (int i = 0; i < size; i++) {
            int randomNum = new Random().nextInt();
            randomDataSet.add(i, randomNum);
        }

        return  randomDataSet;
    }
}
