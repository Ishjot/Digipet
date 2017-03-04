import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUIFrame {
	private static JFrame SingletonGUIFrame;

	private GUIFrame() { }

	public static JFrame getFrame() {
		if(SingletonGUIFrame == null) {
			SingletonGUIFrame = new JFrame("Digipet");
			SingletonGUIFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			SingletonGUIFrame.setSize(500, 500);
		}
		
		return SingletonGUIFrame;
	}	
}
