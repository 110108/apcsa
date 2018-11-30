/*
consider the situation where 10 seats are arranged in one row and are empty.

__ __ __ __ __ __ __ __ __ __

The first visitor will occupy a middle position:

__ __ __ __ __  X  __ __ __ __

The left region has five empty seats and the right region has four. The next visitor will be in the middle of the empty region at the left.

__ __  X  __ __  X  __ __ __ __

The right-most region has four empty seats, so the next visitor will go to the right-most region.

__ __  X  __ __  X  __ __  X  __

This will continue until all seats are filled.
use first distanced seat
*/
import java.util.Scanner;
import java.util.Random;

public class seatingArray
{
   public static void main(String[] args) throws Exception
   {
      Scanner sc = new Scanner(System.in);
      int seats;
      Boolean[] seating;

      System.out.print("please enter the number of seats: ");
      while(!sc.hasNextInt()){
		  System.out.print("please enter a positive integer, that is greater than one: ");
		  sc.nextLine();
	  }
	  seats = sc.nextInt();

	  seating = new Boolean[seats];
	  System.out.println(seating.length);

	  for(int i = 0; i < seating.length; i++){
		  //
	  }
   }
}
