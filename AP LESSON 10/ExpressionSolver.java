import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class ExpressionSolver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your equation:");
		String eq = kb.nextLine();
		ArrayList <String> equation = new ArrayList <String> (Arrays.asList(eq.split(" ")));
		solveEquatiion(equation);
	}
	
	public static void solveEquatiion(ArrayList <String> solve)
	{
		for(int i = 1; i < solve.size(); i++)
		{
			if (solve.get(i).equals("-"))
			{
				Integer num = Integer.parseInt(solve.get(i-1)) - Integer.parseInt(solve.get(i+1));
				solve.set(i, " " + num + " ");
				solve.remove(i-1);
				solve.remove(i);
			}
			
			else if (solve.get(i).equals("+"))
			{
				Integer num = Integer.parseInt(solve.get(i-1)) + Integer.parseInt(solve.get(i+1));
				solve.set(i, " " + num + " ");
				solve.remove(i-1);
				solve.remove(i);
			}
			
			else if (solve.get(i).equals("*"))
			{
				Integer num = Integer.parseInt(solve.get(i-1)) * Integer.parseInt(solve.get(i+1));
				solve.set(i, " " + num + " ");
				solve.remove(i-1);
				solve.remove(i);
			}
			
			else if (solve.get(i).equals("/"))
			{
				Integer num = Integer.parseInt(solve.get(i-1)) / Integer.parseInt(solve.get(i+1));
				solve.set(i, " " + num + " ");
				solve.remove(i-1);
				solve.remove(i);
			}
		}
		System.out.println("The answer is " + solve);
	}
}