import java.util.Scanner;

public class cedarPointCalc
{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		final int FALL_TICKET_PRICE = 42;
		final int SPRING_TICKET_PRICE = 39;
		final int FOOD_PER_PERSON = 25;
		final int DISCOUNT_NUM = 15;
		final int CHAPERONE_AMT = 4;
		final int CHARTER_NUM = 55;
		final int BUS_NUM = 44;

		final double BUS_PRICE = 1300.42;
		final double CHARTER_PRICE = 1738.92;

		int students;
		int studentTicket;
		int chaperones;
		int studentDiscount;
		int busNum;
		int charterNum;

		double studentFood;
		double studentBus;
		double studentCharter;
		double tripFall;
		double tripSpring;
		double totalFallBus;
		double totalFallCharter;
		double totalSpringBus;
		double totalSpringCharter;

		//prompt user for number of students
	    System.out.print("How many students would you like take: ");
	    students = sc.nextInt();

	    //calculate vars
	    chaperones = students / CHAPERONE_AMT;
	    studentDiscount = students / DISCOUNT_NUM;
	    tripFall = (students + chaperones - studentDiscount) * FALL_TICKET_PRICE;
	    tripSpring = (students + chaperones - studentDiscount) * SPRING_TICKET_PRICE;
	    busNum = (students + chaperones) / BUS_NUM + 1;
	    charterNum = (students + chaperones) / CHARTER_NUM + 1;
	    studentBus = busNum * BUS_PRICE;
	    studentCharter = charterNum * CHARTER_PRICE;
	    studentFood = (students + chaperones) * FOOD_PER_PERSON;

	    //calculate totals
	    totalFallBus = tripFall + studentBus + studentFood;
	    totalFallCharter = tripFall + studentCharter + studentFood;
		totalSpringBus = tripSpring + studentBus + studentFood;
		totalSpringCharter = tripSpring + studentCharter + studentFood;

		//display trip cost
		System.out.printf("\n Teacher Chaperones needed:    %8d\n", chaperones);
		System.out.printf("\n Food Allowance Cost:             %8.2f\n", studentFood);
		System.out.printf("\n School Bus Cost:                 %8.2f\n", studentBus);
		System.out.printf("\n Charter Bus Cost:                %8.2f\n", studentCharter);
		System.out.printf("\n Fall Price Admission total:      %8.2f\n", tripFall);
		System.out.printf("\n Spring Price Admission total:    %8.2f\n", tripSpring);
		System.out.printf("\n Total Cost Fall School Bus:      %8.2f\n", totalFallBus);
		System.out.printf("\n Total Cost Fall Charter Bus:     %8.2f\n", totalFallCharter);
		System.out.printf("\n Total Cost Spring School Bus:    %8.2f\n", totalSpringBus);
        System.out.printf("\n Total Cost Charter Bus:          %8.2f\n\n", totalSpringCharter);
	}
}

