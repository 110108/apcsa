import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class LoopProgrammingReview
{
	public static void main(String[] args)
	{
		int progNum = 1;
		Scanner in = new Scanner(System.in);
		{
			System.out.println("*** Program " + progNum + " ***");
			  //add or remove // at start of line


			String answer;

			do
			{
				System.out.print("Enter a string that does not contain the letter s: ");
				answer = in.nextLine();

				if ((answer.toLowerCase()).contains("s"))  //ADD
				{
					System.out.println("Error - string should not contain the letter s\n");
				}
			}while ((answer.toLowerCase()).contains("s")); //ADD

			System.out.println("Yay - a string with no letter s\n");
			progNum++;
		}



		{
			System.out.println("*** Program " + progNum + " ***");



			int num;

			do
			{
				System.out.print("Enter an int in the range [3,8]: "); //NOTE: When checking your program, be sure to check the boundary/edge cases - particulary the value 3 and 8
				num = in.nextInt();

				if (num < 3)	//ADD
				{
					System.out.println("Error - number is less than 3\n");
				}
				else if (num > 8)	//ADD
				{
					System.out.println("Error - number is greater than 8\n");
				}
			}while (num<3&&num>8);//ADD

			System.out.println("Yay - " + num + " is in the range [3,8]\n");

			progNum++;
		}


		{
			System.out.println("*** Program " + progNum + " ***");

			int num;				//current number entered by user
			int sum = 0;			//sum of the negative numbers entered
			int numNeg = 0; 	//number of negative numbers entered


			System.out.println("Please enter four negative numbers below.");
			System.out.println("The sum of the negative numbers will be calculated and displayed.");

			do
			{
				System.out.print("Enter int #" + (numNeg + 1)+ ": ");
				num = in.nextInt();

				if (num<0)	//ADD
				{
					sum = sum + num;
					numNeg++;
				}
				else
				{
					System.out.println("Error - number is not negative\n");
				}

			}while (numNeg<4);	//ADD

			System.out.println("The sum of the negative number is: " + sum + "\n");

			progNum++;
		}

		{
			System.out.println("*** Program " + progNum + " ***");


			String answer;
			String lastCharacter;

			do
			{
				System.out.print("Enter a string that has length of at least 5 and the last letter is an s: ");
				answer = in.nextLine();

				lastCharacter = answer.substring(answer.length()-1); //ADD code to find the last character (using substring) and store it in variable lastCharacter

				System.out.println("Last Char:"+lastCharacter);

				if (lastCharacter != "s" && answer.length()<5)	//ADD
				{
					System.out.println("String is too short and the last letter is not an s\n");
				}
				else if (answer.length()<5)	//ADD
				{
					System.out.println("String is too short\n");
				}
				else if(lastCharacter != "s")	//ADD
				{
					System.out.println("last letter is not an s\n");
				}

			}while (lastCharacter != "s" || answer.length()<5);		//ADD

			System.out.println("Yay - the length is " + answer.length() + " and last letter is an s\n");

			progNum++;

		}

		{
			System.out.println("*** Program " + progNum + " ***");
			/*Fill in the code to display the fibonacci sequence
			The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, etc...
			The next number is found by adding up the two numbers before it.
			The 2 is found by adding the two numbers before it (1+1)
			The 3 is found by adding the two numbers before it (1+2),
			And the 5 is (2+3) and so on!
			*/


			ArrayList<Integer> myArray = new ArrayList<Integer>();
			myArray.add(0);
			myArray.add(1);
			int stoppingPoint;
			// prompt for an integer to use as a stopping point
			System.out.print("Please enter an integer to serve as a stopping point");
			while(!in.hasNextInt())// scanner does not have next int
			{
				System.out.print("Not an integer number");
				in.nextLine(); // throw away everything currently in the scanner
				System.out.print("Please enter an integer to serve as a stopping point");// prompt for an integer to use as a stopping point
			}
			stoppingPoint = in.nextInt();

			while(myArray.get(myArray.size()-1) < stoppingPoint)
			{
				//add together the last two values of myArray add append the sum to the end of the list
				myArray.add((myArray.get(myArray.size()-1)+myArray.get(myArray.size()-2)));
			}
			System.out.print(myArray);

			progNum++;
		}

		{
			System.out.println("\n*** Program " + progNum + " ***");
			// Ask the user for several numbers or Q to quit. Then calculate the average of their numbers.


			int count = 0;
			int sum = 0;

			while(true) // repeat until the use types Q then break
			{
				System.out.print("\nPlease enter an integer or q to quit: ");// prompt for an integer or Q to quit.
				if(in.hasNextInt()) // if the scanner has next int
				{
					sum =+ in.nextInt();
					count ++;
				}
				else if(in.nextLine().contains("q") || in.nextLine().contains("Q"))
				{
					break;
				}
				else
				{
					System.out.print("Not an integer number");
					//in.nextLine(); // throw away everything currently in the scanner
				}
			}
			if(count > 0)
			{
				System.out.println("Average: "+sum/count);
			}
		}
	}
}