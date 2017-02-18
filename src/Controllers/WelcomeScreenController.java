public class WelcomeScreenController {
	private WelcomeScreenView view = null;

	public WelcomeScreenController(WelcomeScreenView View) {
		view = View;
	}

	public void display() {
		System.out.println("We in this");
		view.getFrame().setVisible(true);
	}
}
