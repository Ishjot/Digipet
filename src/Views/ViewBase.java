import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public abstract class ViewBase {
	public JFrame MainFrame = null;
	public ControllerBase controller = null;
	public void setController(ControllerBase control) {
		controller = control;
	}
}
