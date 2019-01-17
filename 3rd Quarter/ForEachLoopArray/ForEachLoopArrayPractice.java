// Below each comment, add the code indicated.  I already have code to display a description of each item in the output.

public class ForEachLoopArrayPractice
{
	public static void main(String[] args)
	{
		int sum = 0;
		int five_ten = 0;
		int total = 0;

		boolean found = false;

		// Declare and initialize array variable "intArray" to hold the values: 5,3,12,9,7
		int[] intArray = {5,3,12,9,7};

		// Display intArray using a for-each loop
		System.out.println("\n*******************************************************");
		System.out.println("intArray displayed using for each loop loop\n");
		for(int i:intArray){
			System.out.print(i+" ");
		}

		// Sum of the elements of intArray is calculated and displayed using a for-each loop
		System.out.println("\n*******************************************************");
		System.out.println("Sum of the elements of intArray\n");
		for(int i:intArray){sum+=i;}
		System.out.println(sum);


		// Count the number of elements in intArray that are between 5 and 10, inclusive.  Display the result: ___ elements are between 5 and 10
		System.out.println("\n***********************************************************");
		System.out.println("Counting number of items between 5 and 10.\n");
		for(int i:intArray){
			if(5<=i&&i<=10){
				five_ten+=1;
			}
		}
		System.out.println(five_ten+" elements are between 5 and 10");



		// Search intArrayList for the number 7 using a for-each loop. Display "7 was found" or "7 was not found"
		System.out.println("\n***********************************************************");
		System.out.println("Search intArray for the number 7 using a for-each loop.\n");
		for(int i:intArray){
			if(i==7){found=true;}
		}
		if(found=true){
			System.out.println("7 was found");
		}
		else{
			System.out.println("7 was not found");
		}



		// Declare and initialize array variable "words" to hold the values: "keys", "camera", "vacation", "magic", "minivan"
		String[] words = {"keys", "camera", "vacation", "magic", "minivan"};



		// Display words using a for-each loop
		System.out.println("\n*******************************************************");
		System.out.println("words displayed using for each loop loop\n");
		for(String i:words){
			System.out.println(i+" ");
		}



		// Length of each element of words is displayed
		System.out.println("\n*******************************************************");
		System.out.println("Length of each element of words is: \n");
		for(String i:words){
			System.out.println(i+"="+i.length());
		}




		/* Count and display each element in words that start with "m".  Display the result.
		   For example, the output might be:
		   magic
		   minivan
		   2 words start with m
		*/
		System.out.println("\n***********************************************************");
		System.out.println("Words that start with m.\n");
		for(String i:words){
			if(i.startsWith("M")|| i.startsWith("m")){
				total++;
				System.out.println(i);
			}
		}
		System.out.println(total+" words start with m\n");


	}
}