package stopwatch;

/**
 * Task that adds Primitive in an array.
 * 
 * @author Pawan Intawongsa
 *
 */
public class SumDoublePrimitive implements Runnable {
	private int counter;
	private static final int ARRAY_SIZE = 500000;
	private double[] values = new double[ARRAY_SIZE];
	private double sum;

	/**
	 * Initialize SumDoublePrimitive by counter.
	 * 
	 * @param counter
	 *            is number of time to add numbers
	 */
	public SumDoublePrimitive(int counter) {
		this.counter = counter;
		for (int i = 0; i < ARRAY_SIZE; i++)
			values[i] = new Double(i + 1);
	}

	/**
	 * Add numbers from 1 to ARRAY_SIZE using primitive double. If the number of
	 * time is more than the ARRAY_SIZE, reset the adding to 1 when it reaches
	 * ARRAY_SIZE.
	 */
	@Override
	public void run() {
		// count = loop counter, i = array index value
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0; // reuse the array when get to last value
			sum = sum + values[i];
		}

	}

	/**
	 * Return Task's description
	 * 
	 * @return description of task
	 */
	@Override
	public String toString() {
		return String.format("Sum array of double primitives with count=%,d\n", counter) + "sum = " + sum;
	}

}
