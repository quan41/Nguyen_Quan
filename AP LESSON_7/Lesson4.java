import java.util.Scanner;
public class Lesson4
{
	static String sent;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		sent = kb.nextLine();
		replace(sent);
	}
	
	public static void replace(String sent)
	{
		while(sent.indexOf("a") >= 0)
		{
			sent = sent.substring(0,sent.indexOf("a")) + "@" + sent.substring(sent.indexOf("a") + 1);
		}
		System.out.println(sent);
	}
	
	
}
