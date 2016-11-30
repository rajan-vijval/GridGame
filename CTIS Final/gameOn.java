
public class gameOn 
{
	public static void main(String[] args) 
	{ 
		int size = 2;
		Grid gridGame = new Grid(size);
		int count = 0;
		
		while (count == count)
		{
			
			if ((gridGame.getDim() - gridGame.getCount()) == 1)
			{
				gridGame.changeGrid();
				gridGame = new Grid((size++));
			}
			
			count++;
		}
	}

}
