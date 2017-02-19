public class HowToPlayScreenController extends ControllerBase {
	public HowToPlayScreenController(HowToPlayScreenView view) {
		super(view);
	}
	
	public void display() {
		System.out.println("In the how to play screen");
		view.MainFrame.setVisible(true);
	}

	public void navigateTo(String page) {
		if(page == "WelcomeScreenView") {
			WelcomeScreenView newPage = new WelcomeScreenView(this.view.MainFrame);
			WelcomeScreenController newControl = new WelcomeScreenController(newPage);
			newControl.display();
		}

		else {
			System.out.println("Exception");
		}
	}
}
