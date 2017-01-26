import java.util.Scanner;
public class ReverseWord
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter 5 words");
		String[] word = new String[5];
		
		for(int i = 0; i < word.length; i++)
		{
			word[i] = kb.next();
		}
		
		System.out.println("In order..");
		
		for(String words : word)
		{
			System.out.println(words);
		}
		System.out.println();
		
		System.out.println("Reversed...");
		reverse(word);
	}
	
	public static void reverse(String[] w)
	{
		for(int i = w.length-1; i >=0; i--)
		{
			System.out.println(w[i]);
		}
	}
}	