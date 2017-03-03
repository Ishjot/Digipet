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
				String[] tmp = nameField.getText().split("\\s+");
				if(nameField.getText().equals(""))
					return;
				if(tmp.length < 2) //when user did not enter two names
					return;
				if(tmp[0].equals("")) //when user did not enter their own name
					return;
				if(tmp[1].equals("")) //when user did not enter pet name
					return;
				else {
					controller.createPlayer(nameField.getText());
					controller.navigateTo("MainGameScreenView");
				}

			}
		});

		JLabel nameLabel = new JLabel("Input name followed by space and pet name, then press enter");
		nameLabel.setForeground(Color.WHITE);


		view.add(nameLabel);
		view.add(nameField);

		GUIFrame.getFrame().add(view);
		nameField.requestFocus();
	}
}
