import java.util.Scanner;

public class R6_4
{
   public static void main(String[] args) throws Exception
   {
      Scanner sc = new Scanner(System.in);
      int x;
      int sqr=0;
      int tns=0;
      int p1=0;
      int p2=0;

      System.out.print("Gimmie a positive integer: ");
      x = sc.nextInt();

      System.out.print("\nSquares less than "+x+" =");
      while(Math.pow(sqr,2)<x)
      {
		  System.out.print(" "+(int)(Math.pow(sqr, 2))+" ");
		  sqr+=1;
	  }

	  System.out.print("\nTens less than "+x+" =");
	  while(tns<x)
	  {
		  System.out.print(" "+(tns)+" ");
		  tns+=10;
	  }

	  System.out.print("\nPowers of two less than "+x+" =");
	  do
	  {
		  p2=(int)Math.pow(2,p1);
		  p1++;
		  System.out.print(" "+p2+" ");
		  if(p2>=x){break;}
	  }while(p2<x);
	  System.out.println("");
   }
}
