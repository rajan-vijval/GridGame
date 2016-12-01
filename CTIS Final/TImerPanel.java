import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TImerPanel extends JPanel implements ActionListener
//this sets up the timer so it counts from 100 and counts by seconds
{
	JLabel setTime = new JLabel();
	int time = 5;
	int done = 0;
	Timer setT = new Timer(1000,this);

	//----------------------------------------------
	//Constructor: Sets up timer Panel
	//----------------------------------------------

	public TImerPanel ()
	{
		
		setFont(new Font("Verdana", Font.BOLD, 22));
		add(setTime);
		setT.start();
		setVisible(true);
	}
	//This creates the logic for the timer
	public void logic()
	{
		if(time>0)
		{	
		time--;
		setTime.setText(""+time);
		if (time==0)
		{
		//from OutroPanel Constructor class
			setTime.setText(""+done);
			
			JFrame frame = new JFrame("CuBez"); //put the name of the game once decided here
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			//Inserts the graphics and buttons
			OutroPanel image = new OutroPanel();
			frame.getContentPane().add(image);
			
			frame.pack();
			frame.setVisible(true);
		}	
		}
		
		//if (incorrect square clicked)
		//{
		//	time-3;
		//	setTime.setText(""+time);
		// else		null
		//}
	}

	
	//implements the logic for the timer
	public void actionPerformed(ActionEvent e)
	{
		logic();
		repaint();
	}
}
