public class MainGameScreenController extends ControllerBase {
	public MainGameScreenController(MainGameScreenView view) {
		super(view);
	}

	public void display() {
		System.out.println("Main game screen page");
		GUIFrame.getFrame().setVisible(true);
	}

	public void navigateTo(String page) {
		//Empty
	}
    public void playGame() {
	SingletonPlayer.getPlayer().playGame();
    }
	
}
