import java.util.*;
import java.io.*;

public class Arrays2D
{
   public static void main(String[] args) throws Exception
   {
      Scanner sc = new Scanner(System.in);
      Scanner in = new Scanner(new File("C:\\Users\\Tech\\Documents\\GitHub\\apcsa\\3rd Quarter\\2d arrays\\testData.txt.txt"));
      int rows=0;
      int cols=0;

      if(in.hasNextInt()){cols=in.nextInt();}
      else
      {
		  System.out.println("Not a valid entry for columns");
		  System.exit(0);
	  }
      if(in.hasNextInt()){rows=in.nextInt();}
      else
      {
		  System.out.println("Not a valid entry for rows");
		  System.exit(0);
	  }
      int[][] data = new int[rows][cols];

      for(int i = 0; i<rows; i++)
      {
		  int count=0;
		  for(int j = 0; j<cols; j++)
		  {
			  if(in.hasNextInt())
			  {
				  int temp=in.nextInt();
				  count+=temp;
				  data[i][j]=temp;
			  }
			  else
			  {
				  System.out.println("oops thats not an integer");
				  System.exit(0);
			  }
		  }
		  System.out.println("Average of row " + (i + 1) + ": " + (count / cols));
	  }

	  //System.out.println(Arrays.deepToString(data));
   }
}