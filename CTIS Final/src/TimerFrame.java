import javax.swing.*;
import java.awt.*;

public class TimerFrame extends JFrame{
//Constructor: this sets up the entire JFrame for the timer
	public TimerFrame ()
{
	add(new TimerPanel());
	setSize(new Dimension(400,400));
	setTitle("Timer");
	setVisible(true);
}
	public static void main(String[] args) 
	{
		TimerFrame time = new TimerFrame();
		}
}

