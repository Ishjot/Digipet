import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;

public class MainGameScreenView extends ViewBase {
	public MainGameScreenView() {
		GUIFrame.getFrame().getContentPane().removeAll();
		view = new JPanel();
		//view.setLayout(new BoxLayout(view, BoxLayout.PAGE_AXIS));
		
		view.setBackground(Color.BLACK);

		JLabel currentItems = new JLabel("You currently have " + Integer.toString(SingletonPlayer.getPlayer().getNumItems()) + " biscuits. ");

		String title = String.format("Owner: " + SingletonPlayer.getPlayer().getName()  + "  Pet: " + SingletonPlayer.getPlayer().getPlayerPet().getName());
		Font titleFont = new Font("Arial", Font.BOLD, 40);
		JTextArea titleText = new JTextArea(title, 1, 5);
		titleText.setFont(titleFont);
		titleText.setForeground(Color.WHITE);
		titleText.setBackground(Color.BLACK);
		titleText.setEditable(false);
		titleText.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));

		JPanel moneyAndHealthBarsPanel = new JPanel(new BorderLayout(50,0));
		moneyAndHealthBarsPanel.setBackground(Color.BLACK);

		String money = String.format("$"+Integer.toString(SingletonPlayer.getPlayer().getCurrency()));
		Font moneyFont = new Font("Arial", Font.PLAIN, 20);
		JTextArea moneyText = new JTextArea(money, 1, 2);
		moneyText.setFont(moneyFont);
		moneyText.setForeground(Color.GREEN);
		moneyText.setBackground(Color.BLACK);
		moneyText.setEditable(false);
		moneyText.setBorder(BorderFactory.createLineBorder(Color.WHITE));

                String currentAge = String.format("Level:"+Integer.toString(SingletonPlayer.getPlayer().getPlayerPet().getAge()));
		Font ageFont = new Font("Arial", Font.PLAIN, 20);
		JTextArea ageText = new JTextArea(currentAge, 1, 2);
		ageText.setFont(ageFont);
		ageText.setForeground(Color.WHITE);
		ageText.setBackground(Color.BLACK);
		ageText.setEditable(false);
		ageText.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		
		String currentHealth = String.format("Health:"+Integer.toString(SingletonPlayer.getPlayer().getPlayerPet().getHunger()) + "/" + Integer.toString(SingletonPlayer.getPlayer().getPlayerPet().getMaxStat()));
		Font healthFont = new Font("Arial", Font.PLAIN, 20);
		JTextArea healthText = new JTextArea(currentHealth, 1, 3);
		healthText.setFont(healthFont);
		healthText.setForeground(Color.WHITE);
		healthText.setBackground(Color.BLACK);
		healthText.setEditable(false);
		healthText.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		
		moneyAndHealthBarsPanel.add(BorderLayout.WEST, moneyText);
		moneyAndHealthBarsPanel.add(BorderLayout.CENTER, ageText);
		moneyAndHealthBarsPanel.add(BorderLayout.EAST, healthText);

		//Creates the "dog" image
		BufferedImage img = null;
		try { img = ImageIO.read(new File("dogtransparent.png")); }
		catch (IOException e) { System.out.println("Couldn't find file"); }
		ImageIcon image = new ImageIcon(img);
		JLabel dogLabel = new JLabel(); dogLabel.setIcon(image);
		dogLabel.setBorder(BorderFactory.createEmptyBorder(20, 200, 20, 200));

		JPanel bottomButtonsPanel = new JPanel(new FlowLayout());

		final JPopupMenu selectPopup = new JPopupMenu();
		selectPopup.add(new JMenuItem(new AbstractAction("Option 1") {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(view, "Option 1 selected");
			}
		}));
		selectPopup.add(new JMenuItem(new AbstractAction("Option 2") {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(view, "Option 2 selected");
			}
		}));

		//redundant
		final JPopupMenu sellPopup = new JPopupMenu();
		sellPopup.add(new JMenuItem(new AbstractAction("biscuit") {
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(view, "biscuit selected"); //
				if(SingletonPlayer.getPlayer().getNumItems() > 0){
					SingletonPlayer.getPlayer().setItemsNum(-1);
					currentItems.setText("You currently have " + Integer.toString(SingletonPlayer.getPlayer().getNumItems()) + " biscuits. ");
					SingletonPlayer.getPlayer().setCurrency(2);
					moneyText.setText(Integer.toString(SingletonPlayer.getPlayer().getCurrency()));
					System.out.println("sold biscuit for 2 points");
				}
				else{
					JOptionPane.showMessageDialog(view, "Not enough biscuits");
				}
			}
		}));
		sellPopup.add(new JMenuItem(new AbstractAction("Option 2") {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(view, "Option 2 selected");
			}
		}));

		//sellItems
		JButton sellItemButton = new JButton("Sell Items");
		sellItemButton.setForeground(Color.BLACK);
		sellItemButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event){
				System.out.println("Selected Item was Pressed.");
				sellPopup.show(sellItemButton, 50, -25);
			}
		});
		sellItemButton.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		//selectItem
		JButton selectItemButton = new JButton("SelectItem");
		selectItemButton.setForeground(Color.BLACK);
		selectItemButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event){
				System.out.println("Selected Item was Pressed.");
				selectPopup.show(selectItemButton, 50, -25);
			}
		});
		selectItemButton.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0)); //do not know how borders work lol

		JButton buyFoodButton = new JButton("Buy food");
		buyFoodButton.setForeground(Color.BLACK);
		buyFoodButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.out.println("Buy food was pressed!");
				if(SingletonPlayer.getPlayer().getCurrency() >= 5) {
					controller.buyFood();
					currentItems.setText("You currently have " + Integer.toString(SingletonPlayer.getPlayer().getNumItems()) + " biscuits. ");
					moneyText.setText("$"+Integer.toString(SingletonPlayer.getPlayer().getCurrency()));
				}
			}
		});
		buyFoodButton.setBorder(BorderFactory.createEmptyBorder(0, 15, 0, 15));

                JButton makeMoneyButton = new JButton("Make money");
                makeMoneyButton.setForeground(Color.BLACK);
                makeMoneyButton.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent event) {
                                System.out.println("Make money was pressed!");
				controller.playGame();
				moneyText.setText("$"+Integer.toString(SingletonPlayer.getPlayer().getCurrency()));
                        }
                });
                makeMoneyButton.setBorder(BorderFactory.createEmptyBorder(0, 15, 0, 15));

                JButton feedPetButton = new JButton("Feed Pet");
                feedPetButton.setForeground(Color.BLACK);
                feedPetButton.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent event) {
                                System.out.println("Feed pet was pressed!");
				if(SingletonPlayer.getPlayer().getNumItems() >= 1) {
					controller.feedPet();
					currentItems.setText("You currently have " + Integer.toString(SingletonPlayer.getPlayer().getNumItems()) + " biscuits. ");
					healthText.setText("Healh:"+Integer.toString(SingletonPlayer.getPlayer().getPlayerPet().getHunger()) + "/" + Integer.toString(SingletonPlayer.getPlayer().getPlayerPet().getMaxStat()));
				}
                        }
                });
                feedPetButton.setBorder(BorderFactory.createEmptyBorder(0, 15, 0, 15));

		bottomButtonsPanel.add(buyFoodButton);
		bottomButtonsPanel.add(makeMoneyButton);
		bottomButtonsPanel.add(feedPetButton);
		bottomButtonsPanel.add(currentItems);
		bottomButtonsPanel.add(sellItemButton);
		bottomButtonsPanel.add(selectItemButton);


		view.add(titleText);
		view.add(moneyAndHealthBarsPanel);
		view.add(dogLabel);
		view.add(bottomButtonsPanel);
		view.add(sellItemButton);
		view.add(selectItemButton);


		GUIFrame.getFrame().add(view);
	}
}
