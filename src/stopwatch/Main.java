package stopwatch;

public class Main {
	public static void main(String[] args) {
		TaskTimer tasktimer = new TaskTimer();
		tasktimer.measureAndPrint(new AppendToStringTask(50000));
		tasktimer.measureAndPrint(new AppendToStringTask(100000));
		tasktimer.measureAndPrint(new AppendCharToStringBuilder(100000));
		tasktimer.measureAndPrint(new SumDoublePrimitive(1000000000));
		tasktimer.measureAndPrint(new SumDouble(1000000000));
		tasktimer.measureAndPrint(new SumBigDecimal(1000000000));
	}
}
