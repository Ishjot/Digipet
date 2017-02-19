import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
 * The main GUI for the application
 */
public class WelcomeScreenView extends ViewBase {
	public WelcomeScreenView(JFrame frame) {
		if(frame == null)
			MainFrame = new JFrame("Digipet");
		else
			MainFrame = frame;

		JButton playButton = new JButton("Play");
		initButton(playButton);
		playButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.out.println("Play was pressed!");
			}
		});

		JButton howToPlayButton = new JButton("How to Play");
		initButton(howToPlayButton);
		howToPlayButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.out.println("How to Play was pressed!");
				controller.navigateTo("HowToPlayScreenView");
			}
		});

		MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MainFrame.add(playButton);
		MainFrame.add(howToPlayButton);
		MainFrame.setSize(600, 600);
		MainFrame.getContentPane().setLayout(new GridLayout(2,1));
		MainFrame.pack();
		//MainFrame.setVisible(true);
	}

	public void initButton(JButton button) {
		Dimension buttonDim = new Dimension(600, 150);
		button.setPreferredSize(buttonDim);
		button.setBackground(Color.BLACK);
		button.setForeground(Color.WHITE);
	}
}
