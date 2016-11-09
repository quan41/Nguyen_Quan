import java.util.Scanner;
public class Exercise2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner (System.in);
		System.out.println("Enter Item 1: ");
		String item1 = kb.next();
		System.out.println("Please enter price: ");
		double price1 = kb.nextDouble();
		
		System.out.println("Enter Item 2: ");
		String item2 = kb.next();
		System.out.println("Please enter price: ");
		double price2 = kb.nextDouble();
		
		System.out.println("Enter Item 3: ");
		String item3 = kb.next();
		System.out.println("Please enter price: ");
		double price3 = kb.nextDouble();
		
		System.out.println("Enter Item 4: ");
		String item4 = kb.next();
		System.out.println("Please enter price: ");
		double price4 = kb.nextDouble();
		
		double subtotal = price1 + price2 + price3 + price4;
		double discount = calcDisc(subtotal);
		double tax = subtotal * 0.08;
		double total = subtotal - discount + tax;
		
		format(item1,price1);
		format(item2,price2);
		format(item3,price3);
		format(item4,price4);
	}

	
	public static double calcDisc(double sub)
	{
		if (sub >= 2000)
			return sub * 0.15;
		return 0.0;
	}
	
	public static void format(String item, double price)
	{
		System.out.printf("%10s......%.2f\n", item, price);
	}
}