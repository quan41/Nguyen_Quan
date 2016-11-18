import java.util.Scanner;
public class Exercise_6
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner (System.in);
		System.out.println("Put in a Word: ");
		String s = kb.nextLine();
		for(int i = s.length(); i >= 0; i--)
		{
			System.out.println(s.substring(0,i));
		}
	}
}