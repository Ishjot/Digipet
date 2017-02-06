import javax.swing.*;
import java.awt.event.*;

/*
 * The main GUI for the application
 */
public class Digipet implements ActionListener {
	JFrame frame;
	JButton button;

	public static void main(String[] args) {
		Digipet gui = new Digipet();
		gui.InitGui();
	}

	public Digipet() {
		JFrame frame = new JFrame();
		JButton button = new JButton("Play");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(button);
		frame.setSize(300,300);
		frame.setVisible(true);
	}

	public void InitGui() {
		frame = new JFrame();
		button = new JButton("Play");
		
		button.addActionListener(this);

		frame.setDefaultCloserOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(button);
		frame.setSize(600, 600);
		frame.setVisible(true);
	}
}
