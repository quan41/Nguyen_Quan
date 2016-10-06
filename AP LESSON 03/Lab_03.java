import java.util.Scanner;
public class Lab_03
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Whats your name?");
		String name = keyboard.next();
		System.out.println("Wow... " + name + " is such a dumb name...");
		System.out.println("How old are you?");
		int num = keyboard.nextInt();
		System.out.println(num + " is such an bad age");
		System.out.println("What do you do for fun?");
		String hobby = keyboard.next();
		System.out.println("Honestly " + hobby + " is a pretty lame hobby.");
		System.out.println("What music do you listen to?");
		String music = keyboard.next();
		System.out.println(music + " is a terrible genre");
		System.out.println("How many siblings do you have?");
		String siblings = keyboard.next();
		System.out.println(siblings + " is such a bad number of siblings");
		System.out.println("What do you wanna be when you grow up?");
		String future = keyboard.next();
		System.out.println("Yeah theres no way you are going to become a " + future);
		System.out.println("Okay stop talking to me now.");
		
		
		
	}	
	
	
	
	
}
