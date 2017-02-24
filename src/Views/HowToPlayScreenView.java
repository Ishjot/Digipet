import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HowToPlayScreenView extends ViewBase {
	public HowToPlayScreenView() {
		GUIFrame.getFrame().getContentPane().removeAll();
		view = new JPanel();
		view.setBackground(Color.BLACK);

		String message = String.format("The aim of this game is to make money, buy food, and try your best to keep your pet alive! The user interface is fairly simple, with only three clickable buttons. Click the \"Make money\" button to earn currency, spend this currency with the \"Buy food\" button, and finally, feed your pet with the \"Feed pet\" button! Repeat these steps until you are tired of the game, or, your lose.");
		Font font = new Font("Arial", Font.PLAIN, 14);
		JTextArea text = new JTextArea(message, 20, 60);
		text.setFont(font);
		text.setForeground(Color.WHITE);
		text.setBackground(Color.BLACK);
		text.setEditable(false);
		text.setLineWrap(true);
		text.setWrapStyleWord(true);

		JScrollPane scroll = new JScrollPane(text);

		JButton backToWelcomeScreenButton = new JButton("Back to Menu");
		initViewButton(backToWelcomeScreenButton);
		backToWelcomeScreenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.out.println("Back to welcome was pressed!");
				controller.navigateTo("WelcomeScreenView");
			}
		});

		view.add(scroll);
		view.add(backToWelcomeScreenButton);

		GUIFrame.getFrame().add(view);
	}
	
	public void initViewButton(JButton button) {
		Dimension dim = new Dimension(800, 400);
		button.setPreferredSize(dim);
		button.setBackground(Color.BLACK);
		button.setForeground(Color.WHITE);
	}
}
