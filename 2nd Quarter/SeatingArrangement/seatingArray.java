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
import java.util.Arrays;

public class seatingArray
{
   public static void main(String[] args) throws Exception
   {
      Scanner sc = new Scanner(System.in);
      int seats;
      int seat = -1;
      int firstSeat = -1;
      int nextSeat = -1;
      boolean[] seating;

      //defining the array
      System.out.print("please enter the number of seats: ");
      while(!sc.hasNextInt()){
        System.out.print("please enter a positive integer, that is greater than one: ");
        sc.nextLine();
      }
      seats = sc.nextInt();
      seating = new boolean[seats];

      //filling array with false just incase
      for(int i = 0; i < seating.length; i++){
        seating[i] = false;
      }
      //System.out.println(seating.length);

      int count = 0;
      do{
        if(firstSeat==-1){
			if(seating.length > 1){
				seat=firstSeat=((seating.length)/2);
			}
			else{
				seat=0;
			}
          seating[seat] = true;
          continue;
        }
        count++;
        for(int i = 0; i < seating.length; i++){
          if(seating[i] == true){firstSeat = i;}
          if((seating[i]==true)&&(firstSeat != -1)){nextSeat = i;}
        }
        //System.out.println();
        //System.out.println(seating.toString() + " " + count);
      }while((!seating[seating.length-1] == true)&&(count < (seating.length * 2)));
      //System.out.println(seat);
      //System.out.println(firstSeat);
      //System.out.println((seating.length+1)/2);
      System.out.println(Arrays.toString(seating));
    }
  }