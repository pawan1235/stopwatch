package stopwatch;

import java.math.BigDecimal;

/**
 * Task that add BigDecimal to an array.
 * 
 * @author Pawan Intawongsa
 *
 */
public class SumBigDecimal implements Runnable {
	private int counter;
	private static final int ARRAY_SIZE = 500000;
	private BigDecimal[] values = new BigDecimal[ARRAY_SIZE];
	private BigDecimal sum;

	/**
	 * Initialize SumBigDecimal by counter.
	 * 
	 * @param counter
	 *            is number of time to add numbers
	 */
	public SumBigDecimal(int counter) {
		this.counter = counter;
		for (int i = 0; i < ARRAY_SIZE; i++)
			values[i] = new BigDecimal(i + 1);
	}

	/**
	 * Add number from 1 to ARRAY_SIZE using BigDecimal class.
	 */
	@Override
	public void run() {
		sum = new BigDecimal(0.0);
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0;
			sum = sum.add(values[i]);
		}

	}

	/**
	 * Return Task'description.
	 * 
	 * @return description of Task
	 */
	@Override
	public String toString() {
		return String.format("Sum array of BigDecimal with count=%,d\n", counter) + "sum = " + sum;
	}

}
