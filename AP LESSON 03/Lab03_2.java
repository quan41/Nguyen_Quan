import java.util.Scanner;
public class Lab03_2
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How much do you weigh?");
		double weight = keyboard.nextInt();
		System.out.println("How tall are you?");
		double height = keyboard.nextInt();
		System.out.println("Your BMI is " + weight / height * height );
	}	
	
	
	
	
}
