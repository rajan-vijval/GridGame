//This class sets up the panel so that it displays the intro screen
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

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
		JFrame frame = new JFrame("CuBez"); //put the name of the game once decided here
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textPanel = new JPanel();
		JTextField input = new JTextField(6);
		textPanel.setPreferredSize(new Dimension(100,45));
		textPanel.setBackground(Color.LIGHT_GRAY);
		textPanel.add(input);
		
		buttonPanel = new JPanel();
		JButton b1 = new JButton("Start!");
		b1.addActionListener(new ButtonListener());
		buttonPanel.setPreferredSize(new Dimension(100,40));
		buttonPanel.setBackground(Color.LIGHT_GRAY);
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
		i.fillRect(X-10, Y, L, W);
		i.fillRect(X+170, Y+180, L, W);
		
		i.setColor(Color.cyan);
		i.fillRect(X-10, Y+180, L, W);
		i.fillRect(X+170, Y, L, W);
		
		//Text
		i.setColor(Color.BLUE);
		i.drawString("C", X+110, Y-190);
		i.setColor(Color.RED);
		i.drawString("u", X+130, Y-190);
		i.setColor(Color.GREEN);
		i.drawString("B", X+150, Y-190);
		i.setColor(Color.YELLOW);
		i.drawString("e", X+170, Y-190);
		i.setColor(Color.BLACK);
		i.drawString("z", X+190, Y-190);
		i.setColor(Color.cyan);
		i.drawString("The Colorful Reaction Game", X-20, Y-150);
		i.drawString("By: \n" + "Vijval Rajan \n" + "and \n" + "Nicolas Wirtz", X-50, Y-100);
	}
	
	//--------------------------------------------------
	//Makes a listener for button  push (action) events
	//--------------------------------------------------
	
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
		JFrame frame2 = new JFrame("CuBez"); 
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Inserts the graphics and buttons
		int size = 2;
		Grid gridGame = new Grid(size);
		
		frame2.getContentPane().add(gridGame);
		frame2.pack();
		frame2.setVisible(true);
		}
	}

}
                                                                                            