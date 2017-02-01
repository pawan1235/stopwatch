package stopwatch;

/**
 * A Stopwatch that measures elapsed time between a starting time and stopping
 * time, or until the present time.
 * 
 * @author Pawan Intawongsa
 * @version 1.0
 */
public class Stopwatch {
	/** constant for converting nanoseconds to seconds. */
	private static final double NANOSECONDS = 1.0E-9;
	/** time that the stopwatch was started, in nanoseconds. */
	private long startTime;
	private long stopTime;
	private boolean running;

	/** Start the stopwatch if it is not already running. */
	public  void start() {
		if (running == false) {
			this.startTime = System.nanoTime();
			running = true;
		}
	}

	public void stop() {
		if (running == true) {
			this.stopTime = System.nanoTime();
			running = false;
		}
	}

	public double getElapsed() {
		if (running) {
			return (System.nanoTime() - this.startTime) * NANOSECONDS;
		} else {
			return (this.stopTime - this.startTime) * NANOSECONDS;
		}
	}

	public boolean isRunning() {
		return running;
	}

	public static void main(String[] args) {
		Stopwatch timer = new Stopwatch();
		System.out.println("Starting task");
		timer.start();
		timer.stop(); // stop timing the work
		System.out.printf("elapsed = %.6f sec\n", timer.getElapsed());
		if (timer.isRunning())
			System.out.println("timer is still running!");
		else
			System.out.println("timer is stopped");
	}
}
