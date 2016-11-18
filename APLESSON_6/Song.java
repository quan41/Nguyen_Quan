public class Song
{
	public static void main(String[]args)
	{
		sing("Na", 4);
		sing("Na", 4);
		sing("Hey", 3);
		sing("Goodbye!", 1);
	}
	
	public static void sing(String word, int repetition)
	{
		for (int i = 1; i <= repetition; i++) 
		{
			System.out.printf(word + " ");
		}
		System.out.println();
	}
}