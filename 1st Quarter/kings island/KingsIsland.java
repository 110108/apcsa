import java.util.Scanner;

//You are traveling to King's Island for the day.
//Everyone in the group has agreed to split the cost evenly.
//Write a program to determine the total cost of the trip and the cost per person.
//Assume that each ticket is $32.99


public class KingsIsland
{
	public static void main(String[] args)
	{
		//Declare variables for the number of people, parking cost, food cost, total cost, cost per person
		int ppl;
		double pkcst;
		double fcst;
		double total;
		double cpp;
		Scanner sc= new Scanner(System.in);

		//Prompt for and read in the number of people in the group
		System.out.print("Enter the number of people: ");
		ppl=sc.nextInt();

		//Prompt for and read in the cost of parking
		System.out.print("Enter cost of parking: ");
		pkcst=sc.nextDouble();

		//Prompt for and read in the amount spent on food
		System.out.print("Enter amount spent on food: ");
		fcst=sc.nextDouble();

		//Calculate the total expenses
		total=ppl*32.99;
		total+=(pkcst+fcst);

		//Calculate the average per person
		cpp=total/ppl;

		//Display results
		System.out.println();
		System.out.println("Total cost of trip: "+total);
		System.out.println("Cost per person: "+cpp);

	}
}