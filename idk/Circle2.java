import java.util.Scanner;

public class Circle2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		double r = kb.nextDouble();
		
		print(r, calcArea(r));
	}
	
	public static double calcArea(double r)
	{
		return 3.14 * r * r;
		
	}
	
	public static void print(double r, double Area)
	{
		System.out.printf("The area of a circle with a radius of %.2f is %.5f.", r, Area);
	}
	
	
}