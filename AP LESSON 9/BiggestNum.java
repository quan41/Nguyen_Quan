public class BiggestNum
{
	static int[] num = new int[10];

	public static void main(String[]args)
	{
	
	fillArray();
	
	}
	
	
	public static void fillArray()
	{
		for(int i = 0; i < num.length; i++)
		{
			num[i] = (int)(Math.random()*100)+1;
		}
		System.out.println("For the following numbers...");
		printArray();
		
	}
	
	public static void printArray()
	{
		for (int numb : num)
		{
			System.out.print(numb + " ");
		}
		
		System.out.println("\nThe biggest number is " + getBiggest());
			
	}
	
	public static int getBiggest()
	{
		int max = 0;
		for (int numb : num)
		{
			if(numb > max)
			{
				max = numb;
			}
		}
		return max; 
	}
	
}