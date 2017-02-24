public class Clock {
    private long tStart;
    private long tTotal;
    public Clock() {
	tStart = System.currentTimeMillis();
	tTotal = 0; // read tTotal from file
    }
    public long getTStart() {
	return tStart;
    }
    public long getTTotal() {
	return tTotal + getElapsed();
    }
    /*                                                                                              
    public void setTTotal() {                                                                       
        tTotal += getElapsed(); // write to file                                                    
    }                                                                                               
    */
    public long getElapsed() {
	return System.currentTimeMillis() - tStart;
    }
}
