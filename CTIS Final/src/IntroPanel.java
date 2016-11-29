//This class sets up the panel so that it displays the intro screen
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.*;
import java.awt.*;

public class IntroPanel extends JPanel 
{
	private final int X = 260, Y = 300, L = 180, W = 180;
	private JPanel buttonPanel;
	private JPanel textPanel;
	private JButton b1;
	private JTextField input;
	private JLabel name;
	//Constructor: This sets up the main components for the entire panel
	public IntroPanel ()
	{
		textPanel = new JPanel();
		JTextField input = new JTextField(6);
		textPanel.setPreferredSize(new Dimension(100,40));
		textPanel.setBackground(Color.WHITE);
		textPanel.add(input);
		
		buttonPanel = new JPanel();
		JButton b1 = new JButton("Start!");
		buttonPanel.setPreferredSize(new Dimension(100,40));
		buttonPanel.setBackground(Color.WHITE);
		buttonPanel.add(b1);
		
		setPreferredSize(new Dimension(840,900));
		setBackground(Color.LIGHT_GRAY);
		setFont(new Font("Verdana", Font.BOLD, 22));
		JLabel name = new JLabel("Please Enter Your First Name:");
		add(name);
		add(textPanel);
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
		i.setColor(Color.BLACK);
		i.drawString("CuBez \n" + "The Colorful Reaction Game", X-50, Y-200);
		i.drawString("By: \n" + "Vijval Rajan \n" + "and \n" + "Nicolas Wirtz", X-50, Y-100);

		
		


	}
	
	

		

	
}
                                                                                            