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
			  x=x0;
			  y=y0;
		  }
		  if(i==1){
			  x=x1;
			  y=y1;
		  }
		  if(i==2){
			  x=x2;
			  y=y2;
		  }
		  if(i==3){
			  x=x3;
			  y=y3;
		  }
	  }
	  //
   }
}
