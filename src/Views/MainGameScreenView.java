import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainGameScreenView extends ViewBase {
	public MainGameScreenView() {
		GUIFrame.getFrame().getContentPane().removeAll();
		view = new JPanel();
		view.setLayout(new BoxLayout(view, BoxLayout.PAGE_AXIS));
		
		view.setBackground(Color.BLACK);

		String title = String.format("                      Main Game Screen!!");
		Font titleFont = new Font("Arial", Font.BOLD, 30);
		JTextArea titleText = new JTextArea(title, 1, 20);
		titleText.setFont(titleFont);
		titleText.setForeground(Color.WHITE);
		titleText.setBackground(Color.BLACK);
		titleText.setEditable(false);

		view.add(titleText);

		GUIFrame.getFrame().add(view);
	}
}
