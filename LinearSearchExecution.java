import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class LinearSearchExecution {

    public static void executeLinearSearch(int[][] arrays) throws IOException {
        int integerToSearch = new Random().nextInt();
        FileWriter operationsNumberWriter = new FileWriter("linear-search_operations-number.csv", true);
        operationsNumberWriter.append("Data set size,Operations number\n");
        FileWriter executionTimeWriter = new FileWriter("linear-search_execution-time.csv", true);
        executionTimeWriter.append("Data set size,Execution time\n");


        for (int i = 0; i < arrays.length; i++) {
            LinearSearch linearSearch = new LinearSearch();            ExecutionTimer executionTimer = new ExecutionTimer();
            int finalI = i;
            executionTimer.measureExecutionTime(() -> linearSearch.search(arrays[finalI], integerToSearch));
            operationsNumberWriter.append(arrays[i].length + "," + linearSearch.operationsCount + "\n");
            executionTimeWriter.append(arrays[i].length + "," + executionTimer.getExecutionTime() + "\n");
        }

        operationsNumberWriter.flush();
        operationsNumberWriter.close();
        executionTimeWriter.flush();
        executionTimeWriter.close();
    }

    public static void executeLinearSearch(DataSet<Integer>[] dataSets) throws IOException {
        int integerToSearch = new Random().nextInt();
        FileWriter operationsNumberWriter = new FileWriter("linear-search_operations-number.csv", true);
        operationsNumberWriter.append("Data set size,Operations number\n");
        FileWriter executionTimeWriter = new FileWriter("linear-search_execution-time.csv", true);
        executionTimeWriter.append("Data set size,Execution time\n");

        for (int i = 0; i < dataSets.length; i++) {
            LinearSearch linearSearch = new LinearSearch();
            ExecutionTimer executionTimer = new ExecutionTimer();
            int finalI = i;
            executionTimer.measureExecutionTime(() -> linearSearch.search(dataSets[finalI], integerToSearch));
            operationsNumberWriter.append(dataSets[i].size() + "," + linearSearch.operationsCount + "\n");
            executionTimeWriter.append(dataSets[i].size() + "," + executionTimer.getExecutionTime() + "\n");
        }

        operationsNumberWriter.flush();
        operationsNumberWriter.close();
        executionTimeWriter.flush();
        executionTimeWriter.close();
    }
}
