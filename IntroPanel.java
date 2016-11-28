//This class sets up the panel so that it displays the intro screen
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.*;

public class IntroPanel extends JPanel 
{
	private final int X = 150, Y = 400, L = 60, W = 60;
	//Constructor: This sets up the main components for the entire panel
	public IntroPanel ()
	{
		setBackground(Color.LIGHT_GRAY);
		setPreferredSize(new Dimension(600,700));
		setFont(new Font("Verdana", Font.BOLD, 22));
	}
	
	//Draws all of the images for the screen
	public void paintComponent(Graphics i)
	{
		super.paintComponent(i);
		//different squares
		i.setColor(Color.blue);
		i.fillRect(X, Y, L, W);
		i.fillRect(X+60, Y+60, L, W);
		i.fillRect(X+60, Y, L, W);
		
		i.setColor(Color.cyan);
		i.fillRect(X, Y+60, L, W);
		
		//Text
		i.setColor(Color.BLACK);
		i.drawString("CuBez \n" + "The Colorful Reaction Game", X-50, Y-200);
		i.drawString("By: \n" + "Vijval Rajan \n" + "and \n" + "Nicolas Wirtz", X-50, Y-100);

	}
	private JButton start;
	private JTextField name;
	
	public void buttonComponent()
	{
		JButton start = new JButton("Start!");
		setPreferredSize(new Dimension(100,50));
		
		JTextField name = new JTextField("Please Enter Your Name");
		setPreferredSize(new Dimension(100,50));
		
		add(start);
		add(name);

	}
}
                                                                                            