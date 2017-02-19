import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HowToPlayScreenView extends ViewBase {
	public HowToPlayScreenView(JFrame frame) {
		if(frame == null)
			MainFrame = new JFrame("Digipet");
		else
			MainFrame = frame;

		MainFrame.getContentPane().removeAll();

		String message = String.format("Hit the money button to earn money, use the money to feed your pet!");
		Font font = new Font("Arial", Font.PLAIN, 14);
		JTextArea text = new JTextArea(message, 20, 40);
		text.setFont(font);
		text.setForeground(Color.WHITE);
		text.setBackground(Color.BLACK);
		text.setEditable(false);
		text.setLineWrap(true);
		text.setWrapStyleWord(true);

		JScrollPane scroll = new JScrollPane(text);

		MainFrame.add(scroll);
		MainFrame.pack();
	}
}
