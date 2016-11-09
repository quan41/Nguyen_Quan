import java.util.Scanner;
public class Subwoofer
{
	public static void main(String[]args)
	{
		Subwoofer sound = new Subwoofer();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Whats your height");
		double height = kb.nextDouble();
		kb.nextLine();
		System.out.println("Whats your length");
		double length = kb.nextDouble();
		kb.nextLine();
		System.out.println("Whats your width");
		double width = kb.nextDouble();
		kb.nextLine();
		
		
		
		System.out.printf("Your volume will be %.2f", volume(height, length,width));
	} 

	public static double volume(double h, double l, double w)
	{
		double var = h*l*w; 
		return var/(12);
	}
	
	
	
		
	
}