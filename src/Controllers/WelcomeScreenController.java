public class WelcomeScreenController extends ControllerBase {
	public WelcomeScreenController(WelcomeScreenView view) {
		super(view);
	}

	public void display() {
		System.out.println("We in this");
		GUIFrame.getFrame().setVisible(true);
	}

	public void navigateTo(String page) {
		if(page == "HowToPlayScreenView") {
			HowToPlayScreenView newPage = new HowToPlayScreenView();
			HowToPlayScreenController newControl = new HowToPlayScreenController(newPage);
			newControl.display();
		}

		else {
			System.out.println("Exception");
		}
	}
}
