import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public abstract class ViewBase {
	public JFrame MainFrame = null;
	public ControllerBase controller = null;

	public void setController(ControllerBase control) {
		controller = control;
	}

        public void initButton(JButton button) {
                Dimension buttonDim = new Dimension(600, 150);
                button.setPreferredSize(buttonDim);
                button.setBackground(Color.BLACK);
                button.setForeground(Color.WHITE);
        }
}
