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

	public Digipet() { }

	public void InitGui() {
		frame = new JFrame();
		button = new JButton("Play");
		
		button.addActionListener(this);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(button);
		frame.setSize(600, 600);
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent event) {
		button.setText("You clicked \"play\"");
	}
}
