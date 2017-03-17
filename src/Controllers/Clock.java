public class Clock {
	private long start;
	private long total;

	public Clock() {
		start = System.currentTimeMillis();
		total = 0; // read total from file
	}

	public long getStart() {
		return start;
	}

	public long getTotal() {
		return total + getElapsed();
	}

	public long getElapsed() {
		return System.currentTimeMillis() - start;
	}
}
