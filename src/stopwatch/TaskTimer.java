package stopwatch;

public class TaskTimer {
	public static void main(String[] args) {
		TaskTimer tasktimer = new TaskTimer();
		tasktimer.measureAndPrint(new AppendToStringTask(50000));
		tasktimer.measureAndPrint(new AppendToStringTask(100000));
		tasktimer.measureAndPrint(new AppendCharToStringBuilder(100000));
		tasktimer.measureAndPrint(new SumDoublePrimitive(1000000000));
		tasktimer.measureAndPrint(new SumDouble(1000000000));
		tasktimer.measureAndPrint(new SumBigDecimal(1000000000));
	}

	public void measureAndPrint(Runnable task) {
		Stopwatch timer = new Stopwatch();
		timer.start();
		task.run();
		timer.stop();
		System.out.println(task.toString());
		System.out.printf("Elapsed time %.6f sec\n\n", timer.getElapsed());
	}
}
