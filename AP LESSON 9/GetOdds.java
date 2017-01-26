public class GetOdds
{
	static int[] num;
	public static void main(String[]args)
	{
		num = new int[10];
		fillArray();
		printArray();
		System.out.println("These numbers are odd numbers " + getOdds() + ".");
	}
	public static void fillArray()
	{
		for (int i = 0; i < 10; i++)
		{
			num[i] = (int)(Math.random() * 100) + 1;
		}
	}
	public static void printArray()
	{
		System.out.print("For the following numbers... ");
		for (int n : num)
		{
			System.out.print(n + " ");
		}
		System.out.println();
	}
	public static String getOdds()
	{
		String odds = "";
		for (int n : num)
		{
			if (n % 2 == 1)
			{
				odds += n + " ";
			}
		}
		return odds;
	}
}