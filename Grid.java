import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Grid extends JPanel
{
	private int dim = 0; //dim is number columns = number rows
	private int gridSize = 0; //int representation of number of pixels (height, width)
	private JButton chosenOne, other;
	
	JFrame frame = new JFrame("Grid Game");
	JPanel panel = new JPanel();
	randPosCol newPosition;
	ButtonListener listener = new ButtonListener();
	
	JButton newChosen;
	JButton newOther;
	
	int randCol = 0, randRow = 0;

	
	//Constructor
	public Grid(int dimension)
	{
		dim = dimension;
		newPosition = new randPosCol(dim);
		gridSize = 750; //gridSize var is 750px
		
		panel.setBackground(Color.blue);
		panel.setLayout(new GridLayout(dim, dim));
		
		randCol = newPosition.getCol();
		randRow = newPosition.getRow();

		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
		for (int i = 0; i < dim; i++) 
		{
			for (int c = 0; c < dim; c++)
			{

				if (i == randCol && c == randRow)
				{
					//setChosenOne(new JButton());
					//getChosenOne().setSize(new Dimension(50, 50));
					
					//getChosenOne().setBorder(BorderFactory.createLineBorder(Color.black));
					//getChosenOne().setBackground(Color.black);
					
					chosenOne = new JButton();
					chosenOne.setSize(new Dimension(50,50));
					
					chosenOne.setBorder(BorderFactory.createLineBorder(Color.black));
					chosenOne.setBackground(Color.black);
					
					chosenOne.addActionListener(listener);
					panel.add(getChosenOne());
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
			if (event.getSource() == getChosenOne())
			{
				dim++;
				
				newPosition = new randPosCol(dim);
				randCol = newPosition.getCol();
				randRow = newPosition.getRow();
				
				JFrame newFrame = new JFrame("new");
				JPanel newPanel = new JPanel();
				
				newPanel.setBackground(Color.blue);
				newPanel.setLayout(new GridLayout(dim, dim));
				
				for (int i = 0; i < dim; i++) 
				{
					for (int c = 0; c < dim; c++)
					{

						if (i == randCol && c == randRow)
						{					
							chosenOne = new JButton();
							chosenOne.setSize(new Dimension(25,25));
							
							chosenOne.setBorder(BorderFactory.createLineBorder(Color.black));
							chosenOne.setBackground(Color.black);
							
							chosenOne.addActionListener(listener);
							newPanel.add(chosenOne);
						}
						else
						{
							other = new JButton();
							other.setSize(new Dimension(25,25));
							
							other.setBorder(BorderFactory.createLineBorder(Color.black));
							other.setBackground(Color.cyan);
							
							other.addActionListener(listener);
							newPanel.add(other);

						}

					}
				}
				
				newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				newPanel.setSize(new Dimension(100, 100));
				
				newFrame.getContentPane().add(newPanel);
				newFrame.pack();
				newFrame.setSize(new Dimension(gridSize, gridSize));
				newFrame.setVisible(true);
				
				newFrame.invalidate();
				newFrame.validate();
				
			}
			if (event.getSource() == other)
			{
				//timer -= 5;
			}
		}
	}
	
	//Getters
	public int getDim() {return dim;}
	
	public JButton getChosenOne() {return chosenOne;}
	public JButton getOther() {return other;}
	
	//Setters
	public void setChosenOne(JButton chosenOne) 
	{
		this.chosenOne = chosenOne;
	}
	public void setOther(JButton other) 
	{
		this.other = other;
	}
	
}