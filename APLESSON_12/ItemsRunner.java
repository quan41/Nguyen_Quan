import java.util.Scanner;
public class ItemsRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your item name");
		String name = kb.nextLine();
		System.out.println("Please enter your manufacturer");
		String man = kb.nextLine();
		System.out.println("Would you like to enter category and price information (yes or no) ");
		String choice = kb.nextLine();
		if (choice.equals("no"))
		{
			Items item1 = new Items(man,name);
			System.out.println(item1);
		}
		else 
		{
			System.out.println("Please enter a category");
			String cat = kb.nextLine();
			System.out.println("Please enter a price");
			double price = kb.nextDouble();
			Items item1 = new Items(man,name,cat,price);
			System.out.println(item1);
		}
		
	}

}