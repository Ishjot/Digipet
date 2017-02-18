import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
 * The main GUI for the application
 */
public class WelcomeScreenView {
	private JFrame mainFrame = null;

	public JFrame getFrame() {
		return mainFrame;
	}

	public WelcomeScreenView() {
		mainFrame = new JFrame("Digipet");

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
			}
		});

		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.add(playButton);
		mainFrame.add(howToPlayButton);
		mainFrame.setSize(600, 600);
		mainFrame.getContentPane().setLayout(new GridLayout(2,1));
		mainFrame.pack();
		//mainFrame.setVisible(true);
	}

	public void initButton(JButton button) {
		Dimension buttonDim = new Dimension(600, 150);
		button.setPreferredSize(buttonDim);
		button.setBackground(Color.BLACK);
		button.setForeground(Color.WHITE);
	}
}
