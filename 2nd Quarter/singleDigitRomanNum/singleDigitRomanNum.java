import java.util.Scanner;

public class singleDigitRomanNum
{
   public static void main(String[] args) throws Exception
   {
      Scanner sc = new Scanner(System.in);
      int num;
      String numString;

      System.out.print("Enter a positive single digit integer: ");
      num = sc.nextInt();

      switch (num) {
		  case 1:  numString = "I";
		  break;
		  case 2:  numString = "II";
		  break;
		  case 3:  numString = "III";
		  break;
		  case 4:  numString = "IV";
		  break;
		  case 5:  numString = "V";
		  break;
		  case 6:  numString = "VI";
		  break;
		  case 7:  numString = "VII";
		  break;
		  case 8:  numString = "VIII";
		  break;
		  case 9:  numString = "IX";
		  break;
		  case 10: numString = "X";
		  break;
		  default: numString = "That is NOT a positive single digit integer";
		  break;
	  }
	  if(numString.length()>4){System.out.println(numString);}
	  else{System.out.println("Roman Numeral "+numString+"\n");}
   }
}
