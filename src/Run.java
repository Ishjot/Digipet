import javax.swing.*;
import javax.swing.UIManager.*;

public class Run {
	public static void main(String[] args) {
		Run mainRun = new Run();
	}

	public Run() {
		try {
			for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		}
		catch (Exception ex) {
			System.out.println("Could not set look and feel to nimbus!");
			try {
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			}
			catch (Exception e) {
				System.out.println("Could not set look and feel.");
			}
		}

		WelcomeScreenView welcome = new WelcomeScreenView();
		WelcomeScreenController welcomeController = new WelcomeScreenController(welcome);
		welcomeController.display();
	}
}
