import java.util.Scanner;
import java.util.Random;
public class GameHealth
{
	static String[] health;
	static int healthload = 6;
	static int healthCount;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Random random = new Random();
		String turn = "";
		int damage = 0;
		int amount = 0;
		healthCount = 6;
		health = new String[healthload];
		
		while(turn != "Q"&&healthCount > 0){
			System.out.println("Your turn! Hit Enter to start! ");
			turn = kb.nextLine();
			damage = random.nextInt(2) + 1;
			amount = random.nextInt(6) + 1;
			System.out.println(takeDamage(damage, amount));
			printClip();
		}
		System.out.println("You died! Better luck next time!");
	}
	
	public static String takeDamage(int dmg, int amt)
	{
		if(dmg == 1){
			healthCount -= amt;
			return "Taking " + amt + " damage!";
		}
		else{
			if(healthCount + amt < healthload)
				healthCount += amt;
			else
				healthCount = healthload;
			return "Power UP " + amt + "!";
		}
	}
	
	public static void printClip()
	{
		String out = "Health:\t";
		for(int i = 0; i < healthload; i++){
			if(i < healthCount)
				health[i] = " @ ";
			else
				health[i] = "[]";
			out += health[i];
		}
		System.out.println(out);
	}
}