import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TImerPanel extends JPanel implements ActionListener
//this sets up the timer so it counts from 100 and counts by seconds
{
	JLabel setTime = new JLabel();
	int time = 100;
	Timer setT = new Timer(1000,this);

	//----------------------------------------------
	//Constructor: Sets up timer Panel
	//----------------------------------------------

	public TImerPanel ()
	{
		setBackground(Color.cyan);
		setPreferredSize(new Dimension(400,400));
	
		setFont(new Font("Helvetica", Font.BOLD, 22));
		add(setTime);
		setT.start();
		setVisible(true);
	}
	//This creates the logic for the timer
	public void logic()
	{
		time--;
		setTime.setText(""+time);
	}
	//implements the logic for the timer
	public void actionPerformed(ActionEvent e)
	{
		logic();
		repaint();
	}
}
