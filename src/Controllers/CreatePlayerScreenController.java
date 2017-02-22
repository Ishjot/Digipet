public class CreatePlayerScreenController extends ControllerBase {
	public CreatePlayerScreenController(CreatePlayerScreenView view) {
		super(view);
	}

	public void display() {
		System.out.println("Creating a player page");
		GUIFrame.getFrame().setVisible(true);
	}

	public void navigateTo(String page) {
		//Emtpy
	}
}
