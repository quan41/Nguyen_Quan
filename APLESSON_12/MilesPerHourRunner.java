import java.util.Scanner;
public class MilesPerHourRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a distance");
		int dist= kb.nextInt();
			System.out.println("Enter the amount of hours");
		int hour= kb.nextInt();
			System.out.println("Enter the amount of minutes");
		int min= kb.nextInt();
		
		MilesPerHour object = new MilesPerHour(dist,hour,min);
		
		System.out.println(object.getDistance() + " miles in " + object.getHours() + " hours and " + object.getMinutes() + " minutes = " + object.getMPH()+ " mph");
		
		System.out.println("Enter a distance");
		dist= kb.nextInt();
		System.out.println("Enter the amount of hours");
		hour= kb.nextInt();
		System.out.println("Enter the amount of minutes");
		min= kb.nextInt();
		object.setValues(dist,hour,min);
		System.out.println(object.getDistance() + " miles in " + object.getHours() + " hours and " + object.getMinutes() + " minutes = " + object.getMPH()+ " mph");
	}
}

