import java.util.Scanner;
public class HumanRunner
{
	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter your hair color");
		String hair= user_input.nextLine();
		System.out.println("Enter your eye color");
		String eyes = user_input.nextLine();
		System.out.println("Enter your skin color");
		String skin = user_input.nextLine();
		
		Human object = new Human(hair,eyes,skin);
		
		System.out.println("Your info:");
		System.out.println("Hair: " + object.getHair());
		System.out.println("Eyes: " + object.getEyes());
		System.out.println("Skin: " + object.getSkin());
		
		System.out.println("Enter your friend's hair color");
		hair= user_input.nextLine();
		System.out.println("Enter your friend's eye color");
		eyes = user_input.nextLine();
		System.out.println("Enter your friend's skin color");
		skin = user_input.nextLine();
		object.setHES(hair,eyes,skin);
			
		System.out.println("Your friends info:");
		System.out.println("Hair: " + object.getHair());
		System.out.println("Eyes: " + object.getEyes());
		System.out.println("Skin: " + object.getSkin());
		
	}

}