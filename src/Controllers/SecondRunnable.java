import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;

public class SecondRunnable implements Runnable {
	public void run() {
		go();
	}

	public void go() {
		long x = 1;
		while (SingletonPlayer.getPlayer().getPlayerPet().getHunger() > 0) {
			if (SingletonClock.getClock().getTotal() > 750 * x) {
				SingletonPlayer.getPlayer().getPlayerPet().updateHunger();
				System.out.println(SingletonPlayer.getPlayer().getPlayerPet().getHunger());
				x++;
				updateView();
			}
		}
		System.out.println("Game Over!");
		openGameOverScreenView();
	}

	public void updateView() {
		int currHealth = SingletonPlayer.getPlayer().getPlayerPet().getHunger();
		int maxHealth = SingletonPlayer.getPlayer().getPlayerPet().getMaxStat();
		double healthPercent = (double) currHealth / maxHealth;
		Component[] components = GUIFrame.getFrame().getContentPane().getComponents();
		JPanel mainPanel = (JPanel) components[0];
		JPanel moneyAndHealthPanel = (JPanel) mainPanel.getComponents()[1];
		// update age
		JTextArea ageText = (JTextArea) moneyAndHealthPanel.getComponents()[1];
		ageText.setText("Level:" + SingletonPlayer.getPlayer().getPlayerPet().getAge());
		// update health
		JProgressBar healthBar = (JProgressBar) moneyAndHealthPanel.getComponents()[2];
		healthBar.setValue(currHealth);
		healthBar.setMaximum(maxHealth);
		healthBar.setString(currHealth + "/" + maxHealth);
		healthBar.setForeground((healthPercent > 0.5) ? Color.green : Color.red);

	}

	public void openGameOverScreenView() {
		GUIFrame.getFrame().getContentPane().removeAll();
		JPanel view = new JPanel();
		view.setBackground(Color.BLACK);

		String gameOver = String.format("Game over! :(");
		JTextArea gameOverText = new JTextArea(gameOver, 1, 5);
		Font bigFont = new Font("Arial", Font.BOLD, 40);
		gameOverText.setFont(bigFont);
		gameOverText.setForeground(Color.WHITE);
		gameOverText.setBackground(Color.BLACK);
		gameOverText.setEditable(false);
		gameOverText.setBorder(BorderFactory.createEmptyBorder(225, 65, 0, 0));

		view.add(gameOverText);

		GUIFrame.getFrame().add(gameOverText);
		GUIFrame.getFrame().setVisible(true);
	}

}