import java.util.Scanner;
public class Excercise_2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner (System.in);
		System.out.println("Put in a number: ");
		int a = kb.nextInt();
		int fact = 1;   
		for(int i = 1; i <= a; i++)
		{
			fact = fact * i;
			 
			
		}
		System.out.println(fact);
	}
}