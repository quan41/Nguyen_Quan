import java.util.Random;

public class Exercise1
{
	static int player;
	static int computer;
	static String winner;
	public static void main(String[]args)
	{
		Random rand = new Random();
		player = rand.nextInt(7) + 1; 
		computer = rand.nextInt(7) + 1;
		diceRoll();
		System.out.println("You rolled a " + player);
		System.out.println("Computer rolled a " + computer);
		System.out.println("The winner is " + winner);
	}
	
	public static void diceRoll()
	{
		winner = " ";
		if (player > computer)
		{
			winner = "you";
		}
		
		if (player < computer)
		{
			winner = "computer";
		}
	}
}