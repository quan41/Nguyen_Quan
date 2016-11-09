import java.util.Scanner;
public class CompoundInterest
{
	public static void main(String[]args)
	{
		CompoundInterest card = new CompoundInterest();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Whats your rate");
		double rate = kb.nextDouble();
		kb.nextLine();
		System.out.println("Whats your principal");
		double principal = kb.nextDouble();
		kb.nextLine();
		System.out.println("What is the time");
		double time = kb.nextDouble();
		kb.nextLine();
		System.out.println("Whats your number ");
		double number = kb.nextDouble();
		kb.nextLine();
		
		
		
		System.out.printf("Your monthly payment will be %.2f", payment(rate, principal, number, time));
	} 

	public static double payment(double r, double p, double n, double t)
	{
		double var = p*Math.pow((1+(r/n)),n*t);
		return var/(12*t);
	}
	
	
	
		
	
}