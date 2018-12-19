import java.util.Scanner;

public class R6_5
{
   public static void main(String[] args) throws Exception
   {
      Scanner sc = new Scanner(System.in);
      int a;
      int b;
      int evenA = 0;
      int squaresA = 0;
      int oddAB = 0;
      int oddA = 0;
      String A;

      //collecting a
      System.out.print("Gimmie a positive integer: ");
      a = sc.nextInt();

      //for loop to get evenA
      for(int i = 0; i < a; i++){
		  if(i%2 != 0){continue;}
		  evenA += i;
	  }

	  //print evenA
	  System.out.println("\nThe sum of all even numbers between 2 and "+a+" = "+evenA);

	  //for loop to get squaresA
	  for(int i = 0; Math.pow(i,2) < a; i++){
		  squaresA += Math.pow(i, 2);
	  }

	  //print squaresA
	  System.out.println("\nThe sum of all squares between 1 and "+a+" = "+squaresA);

	  //collecting b
	  System.out.print("\nGimmie a positive integer larger than "+a+": ");
	  b = sc.nextInt();

	  //for loop to get oddAB
	  for(int i = a; i < b; i++){
		  if(i % 2 == 0){continue;}
		  oddAB += i;
	  }

	  //print oddAB
	  System.out.println("\nThe sum of all odd numbers between "+a+" and "+b+" = "+oddAB);

	  //for loop for oddA
	  A=Integer.toString(a);
	  for(int i = 0; i < A.length(); i++){
		  if(Character.getNumericValue(A.charAt(i)) % 2 ==0){continue;}
		  oddA += Character.getNumericValue(A.charAt(i));
	  }

	  //print oddA
	  System.out.println("\nThe sum of all odd digits of "+a+" = "+oddA+"\n");
   }
}
