public class SingletonPlayer {
	private static Player player = null;

	private SingletonPlayer() { }

	public static Player getPlayer() {
		if(player == null)
			player = new Player();
		return player;
	}


	public static void makePlayer(String name, Pet yourPet) {
		player = new Player(name, yourPet);
	}
}
