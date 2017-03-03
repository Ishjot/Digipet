public class WelcomeScreenController extends ControllerBase {
	public WelcomeScreenController(WelcomeScreenView view) {
		super(view);
	}

	public void display() {
		System.out.println("Welcome Screen Loaded");
		GUIFrame.getFrame().setVisible(true);
	}

	public void navigateTo(String page) {
		if(page == "HowToPlayScreenView") {
			HowToPlayScreenView newPage = new HowToPlayScreenView();
			HowToPlayScreenController newControl = new HowToPlayScreenController(newPage);
			newControl.display();
		}

		else if(page == "CreatePlayerScreenView") {
			CreatePlayerScreenView newPage = new CreatePlayerScreenView();
			CreatePlayerScreenController newControl = new CreatePlayerScreenController(newPage);
			newControl.display();
		}

		else {
			System.out.println("Exception");
		}
	}
}
