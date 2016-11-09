import java.util.Scanner;
public class Exercise3
{
	static double gpa;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner (System.in);
		System.out.println("What is your grade for English ");
		String eng = kb.nextLine();
		System.out.println("What is your grade for Math ");
		String math = kb.nextLine();
		System.out.println("What is your grade for Science ");
		String sci = kb.nextLine();
		System.out.println("What is your grade for History ");
		String hist = kb.nextLine();
		System.out.println("What is your grade for Language ");
		String lang = kb.nextLine();
		System.out.println("What is your grade for Art ");
		String art = kb.nextLine();
		System.out.println("What is your grade for Computer Science ");
		String comp = kb.nextLine();
		
		gpa = (calcPoints(eng)+calcPoints(math)+calcPoints(sci)+calcPoints(hist)+calcPoints(lang)+calcPoints(art)+calcPoints(comp))/7;
		System.out.println("Your gpa is " + gpa);
		
	}
	public static double calcPoints(String grade)
	{
		if (grade.equals("A"))
			return 4.0;
		if (grade.equals("B"))
			return 3.0;
		if (grade.equals("C"))
			return 2.0;
		if (grade.equals("D"))
			return 1.0;
		return 0.0;
	}
}