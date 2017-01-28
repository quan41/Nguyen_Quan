import java.util.Scanner;
public class CarRunner
{
   public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a paint color");
		String p= kb.nextLine();
		System.out.println("Enter an interior");
		String i= kb.nextLine();
		System.out.println("Enter an engine");
		String e= kb.nextLine();
		System.out.println("Enter some tires ");
		String t= kb.nextLine();
		
		Car object = new Car(p,i,e,t);
		
		System.out.println("Your vehicle is ready......");
		System.out.println("Paint :" + object.getPaint());
		System.out.println("Interior :" + object.getInterior());
		System.out.println("Engine :" + object.getEngine());
		System.out.println("Tires :" + object.getTires());
     }
}
