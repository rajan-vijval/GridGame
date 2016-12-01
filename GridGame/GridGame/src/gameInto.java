//Class for the intro screen for the game
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.*;
public class gameInto 
{
	static JFrame frame;
	//This will set up the main frame of the screen
	public static void main(String[] args)
	{
		frame = new JFrame("CuBez"); //put the name of the game once decided here
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Inserts the graphics and buttons
		IntroPanel pane = new IntroPanel(frame);
		
		frame.getContentPane().add(pane);
		frame.pack();
		frame.setVisible(true);
	
	}
	
	public static void delete(){
		frame.setVisible(false);
	}
}
