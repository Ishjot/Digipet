public class MinuteRunnable implements Runnable {
    public void run() {
	go();
    }
    public void go() {
	long x = 1;
	//SingletonShop.getShop().refreshShop();
	while (true) {
	    if (SingletonClock.getClock().getTotal() > 45000 * x) {
		SingletonPlayer.getPlayer().getPlayerPet().updateAge();
		//SingletonShop.getShop().refreshShop();
		x++;
		//updateView()
	    }
	}
    }
}
