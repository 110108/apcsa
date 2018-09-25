import java.util.Scanner;

public class modClock
{

	public static void main(String[] args)
	{
		int sHour;
		int pHour;
		int eHour;
		int sMin;
		int pMin;
		int eMin;
		final int HOURS_PER_DAY = 24;
		final int MINUTES_PER_HOUR = 60;
		Scanner sc = new Scanner(System.in);

		//gather info
		System.out.print("Please enter start hour: ");
		sHour = sc.nextInt();
		System.out.print("Please enter start minute: ");
		sMin = sc.nextInt();
		System.out.print("Please enter the number of hours that have passed: ");
		pHour = sc.nextInt();
		System.out.print("Please enter the number of minutes that have passed: ");
		pMin = sc.nextInt();

		//calculations
		sHour %= HOURS_PER_DAY;
		sMin %= MINUTES_PER_HOUR;
		pHour %= HOURS_PER_DAY;
		pHour += (pMin/MINUTES_PER_HOUR);
		pMin %= MINUTES_PER_HOUR;
		eHour = ((sHour + pHour) % HOURS_PER_DAY);
		eMin = ((sMin + pMin) % MINUTES_PER_HOUR);

		//final output
		System.out.println("\nThe final time is "+(eHour)+":"+(eMin));
	}
}

