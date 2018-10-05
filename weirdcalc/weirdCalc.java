import java.util.Scanner;

public class weirdCalc
{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int first;
		int second;
		int sum;
		int difference;
		int product;
		int distance;
		int maximum;
		int minimum;
		double average;

		//get the nums
		System.out.print("Enter an Integer: ");
		first = sc.nextInt();
		System.out.print("Enter another Integer: ");
		second = sc.nextInt();

		//math
		sum = first + second;
		difference = first - second;
		product = first * second;
		average = sum / 2.0;
		distance = Math.abs(difference);
		maximum = Math.max(first,second);
		minimum = Math.min(first,second);

		//printing
		System.out.printf("\nSum:        %8d\n", sum);
		System.out.printf("Difference: %8d\n", difference);
		System.out.printf("Product:    %8d\n", product);
		System.out.printf("Average:       %8.2f\n", average);
		System.out.printf("Distance:   %8d\n", distance);
		System.out.printf("Maximum:    %8d\n", maximum);
		System.out.printf("Minimum:    %8d\n\n", minimum);
	}
}

