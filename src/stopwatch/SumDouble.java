package stopwatch;

/**
 * Task that add number for count time
 * 
 * @author Pawan Intawongsa
 *
 */
public class SumDouble implements Runnable {
	private int counter;
	private static final int ARRAY_SIZE = 500000;
	private Double[] values = new Double[ARRAY_SIZE];
	private Double sum;

	/**
	 * Initialize SumDouble by counter
	 * 
	 * @param counter
	 */
	public SumDouble(int counter) {
		this.counter = counter;
		for (int i = 0; i < ARRAY_SIZE; i++)
			values[i] = new Double(i + 1);
	}

	/**
	 * Add number from 1 to ARRAY_SIZE using Double wrapper class.
	 */
	@Override
	public void run() {
		sum = new Double(0.0);
		// count = loop counter, i = array index
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0;
			sum = sum + values[i];
		}

	}

	/**
	 * Return Task's description.
	 * 
	 * @return description of class
	 */
	@Override
	public String toString() {
		return String.format("Sum array of Double objects with count=%,d\n", counter) + "sum = " + sum;
	}

}
