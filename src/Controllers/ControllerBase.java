import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;

public abstract class ControllerBase {
        public ViewBase view = null;
	
        public ControllerBase(ViewBase View) {
                view = View;
		if(view != null)
			View.setController(this);
        }
	
	public abstract void display();

	public abstract void navigateTo(String page);
}
