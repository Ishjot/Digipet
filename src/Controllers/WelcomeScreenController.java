public class WelcomeScreenController extends ControllerBase {
	public WelcomeScreenController(WelcomeScreenView view) {
		super(view);
	}

	public void display() {
		System.out.println("We in this");
		view.MainFrame.setVisible(true);
	}

	public void navigateTo(String page) {
		if(page == "HowToPlayScreenView") {
			HowToPlayScreenView newPage = new HowToPlayScreenView(this.view.MainFrame);
			HowToPlayScreenController newControl = new HowToPlayScreenController(newPage);
			newControl.display();
		}

		else {
			System.out.println("Exception");
		}
	}
}
