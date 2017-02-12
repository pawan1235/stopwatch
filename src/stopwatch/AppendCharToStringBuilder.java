package stopwatch;

/**
 * Task that will append chars to StringBuilder.
 * 
 * @author Pawan Intawongsa
 *
 */
public class AppendCharToStringBuilder implements Runnable {
	private int count;
	private final char CHAR = 'a';
	private String result = "";

	/**
	 * Initialize AppendCharToStringBuilder with a specific size.
	 * 
	 * @param count
	 *            is the length of final String
	 */
	public AppendCharToStringBuilder(int count) {
		this.count = count;
	}

	/**
	 * Add char 'a' to the StringBuilder until it reaches final size.
	 * 
	 */
	@Override
	public void run() {
		StringBuilder builder = new StringBuilder();
		int k = 0;
		while (k++ < count) {
			builder = builder.append(CHAR);
		}
		// now create a String from the result, to be compatible with task 1.
		result = builder.toString();
	}

	/**
	 * Return result length and Task's description.
	 * 
	 * @return result length and Task's description
	 */
	@Override
	public String toString() {
		return String.format("Append %,d chars to StringBuilder\nfinal string length = %d", count, result.length());
	}

}
