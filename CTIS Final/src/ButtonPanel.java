/*This class sets up the panel section with a button to
 *continue to the game and a text field to enter a name.
 *It is also placed on the intro frame.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonPanel extends JPanel
{
	private JButton start;
	private JTextField name;
	
	public ButtonPanel()
	{
		start = new JButton("Start!");
		setPreferredSize(new Dimension(100,50));
		
		name = new JTextField("Please Enter Your Name");
		setPreferredSize(new Dimension(100,50));

	}

	
}
