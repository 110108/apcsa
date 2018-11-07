import java.util.Scanner;

public class errorTraps
{
   public static void main(String[] args) throws Exception
   {
      Scanner sc = new Scanner(System.in);
      String str;
      char chr = 0;
      Boolean vowel = false;

      System.out.print("Please enter a character from the english alphabet: ");
      str = sc.next();
      if(str.length()==1){
		  chr = str.charAt(0);
	  }

	  if(chr>64&&chr<123){
		  if(chr==65||chr==97){vowel=true;}//a
		  else if(chr==69||chr==101){vowel=true;}//e
		  else if(chr==73||chr==105){vowel=true;}//i
		  else if(chr==79||chr==111){vowel=true;}//o
		  else if(chr==85||chr==117){vowel=true;}//u
	  }
	  else{
		  System.out.println("\nYou have entered an invalid string\n");
		  System.exit(0);
	  }
	  if(vowel==true){System.out.println("Vowel");}
	  else{System.out.println("Consonant");}
   }
}
