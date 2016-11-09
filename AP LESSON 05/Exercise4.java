import java.util.Scanner;
public class Exercise4
{
	static double BMI;
	static String condition;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Whats your BMI");
		BMI = kb.nextDouble();
		condition = calcCondi();
		
		System.out.println("You are " + condition);
	}
	public static String calcCondi()
	{
		if (BMI < 18.5)
			return "Underweight";
		if (BMI >= 18.5 && BMI < 24.9)
			return "Normal";
		if (BMI >= 25 && BMI < 29.9)
			return "Overweight";
		if (BMI >= 30 && BMI < 34.9)
			return "Obese";
		if (BMI >= 35 && BMI < 39.9)
			return "Very Obese";
		if (BMI > 39.9)
			return "Mobidly Obese";
		return " ";
	}
	
	
}