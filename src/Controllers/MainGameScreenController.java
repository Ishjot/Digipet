public class MainGameScreenController extends ControllerBase {
	public MainGameScreenController(MainGameScreenView view) {
		super(view);
	}

	public void display() {
		System.out.println("Owner: " + SingletonPlayer.getPlayer().getName());
		GUIFrame.getFrame().setVisible(true);
	}

	public void navigateTo(String page) {
		//Empty
	}
}
