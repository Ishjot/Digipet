public class myRunnable implements Runnable {
    public void run() {
	go();
    }
    public void go() {
	long x = 1;
	while (true) {
	    if (SingletonClock.getClock().getTotal() > 1000 * x) {
		SingletonPlayer.getPlayer().getPlayerPet().updateHunger();
		x++;
	    }
	}
    }
}
