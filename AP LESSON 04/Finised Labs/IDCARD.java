import java.util.Scanner;
public class IDCARD
{
	public static void main(String[]args)
	{
		IDCARD card = new IDCARD();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter your first name: ");
		String name1 = kb.nextLine();
		System.out.println("Please enter your last name: ");
		String name2 = kb.nextLine();
		
		System.out.println("Please enter your title: ");
		
		String title = kb.nextLine();
		System.out.println("Please enter the school site: ");
		String school = kb.nextLine();
		
		System.out.println("Please enter the school year: ");
		String year = kb.nextLine();
	
		System.out.println("Please enter your subject: ");
		String subject = kb.nextLine();
		
		System.out.println("ID CARD");
		System.out.println("******************************");
		card.format(school, year);
		card.format(name1, name2);
		card.format(title, subject);
		System.out.println("******************************");
		
	} 

	public void format(String a, String b)
	{
		System.out.printf("*%14s%14s*\n", a, b);
	}
	
	
	
		
	
}