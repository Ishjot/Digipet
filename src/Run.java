import javax.swing.*;

public class Run {
	public static void main(String[] args) {
		Run mainRun = new Run();
	}

	public Run() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (Exception ex) {
			System.out.println("Could not set look and feel!");
		}

		WelcomeScreenView welcome = new WelcomeScreenView();
		WelcomeScreenController welcomeController = new WelcomeScreenController(welcome);
		welcomeController.display();
	}
}
