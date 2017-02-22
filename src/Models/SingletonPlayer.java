public class SingletonPlayer {
	private static Player player = null;

	private SingletonPlayer() { }

	public static Player getPlayer() {
		if(player == null)
			player = new Player();
		return player;
	}

	public static Player getPlayer(String name) {
		player = new Player(name);
		return player;
	}
}
