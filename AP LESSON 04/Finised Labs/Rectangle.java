import java.util.Scanner;
public class Rectangle
{
	static double l;
		
	public static void main(String[]args)
	{
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the length of the rectangle: ");
		l = kb.nextDouble();
		
		
		System.out.println("Please enter the width of the rectangle: ");
		String dummy = kb.nextLine();
		double w = kb.nextDouble();
		double p = 2 * w + 2 * l;
		System.out.println("Your rectangle is " + p + " feet around");
		
	
	} 

	
}