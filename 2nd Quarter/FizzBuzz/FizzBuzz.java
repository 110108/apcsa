import java.util.Scanner;

public class FizzBuzz
{
   public static void main(String[] args) throws Exception
   {
      Scanner sc = new Scanner(System.in);
      int num=0;
      String out = "";

      System.out.print("Gimmie a positive integer: ");
      while(!sc.hasNextInt())
      {
		  System.out.println("Not a positive integer");
		  System.out.print("Gimmie a positive integer: ");
		  sc.nextLine();
	  }
	  num=sc.nextInt();

      for(int i = 1; i<=num;i++){
		  out = "";
		  if(i%3==0){out+="Fizz";}
		  if(i%4==0){out+="Buzz";}
		  if(i%3!=0&&i%4!=0){out = String.valueOf(i);}
		  System.out.println(out);
	  }
   }
}
