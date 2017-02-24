public class SingletonClock {
    private static Clock clock = null;
    private SingletonClock() {}
    public static Clock getClock() {
	if (clock == null)
	    clock = new Clock();
	return clock;
    }
}
