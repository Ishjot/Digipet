public class MyRunnable implements Runnable {
    public void run() {
	go();
    }
    public void go() {
	long x = 1;
	while (SingletonPlayer.getPlayer().getPlayerPet().getHunger() > 0) {
	    if (SingletonClock.getClock().getTotal() > 1000 * x) {
		SingletonPlayer.getPlayer().getPlayerPet().updateHunger();
		x++;
	    }
	}
	System.out.println("ggwp");
    }
}
