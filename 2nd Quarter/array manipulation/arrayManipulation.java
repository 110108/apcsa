/*Manipulate data stored in an array.

Part A: The initial array must store 10 random integers from 1 to 100.

Print “Initial random array = “ Print the array.

Print “Smallest value = “

Find and print the smallest value stored in the array

Print “Sum = “
Calculate and print the sum of all items in the array
Compute the sum of the array values, except for the smallest one.

Print “Sum without smallest = “

Print the sum of all items except for the smallest

Part C: Shift all elements to the right by one and move the last element into the first position. For example, 1  4  9  16  25 would be transformed into 25  1  4  9  16.

Print “Shifted array = “ Print the new array.

Part D: Replace all even elements with 0. For example, 56  23  19  14 would be transformed into 0  23  19  0.

Print “Even values replaced = “ Print the new array.

*/
import java.util.Scanner;
import java.util.Random;

public class arrayManipulation
{
   public static void main(String[] args) throws Exception
   {
      Scanner sc = new Scanner(System.in);
      int[] array = new int[10];
      Random rg = new Random();
      int sum=0;
      int smallestO=101;
      int temp;

      //fill array
      for(int i=0;i!=array.length;i++){
		  array[i] = (rg.nextInt(100)+1);
	  }

	  //print array
	  System.out.print("Initial random array = ");
	  for(int i=0;i!=array.length;i++){
	  		  System.out.print(array[i]+" ");
	  }

	  //find smallest
	  for(int i=0;i!=array.length;i++){
		  if(array[i] < smallestO){
			  smallestO = array[i];
		  }
	  }
	  System.out.println("\n\nSmallest = "+smallestO);

	  //add array
	  for(int i=0;i!=array.length;i++){
	  		  sum+=array[i];
	  }
	  System.out.println("\nSum = "+sum);

	  //add with out smallest
	  sum-=smallestO;
	  System.out.println("\nSum without smallest = "+sum);

	  //shift array
	  temp=array[9];
	  for(int i=9;i!=0;i--){
		  array[i]=array[i-1];
	  }
	  array[0]=temp;

	  //reprint new array
	  System.out.print("\nShifted array = ");
	  for(int i=0;i!=array.length;i++){
		  System.out.print(array[i]+" ");
	  }
	  System.out.println("");

	  //replace evens
	  for(int i=0;i!=array.length;i++){
		  if((array[i]) % 2 == 0){
			  array[i] = 0;
		  }
	  }

	  //reprint new array
	  System.out.print("\nEven values replaced = ");
	  for(int i=0;i!=array.length;i++){
	  	  		  System.out.print(array[i]+" ");
	  }
   }
}
