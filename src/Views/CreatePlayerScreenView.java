import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CreatePlayerScreenView extends ViewBase {
	public CreatePlayerScreenView() {
		
		/*if(SingletonPlayer.getPlayer() != null) {
			controller.navigateTo("PlayGameScreenView");
			System.out.println("There already is a player!");
		}*/

		GUIFrame.getFrame().getContentPane().removeAll();
		view = new JPanel();
		view.setBackground(Color.BLACK);

		JTextField nameField = new JTextField(15);
		nameField.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
				System.out.println("Typed: " + nameField.getText());
				controller.navigateTo("MainGameScreenView");
			}
		});

		JLabel nameLabel = new JLabel("Input name, then press enter");
		nameLabel.setForeground(Color.WHITE);


		view.add(nameLabel);
		view.add(nameField);

		GUIFrame.getFrame().add(view);
		nameField.requestFocus();
	}
}
