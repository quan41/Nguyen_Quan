import java.util.Scanner;
public class Lesson2
{
	static int digit = 0;
	static int avg = 0; 
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = kb.nextInt();
		avgDigits(number);
		System.out.println("The average of the digits in " + number + " is " +  avg);
	}
	
	public static void avgDigits(int num)
	{
		
		while (num > 0)
		{
			digit++;
			avg +=(num % 10);
			num /=10;
		}
			avg = avg / digit;
	}
	
	
}