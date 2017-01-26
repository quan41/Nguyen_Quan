import java.util.Scanner;
public class Fibbonacci
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a starting number: ");
		int start = kb.nextInt();
		System.out.println("Enter a sequence size: ");
		int size = kb.nextInt();
		System.out.print("\n");
		int[] seq = new int[size];
		
		for(int i = 0; i<seq.length;i++)
		{
			if(i==0)
			{
				seq[i]=start;
			}
			else if(i==1)
			{
				seq[i]=start;
			}
			else
			{	
				seq[i]=seq[i-2]+seq[i-1];
			}	
		}
		
		for(int num : seq)
		{
			System.out.println(num);
		}
	}
}