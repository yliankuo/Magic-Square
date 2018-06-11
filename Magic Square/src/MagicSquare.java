/* Project Name: MagicSquare
 * Author: Ian Kuo && Ryan Tiernan
 * Description: Creates MagicSquare class that constructs a matrix
 */

//imports classes
import java.util.ArrayList;
import java.util.Random;
public class MagicSquare 
{
	//Creates Instance Fields
	private int [] [] square;
	private int size;
	
	//Creates a constructor with parameter num
	public MagicSquare(int num)
	{
		//Creates num by num matrix
		square = new int [num] [num];
		
		//Establishes local variables
		size = num * num;
		Random rand = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//fills list with numbers from 1 to size
		for (int k = 1; k <= size; k++)
		{
			list.add(k);
		}
		
		//Fills square matrix while making sure no numbers repeat
		for (int i = 0; i < num; i++)
		{
			for (int j = 0; j < num;)
			{
				//Searches through list
				for (int l = 0; l < list.size(); l++)
				{
					int number = rand.nextInt(size) + 1;
					
					//Checks if number is in list
					if (list.get(l) == number && j!=num)
					{
						//Sets [i][j] to be the random number and removes it from list
						square [i][j] = number;
						list.remove(l);
						j++;
					}
				}

			}
		}

	}
	
	//Creates a constructor that takes in a matrix
	//Precondition matrix must be a square
	public MagicSquare(int [] [] squ)
	{
		square = squ;
		size = squ.length * squ.length;
	}
	
	//Creates an accessor to check if the matrix is a magic Square
	public boolean checkSquare()
	{
		int constant = square.length * ( size + 1) / 2;
		//Cycles through the matrix
		for (int i = 0; i < square.length; i++)
		{
			//Creates four sum variables
			int sum = 0, sum2 = 0, sum3 = 0, sum4 = 0;
			for (int j = 0; j < square[0].length; j++)
			{
				//adds value to each of the sums
				sum += square[i][j];
				sum2 += square[j][i];
				sum3 += square[j][j];
				sum4 += square[j][square.length-1-j];
			}
			
			//Returns false if sum doesn't equal the magic number
			if (sum != constant || sum2 != constant || sum3 != constant || sum4 != constant)
			{
				return false;
			}
			
		}
		
		return true;
	}
	
	//Overrides the default toString method
	public String toString()
	{
		String text = "";
		//Creates a string with the matrix contained
		for (int i = 0; i < square.length; i++)
		{
			for (int j = 0; j < square[0].length; j++)
			{
				if (square[i][j] < 10)
				{
					text = text + "0" + square[i][j] + " ";
				}
				else
					text = text + square[i][j] + " ";
			}
			
			text += "\n";
		}
		
		return text;
	}
}
