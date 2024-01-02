public class ExecutionTimer {
    private long executionTime;

    public long getExecutionTime() {
        return executionTime;
    }

    public void measureExecutionTime(Runnable executionFunction) {
        long startTime = System.nanoTime();

        executionFunction.run();
        executionTime = System.nanoTime() - startTime;
    }
}
