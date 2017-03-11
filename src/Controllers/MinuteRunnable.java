public class MinuteRunnable implements Runnable {
    public void run() {
	go();
    }
    public void go() {
	long x = 0;
	while (true) {
	    if (SingletonClock.getClock().getTotal() > 60000 * x) {
		SingletonPlayer.getPlayer().getPlayerPet().updateAge();
		SingletonShop.getShop().refreshShop();
		x++;
		//updateView(); or updateShop();
	    }
	}
    }
}
