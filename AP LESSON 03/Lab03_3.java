import java.util.Scanner;
public class Lab03_3
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many apples do you have? ");
		double a = keyboard.nextInt();
		System.out.println("How many apples do you want? ");
		double b = keyboard.nextInt();
		System.out.println("You have " + (a - b) + " extra apples"  );
	}	
	
	
	
	
}
