import java.io.FileWriter;
import java.io.IOException;

public class CubicExectution {

    public static void executeCubic(int[][] arrays) throws IOException {
        FileWriter operationsNumberWriter = new FileWriter("cubic_operations-number.csv", true);
        operationsNumberWriter.append("Data set size,Operations number\n");
        FileWriter executionTimeWriter = new FileWriter("cubic_execution-time.csv", true);
        executionTimeWriter.append("Data set size,Execution time\n");


        for (int i = 0; i < arrays.length; i++) {
            Cubic cubic = new Cubic();
            ExecutionTimer executionTimer = new ExecutionTimer();
            int finalI = i;
            executionTimer.measureExecutionTime(() -> cubic.execute(arrays[finalI]));
            operationsNumberWriter.append(arrays[i].length + "," + cubic.operationsCount + "\n");
            executionTimeWriter.append(arrays[i].length + "," + executionTimer.getExecutionTime() + "\n");
        }

        operationsNumberWriter.flush();
        operationsNumberWriter.close();
        executionTimeWriter.flush();
        executionTimeWriter.close();
    }

    public static void executeCubic(DataSet<Integer>[] dataSets) throws IOException {
        FileWriter operationsNumberWriter = new FileWriter("cubic_operations-number.csv", true);
        operationsNumberWriter.append("Data set size,Operations number\n");
        FileWriter executionTimeWriter = new FileWriter("cubic_execution-time.csv", true);
        executionTimeWriter.append("Data set size,Execution time\n");

        for (int i = 0; i < dataSets.length; i++) {
            Cubic cubic = new Cubic();
            ExecutionTimer executionTimer = new ExecutionTimer();
            int finalI = i;
            executionTimer.measureExecutionTime(() -> cubic.execute(dataSets[finalI]));
            operationsNumberWriter.append(dataSets[i].size() + "," + cubic.operationsCount + "\n");
            executionTimeWriter.append(dataSets[i].size() + "," + executionTimer.getExecutionTime() + "\n");
        }

        operationsNumberWriter.flush();
        operationsNumberWriter.close();
        executionTimeWriter.flush();
        executionTimeWriter.close();
    }
}
