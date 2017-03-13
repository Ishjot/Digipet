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
		if (view != null)
			View.setController(this);
	}

	public abstract void display();

	public abstract void navigateTo(String page);

	public void createPlayer(String name) {
		String[] tmp = name.split("\\s+"); // does not matter how many spaces
											// are in between yourname and
											// petname
		SingletonPlayer.makePlayer(tmp[0], new Dog(tmp[1]));

		SingletonClock.getClock();
		Runnable threadJob = new SecondRunnable();
		Thread myThread = new Thread(threadJob);
		myThread.start();
		Runnable minuteThreadJob = new MinuteRunnable();
		Thread myMinuteThread = new Thread(minuteThreadJob);
		myMinuteThread.start();
	}

	public void playGame() {
		SingletonPlayer.getPlayer().playGame();
	}

	public void buyFood() {
		SingletonPlayer.getPlayer().setCurrency(-5);
		SingletonPlayer.getPlayer().setItemsNum(1);
	}

	public void feedPet() {
		SingletonPlayer.getPlayer().feedPet();
	}
}
