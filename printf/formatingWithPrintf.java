import java.util.Scanner;

public class formatingWithPrintf
{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		final int NUM_OF_ITEMS = 15;
		final double SUB_TOTAL = 142.18;
		final double TAX = 5.66;
		final double TOTAL = 147.84;
		final int GAS_POINTS = 100;
		System.out.printf("Number of items purchased:  %8d", NUM_OF_ITEMS);
		System.out.println("");
		System.out.printf("                 Subtotal:  %8.2f", SUB_TOTAL);
		System.out.println("");
		System.out.printf("                      Tax:  %8.2f", TAX);
		System.out.println("\n                              ------");
		System.out.printf("                    Total:  %8.2f\n", TOTAL);
		System.out.printf("               Gas Points:  %8d\n", GAS_POINTS);
	}
}

