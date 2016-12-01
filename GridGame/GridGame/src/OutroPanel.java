//This class sets up the panel so that it displays the intro screen
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class OutroPanel extends JPanel
{
	private final int X = 240, Y = 300, L = 180, W = 180;
	private JPanel buttonsPanel;
	private JButton push;
	private JLabel score;
	
//Constructor: This sets up the main components for the entire panel
	public OutroPanel ()
	{
		
		buttonsPanel = new JPanel();
		JButton push = new JButton("Play Again");
		JLabel score = new JLabel("Score: " + 0);
		push.addActionListener(new ButtonListener());
		buttonsPanel.setPreferredSize(new Dimension(100,70));
		buttonsPanel.setBackground(Color.LIGHT_GRAY);
		buttonsPanel.add(push);
		buttonsPanel.add(score);
		setPreferredSize(new Dimension(840,900));
		setBackground(Color.LIGHT_GRAY);
		setFont(new Font("Verdana", Font.BOLD, 50));
		add(buttonsPanel);
	}
	
	//Draws all of the images for the screen
	public void paintComponent(Graphics i)
	{
		super.paintComponent(i);
		//different squares
		i.setColor(Color.blue);
		i.fillRect(X, Y, L, W);
		i.fillRect(X+180, Y+180, L, W);
		
		i.setColor(Color.cyan);
		i.fillRect(X, Y+180, L, W);
		i.fillRect(X+180, Y, L, W);
		
		//Text
		i.setColor(Color.RED);
		i.drawString("GAME OVER", X+10, Y-100);
	}
		private class ButtonListener implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				JFrame frame = new JFrame("CuBez"); //put the name of the game once decided here
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				//Inserts the graphics and buttons
				IntroPanel pane = new IntroPanel();
				
				frame.getContentPane().add(pane);
				frame.pack();
				frame.setVisible(true);
			}

	}
	
}
                                                                                            