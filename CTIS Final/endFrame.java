//Class for the End screen for the game
import javax.swing.JFrame;
import javax.swing.JPanel;

public class endFrame {

	//This will set up the main frame of the screen
	public static void main(String[] args) 
	{
	
				JFrame frame = new JFrame("CuBez"); //put the name of the game once decided here
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				//Inserts the graphics and buttons
				OutroPanel image = new OutroPanel();
				frame.getContentPane().add(image);
				
				frame.pack();
				frame.setVisible(true);
	}
		

	}


