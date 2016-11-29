//This class sets up the panel so that it displays the intro screen
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.*;
import java.awt.*;

public class OutroPanel extends JPanel 
{
	private final int X = 240, Y = 300, L = 180, W = 180;
	private JPanel buttonPanel;
	private JButton b1;
	private JButton b2;
	//Constructor: This sets up the main components for the entire panel
	public OutroPanel ()
	{
		
		buttonPanel = new JPanel();
		JButton b1 = new JButton("Play Again");
		JButton b2 = new JButton("Score Board");
		buttonPanel.setPreferredSize(new Dimension(100,70));
		buttonPanel.setBackground(Color.LIGHT_GRAY);
		buttonPanel.add(b1);
		buttonPanel.add(b2);
		
		setPreferredSize(new Dimension(840,900));
		setBackground(Color.LIGHT_GRAY);
		setFont(new Font("Verdana", Font.BOLD, 50));
		add(buttonPanel);
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
	
	

		

	
}
                                                                                            