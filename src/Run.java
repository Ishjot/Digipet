public class Run {
	public static void main(String[] args) {
		Run mainRun = new Run();
	}

	public Run() {
		WelcomeScreenView welcome = new WelcomeScreenView(null);
		WelcomeScreenController welcomeController = new WelcomeScreenController(welcome);
		welcomeController.display();
	}
}