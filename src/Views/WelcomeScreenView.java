import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WelcomeScreenView extends ViewBase {
	public WelcomeScreenView() {
		GUIFrame.getFrame().getContentPane().removeAll();
		view = new JPanel();

		JButton playButton = new JButton("Play");
		initViewButton(playButton);
		playButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.out.println("Play was pressed!");
				controller.navigateTo("CreatePlayerScreenView");
			}
		});

		JButton howToPlayButton = new JButton("How to Play");
		initViewButton(howToPlayButton);
		howToPlayButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.out.println("How to Play was pressed!");
				controller.navigateTo("HowToPlayScreenView");
			}
		});

		view.add(playButton);
		view.add(howToPlayButton);
		GUIFrame.getFrame().add(view);
	}

	public void initViewButton(JButton button) {
		Dimension dim = new Dimension(800,400);
		button.setPreferredSize(dim);
		button.setBackground(Color.BLACK);
		button.setForeground(Color.WHITE);
	}
}
