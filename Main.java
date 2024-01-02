import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int initial = 100;
        int[] dataSetSizes = new int[15];
//        {
//                100,
//                250,
//                500,
//                750,
//                1000,
//                2000, == u can put them manually or u can use the for loop
//                3000,
//                4000,
//                5000,
//                6000,
//                7500,
//                8000,
//                9000,
//                10000
//        };
        for (int i = 0; i< dataSetSizes.length ; i++){
            dataSetSizes[i]= initial + i*700;
        }
            

        int[][] arrays = DataSetFactory.generateArrays(dataSetSizes);
//        DataSet<Integer>[] dataSets = DataSetFactory.generateDatasets(dataSetSizes);

        System.out.println("executing algorithms...");

        LinearSearchExecution.executeLinearSearch(arrays);
        SelectionSortExecution.executeSelectionSort(arrays);
        CubicExectution.executeCubic(arrays);
        BinarySearchExecution.executeBinarySearch(arrays);

//        BinarySearchExecution.executeBinarySearch(dataSets);
//        LinearSearchExecution.executeLinearSearch(dataSets);     === i tried with the dataSets which implements LinearList interface but it is not that efficient 
//        SelectionSortExecution.executeSelectionSort(dataSets);
//        CubicExectution.executeCubic(dataSets);

        System.out.println("execution finished.");

    }
}
