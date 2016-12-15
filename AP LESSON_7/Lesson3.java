import java.util.Scanner;
public class Lesson3
{
	static int num;
	static int number;
	static int rev = 0; 
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = kb.nextInt();
		num = number;
		getReverse();
		System.out.println("Your number in reverse is " + rev);
	}
	
	public static void getReverse()
	{
		while(num > 0)
		{
			rev = rev*10;
			rev =(num % 10) + rev;
			num /= 10;
		}
		
	}
	
}