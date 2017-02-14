import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
 * The main GUI for the application
 */
public class Digipet {

	public static void main(String[] args) {
		Digipet gui = new Digipet();
		gui.InitGui();
	}

	public Digipet() { }

	public void InitGui() {
		final JFrame mainFrame = new JFrame("Digipet");

		JButton playButton = new JButton("Play");
		initButton(playButton);

		playButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.out.println("Play was pressed!");
			}
		});

		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.add(playButton);
		mainFrame.setSize(600, 600);
		mainFrame.setVisible(true);
	}

	public void initButton(JButton button) {
		Dimension buttonDim = new Dimension(600, 150);
		button.setPreferredSize(buttonDim);
		button.setBackground(Color.BLACK);
		button.setForeground(Color.WHITE);
	}
}
