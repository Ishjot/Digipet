import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUIFrame {
	private static JFrame SingletonGUIFrame;

	private GUIFrame() { }

	public static JFrame getFrame() {
		if(SingletonGUIFrame == null) {
			SingletonGUIFrame = new JFrame("Digipet");
		}
		
		SingletonGUIFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SingletonGUIFrame.setSize(800, 800);
		SingletonGUIFrame.getContentPane().setLayout(new BoxLayout(SingletonGUIFrame.getContentPane(), BoxLayout.Y_AXIS));
		SingletonGUIFrame.getContentPane().setBackground(Color.BLACK);
		return SingletonGUIFrame;
	}	
}
