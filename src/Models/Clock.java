public class Clock {
    private long tStart;
    private long tTotal;
    public long getTStart() {
	return tStart;
    }
    public void setTStart() {
	tStart = System.currentTimeMillis();
    }
    public long getTTotal() {
	return tTotal + getElapsed();
    }
    public void readTTotal() {
	// read from file
    }
    public void setTTotal() {
	tTotal = tTotal + getElapsed(); // write to file
    }
    public long getElapsed() {
	return System.currentTimeMillise() - tStart;
    }
}
