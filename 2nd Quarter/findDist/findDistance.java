import java.util.Scanner;

public class findDistance
{
   public static void main(String[] args) throws Exception
   {
      Scanner sc = new Scanner(System.in);
      int x0=0;
      int x1=0;
      int x2=0;
      int x3=0;
      int y0=0;
      int y1=0;
      int y2=0;
      int y3=0;
      double d1;
      double d2;
      double d3;

      //colecting input
      for(int i=0; i <= 3; i++){
		  int x=0;
		  int y=0;
		  if(i==0){System.out.println("\nThe house:");}
		  if(i==1){System.out.println("\nErrand 1:");}
		  if(i==2){System.out.println("\nErrand 2:");}
		  if(i==3){System.out.println("\nErrand 3:");}
		  System.out.print("Enter x coodinate: ");
		  x = sc.nextInt();
		  System.out.print("Enter y coodinate: ");
		  y = sc.nextInt();
		  if(i==0){
			  x0x;
			  y0=y;
		  }
		  if(i==1){
			  x1=x;
			  y1=y;
		  }
		  if(i==2){
			  x2=x;
			  y2=y;
		  }
		  if(i==3){
			  x3=x;
			  y3=y;
		  }
	  }

	  //math
	  d1 = math.sqrt(math.pow((x1-x0),2) + math.pow((y1-y0),2));
	  System.out.println(d1);
   }
}