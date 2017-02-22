public class HowToPlayScreenController extends ControllerBase {
	public HowToPlayScreenController(HowToPlayScreenView view) {
		super(view);
	}
	
	public void display() {
		System.out.println("In the how to play screen");
		GUIFrame.getFrame().setVisible(true);
	}

	public void navigateTo(String page) {
		if(page == "WelcomeScreenView") {
			WelcomeScreenView newPage = new WelcomeScreenView();
			WelcomeScreenController newControl = new WelcomeScreenController(newPage);
			newControl.display();
		}

		else {
			System.out.println("Exception");
		}
	}
}
