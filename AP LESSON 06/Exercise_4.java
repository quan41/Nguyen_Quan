import java.util.Scanner;
public class Exercise_4
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner (System.in);
		System.out.println("Put in an integer: ");
		int a = kb.nextInt();
		System.out.println("Put in the size of the table: ");
		int b = kb.nextInt();
		String c = "cat";
		 
		for(int i = 1;  i <= b; i++)
		{
			System.out.println(i);
			
		}
		System.out.println(c.substring(0,b));
	}
}