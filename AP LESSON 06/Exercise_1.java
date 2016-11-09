import java.util.Scanner;
public class Exercise_1
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner (System.in);
		System.out.println("Put in a String: ");
		String s = kb.nextLine();
		for(int i = 0; i <= s.length(); i++)
		{
			System.out.println(s);
		}
	}
}