package stopwatch;

/**
 * Task that will append chars to string.
 * 
 * @author Pawan Intawongsa
 *
 */
public class AppendToStringTask implements Runnable {

	private int count;
	private String result = "";

	/**
	 * Constructor that initialize the AppendToStringTask with a specific size.
	 * 
	 * @param count
	 *            is length of final size of string
	 */
	public AppendToStringTask(int count) {
		this.count = count;
	}

	/**
	 * Add char 'a' to String until it reach its final size.
	 * 
	 */
	@Override
	public void run() {
		final char CHAR = 'a';
		int k = 0;
		while (k++ < count) {
			result = result + CHAR;
		}
	}

	/**
	 * Return result length and Task's description.
	 * 
	 * @return result length and Task's description
	 */
	@Override
	public String toString() {
		return String.format("Append %,d chars to String\nfinal string length = %d", count, result.length());

	}

}
