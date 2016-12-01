import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Grid extends JPanel
{
	private int dim = 0; //dim is number columns = number rows
	private int gridSize = 0; //int representation of number of pixels (height, width)
	private JButton chosenOne, other;
	private int count = 0;
	
	//Constructor
	public Grid(int dimension)
	{
		dim = dimension;
		count = dimension;
		randPosCol newPosition = new randPosCol(dim);
		gridSize = 750; //gridSize var is 750px
		
		JFrame frame = new JFrame("Grid Game");
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.blue);
		panel.setLayout(new GridLayout(dim, dim));
		TimerPanel timer = new TimerPanel(frame);
//		timer.setBounds(500, 200, 100, 100);		
		JFrame frame1 = new JFrame("Timer"); //put the name of the game once decided here
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Inserts the graphics and buttons
		frame1.getContentPane().add(timer);
		frame1.setLocation(800, 0);
		
		frame1.pack();
		frame1.setVisible(true);
		
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
		for (int i = 0; i < dim; i++) 
		{
			for (int c = 0; c < dim; c++)
			{
				ButtonListener listener = new ButtonListener();					

				if (i == newPosition.getCol() && c == newPosition.getRow())
				{
					chosenOne = new JButton();
					chosenOne.setSize(new Dimension(50, 50));
					
					chosenOne.setBorder(BorderFactory.createLineBorder(Color.black));
					chosenOne.setBackground(Color.black);
					
					chosenOne.addActionListener(listener);
					panel.add(chosenOne);
				}
				else
				{
					other = new JButton();
					other.setSize(new Dimension(50,50));
					
					other.setBorder(BorderFactory.createLineBorder(Color.black));
					other.setBackground(Color.cyan);
					
					other.addActionListener(listener);
					panel.add(other);

				}

			}
		}
		panel.setSize(new Dimension(100, 100));
		
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setSize(new Dimension(gridSize, gridSize));
		frame.setVisible(true);
	}
	
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == chosenOne)
			{
				dim += 1;
				//timer += 5;
			}
			if (event.getSource() == other)
			{
				//timer -= 5
			}
		}
	}
	
	
	//Getters
	public int getDim() {return dim;}
	public int getCount() {return count;}
	
	//Setters
	public void changeGrid() 
	////to be implemented after checking if dim != count and returning bool for main class
	{
		if (dim != count)
		{
			count += 1;
		}

	}
	
}
