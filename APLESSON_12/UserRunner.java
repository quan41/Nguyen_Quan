import java.util.Scanner;
public class UserRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your first name");
		String fn= kb.nextLine();
		System.out.println("Enter your last name");
		String ln = kb.nextLine();
		System.out.println("Would you like to have an avatar (yes or no) ");
		String choice = kb.nextLine();
		if (choice.equals("no"))
		{
			User user1 = new User(fn,ln);
			System.out.println(user1);
		}
		else 
		{
			System.out.println("Please enter a avatar");
			String av = kb.nextLine();
			User user1 = new User(fn,ln,av);
			System.out.println(user1);
		}
		
	}

}