import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class BinarySearchExecution {

    public static void executeBinarySearch(int[][] arrays) throws IOException {
        int integerToSearch = new Random().nextInt();
        FileWriter operationsNumberWriter = new FileWriter("binary-search_operations-number.csv", true);
        operationsNumberWriter.append("Data set size,Operations number\n");
        FileWriter executionTimeWriter = new FileWriter("binary-search_execution-time.csv", true);
        executionTimeWriter.append("Data set size,Execution time\n");


        for (int i = 0; i < arrays.length; i++) {
            BinarySearch binarySearch = new BinarySearch();
            ExecutionTimer executionTimer = new ExecutionTimer();
            final int finalI = i;
            executionTimer.measureExecutionTime(() -> binarySearch.search(arrays[finalI], integerToSearch));
            operationsNumberWriter.append(arrays[i].length + "," + binarySearch.operationsCount + "\n");
            executionTimeWriter.append(arrays[i].length + "," + executionTimer.getExecutionTime() + "\n");
        }

        operationsNumberWriter.flush();
        operationsNumberWriter.close();
        executionTimeWriter.flush();
        executionTimeWriter.close();
    }

    public static void executeBinarySearch(DataSet<Integer>[] dataSets) throws IOException {
        int integerToSearch = new Random().nextInt();
        FileWriter operationsNumberWriter = new FileWriter("binary-search_operations-number.csv", true);
        operationsNumberWriter.append("Data set size,Operations number\n");
        FileWriter executionTimeWriter = new FileWriter("binary-search_execution-time.csv", true);
        executionTimeWriter.append("Data set size,Execution time\n");

        for (int i = 0; i < dataSets.length; i++) {
            BinarySearch binarySearch = new BinarySearch();
            ExecutionTimer executionTimer = new ExecutionTimer();
            int finalI = i;
            executionTimer.measureExecutionTime(() -> binarySearch.search(dataSets[finalI], integerToSearch));
            operationsNumberWriter.append(dataSets[i].size() + "," + binarySearch.operationsCount + "\n");
            executionTimeWriter.append(dataSets[i].size() + "," + executionTimer.getExecutionTime() + "\n");
        }

        operationsNumberWriter.flush();
        operationsNumberWriter.close();
        executionTimeWriter.flush();
        executionTimeWriter.close();
    }
}
