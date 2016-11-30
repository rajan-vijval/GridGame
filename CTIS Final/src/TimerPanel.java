import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TimerPanel extends JPanel implements ActionListener
//this sets up the timer so it counts from 100 and counts by seconds
{
	JLabel setTime = new JLabel();
//	JLabel score = new JLabel();
	int time = 100;
	Timer setT = new Timer(1000,this);
	//final int COUNT = 0;

	//----------------------------------------------
	//Constructor: Sets up timer Panel
	//----------------------------------------------

	public TimerPanel ()
	{
		setBackground(Color.cyan);
		setPreferredSize(new Dimension(400,400));
	
		setFont(new Font("Verdana", Font.BOLD, 22));
		add(setTime);
		setT.start();
	//	add(score);
		setVisible(true);
	}
	//This creates the logic for the timer
	public void logic()
	{
		time--;
		setTime.setText(""+time);
		
		//if (incorrect square clicked)
		//{
		//	time-3;
		//	setTime.setText(""+time);
		// else		null
		//}
	}
	//public void logic2()
	//{
	//	if(correct square is clicked)
	//	count++;
	//  else
	//		null
	//}
	//implements the logic for the timer
	public void actionPerformed(ActionEvent e)
	{
		logic();
		//logic2();
		repaint();
	}
}
