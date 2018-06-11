/* Project Name: MagicSquare
 * Author: Ian Kuo && Ryan Tiernan
 * Description: Creates Driver class that constructs and tests Magic Squares
 */
public class Driver 
{
	public static void main (String [] args)
	{
		//Creates 2 Magic Squares
		int [] [] matrix = {{9,6,3,16},{4,15,10,5},{14,1,8,11},{7,12,13,2}};
		MagicSquare square = new MagicSquare(4);
		MagicSquare square2 = new MagicSquare(matrix);
		
		//Displays and checks Magic Squares
		System.out.print(square);
		System.out.println(square.checkSquare());
		System.out.println();
		System.out.print(square2);
		System.out.println(square2.checkSquare());
		

	}
}
