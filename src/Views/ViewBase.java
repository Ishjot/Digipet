import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public abstract class ViewBase {
	public JPanel view = null;
	public ControllerBase controller = null;

	public void setController(ControllerBase control) {
		controller = control;
	}


}
