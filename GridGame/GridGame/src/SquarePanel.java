import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SquarePanel extends JPanel
{
	/*
	 * Creating a class for individual square on the grid
	 */
	
	private JButton squareButton;
	
	public SquarePanel()
	{
		squareButton = new JButton();
		squareButton.addActionListener(new ButtonListener());
	}
	
	private class ButtonListener implements ActionListener
	{
		
		public void actionPerformed(ActionEvent event)
		{
			//whatever we need to do with the score thing
		}
	}
}