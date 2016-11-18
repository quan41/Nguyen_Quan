import java.util.Scanner;
public class Exercise_5
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner (System.in);
		System.out.println("Put in a nuber: ");
		int a = kb.nextInt();
		System.out.println("Put in another number: ");
		int b = kb.nextInt();
		for(int i = 0; i <= a; i = i + b)
		{
			System.out.println(i);
		}
	}
}

