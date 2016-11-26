import java.awt.*;
import javax.swing.*;

public class Grid extends JPanel
{
	private int dim = 0; //dim is number columns = number rows
	
	//Constructor
	public Grid(int dimension) 
	{
		dim = dimension;
		
		JFrame frame = new JFrame("Grid Game");
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.blue);
		panel.setLayout(new GridLayout(dim, dim));

		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
		for (int i = 0; i < dim; i++) 
		{
			for (int c = 0; c < dim; c++)
			{
				SquarePanel pane = new SquarePanel();
				pane.setPreferredSize(new Dimension(50, 50));
				if (((c + i) % 2) == 0) {
					pane.setBackground(Color.cyan);	
				} else 
				{
					pane.setBackground(Color.yellow);
				}
				
				panel.add(pane);
			}
		}
		
		frame.getContentPane().add(panel);
		
		frame.pack();
		frame.setVisible(true);
	}
}