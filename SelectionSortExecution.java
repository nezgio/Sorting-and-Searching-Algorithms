import java.io.FileWriter;
import java.io.IOException;

public class SelectionSortExecution {

    public static void executeSelectionSort(int[][] arrays) throws IOException {
        FileWriter operationsNumberWriter = new FileWriter("selection-sort_operations-number.csv", true);
        operationsNumberWriter.append("Data set size,Operations number\n");
        FileWriter executionTimeWriter = new FileWriter("selection-sort_execution-time.csv", true);
        executionTimeWriter.append("Data set size,Execution time\n");


        for (int i = 0; i < arrays.length; i++) {
            SelectionSort selectionSort = new SelectionSort();
            ExecutionTimer executionTimer = new ExecutionTimer();
            int finalI = i;
            executionTimer.measureExecutionTime(() -> selectionSort.sort(arrays[finalI]));
            operationsNumberWriter.append(arrays[i].length + "," + selectionSort.operationsCount + "\n");
            executionTimeWriter.append(arrays[i].length + "," + executionTimer.getExecutionTime() + "\n");
        }

        operationsNumberWriter.flush();
        operationsNumberWriter.close();
        executionTimeWriter.flush();
        executionTimeWriter.close();
    }

    public static void executeSelectionSort(DataSet<Integer>[] dataSets) throws IOException {
        FileWriter operationsNumberWriter = new FileWriter("selection-sort_operations-number.csv", true);
        operationsNumberWriter.append("Data set size,Operations number\n");
        FileWriter executionTimeWriter = new FileWriter("selection-sort_execution-time.csv", true);
        executionTimeWriter.append("Data set size,Execution time\n");

        for (int i = 0; i < dataSets.length; i++) {
            SelectionSort selectionSort = new SelectionSort();
            ExecutionTimer executionTimer = new ExecutionTimer();
            final int finalI = i;
            executionTimer.measureExecutionTime(() -> selectionSort.sort(dataSets[finalI]));
            operationsNumberWriter.append(dataSets[i].size() + "," + selectionSort.operationsCount + "\n");
            executionTimeWriter.append(dataSets[i].size() + "," + executionTimer.getExecutionTime() + "\n");
        }

        operationsNumberWriter.flush();
        operationsNumberWriter.close();
        executionTimeWriter.flush();
        executionTimeWriter.close();
    }
}
