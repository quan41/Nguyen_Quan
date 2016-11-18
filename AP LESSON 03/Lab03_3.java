import java.util.Scanner;
public class Lab03_3
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many apples do you have? ");
		int a = keyboard.nextInt();
		System.out.println("How many oranges do you have? ");
		int b = keyboard.nextInt();
		System.out.println("You have " + (a + b) + " fruit");
	}	
	
	
	
	
}
