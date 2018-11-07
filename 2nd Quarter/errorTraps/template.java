import java.util.Scanner;

public class errorTraps
{
   public static void main(String[] args) throws Exception
   {
      Scanner sc = new Scanner(System.in);
      String str;
      char chr;

      System.out.print("Please enter a character from the english alphabet: ");
      str = sc.next();

      try{
		  chr = str;
	  }

	  catch(Exception e){
		  System.out.println("Exception");
	  }


//prompts the user to provide a single character from the alphabet.
//Print Vowel or Consonant, depending on the user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
   }
}
