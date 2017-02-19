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
			//Not implemented
		}
	}
}
