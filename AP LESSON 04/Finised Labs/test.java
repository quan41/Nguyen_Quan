import java.util.Scanner;
public class test
{
	public static void main(String[]args)
	{
		test receipt = new test();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter item1: ");
		String item1 = kb.nextLine();
		System.out.println("Please enter price: ");
		double price1 = kb.nextDouble();
		
		System.out.println("Please enter item2: ");
		String dummy = kb.nextLine();
		String item2 = kb.nextLine();
		System.out.println("Please enter price: ");
		double price2 = kb.nextDouble();
		
		System.out.println("Please enter item3: ");
		String dummy2 = kb.nextLine();
		String item3 = kb.nextLine();
	
		System.out.println("Please enter price: ");
		double price3 = kb.nextDouble();
		
		System.out.println("<<<<<<RECEIPT>>>>>>>>");

		receipt.format(item1, price1);
		receipt.format(item2, price2);
		receipt.format(item3, price3);
		double subtotal = (price1 + price2 + price3);
		
		receipt.format("Subtotal:", subtotal);
		receipt.format("Tax:", subtotal * 0.07);
		receipt.format("Total:", subtotal + subtotal * 0.07);
	} 

	public void format(String item, double price)
	{
		System.out.printf("\n%10s.....%3.2f", item, price);
	}
	
	
	
	
}
