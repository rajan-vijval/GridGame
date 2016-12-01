//randomly chooses a position on the grid for the different square
import java.util.Random;

public class randPosCol
{
	private int randCol, randRow;
	private Random rand = new Random();
	
	//Constructor
	public randPosCol(int dimension) //meant to be used with dim in Grid.java
	{
		randCol = rand.nextInt(dimension);
		randRow = rand.nextInt(dimension);
	}
	
	//Setter - may be combined because always changing both at same time
	public void setColAndRow(int newDimension)
	{
		randCol = rand.nextInt(newDimension);
		randRow = rand.nextInt(newDimension);
	}
	
	//Getter
	public int getCol()	{return randCol;}
	public int getRow() {return randRow;}
}
