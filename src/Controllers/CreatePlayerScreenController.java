public class CreatePlayerScreenController extends ControllerBase {
	public CreatePlayerScreenController(CreatePlayerScreenView view) {
		super(view);
	}

	public void display() {
		System.out.println("Creating a player page");
		GUIFrame.getFrame().setVisible(true);
	}

	public void navigateTo(String page) {
		if(page == "MainGameScreenView") {
			MainGameScreenView newPage = new MainGameScreenView();
			MainGameScreenController newControl = new MainGameScreenController(newPage);
			newControl.display();
		}
	}

}
