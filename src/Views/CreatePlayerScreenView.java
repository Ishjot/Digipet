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
		//Dimension maxSizeNameField = new Dimension(nameField.getPreferredSize().width, nameField.getPreferredSize().height);
		//nameField.setMaximumSize(maxSizeNameField);
		nameField.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
				System.out.println("Typed: " + nameField.getText());
			}
		});

		JLabel nameLabel = new JLabel("Input name, then press enter");
		nameLabel.setForeground(Color.WHITE);

		//Box box = Box.createVerticalBox();
		//box.add(nameField);

		view.add(nameLabel);
		view.add(nameField);
		GUIFrame.getFrame().add(view);
		nameField.requestFocus();
	}
}
