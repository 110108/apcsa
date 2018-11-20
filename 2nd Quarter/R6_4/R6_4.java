import java.util.Scanner;

public class R6_4
{
   public static void main(String[] args) throws Exception
   {
      Scanner sc = new Scanner(System.in);
      int x;
      int sqr=0;
      int tns=0;
      int p2=0;

      System.out.print("Gimmie a positive integer: ");
      x = sc.nextInt();

      System.out.print("Squares less than "+x+" =");
      while(Math.pow(sqr,2)<x)
      {
		  System.out.print(" "+(int)(Math.pow(sqr, 2))+" ");
		  sqr+=1;
	  }

	  System.out.print("Tens less than "+x+" =");
	  while(tns<x)
	  {

	  }

	  while(p2<x)
	  	  {
	  		  /*morecode*/
	  }
   }
}
