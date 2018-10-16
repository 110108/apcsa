import java.util.Scanner;

public class template
{
   public static void main(String[] args) throws Exception
   {
      Scanner sc = new Scanner(System.in);
      String name;
      int len;
      char start;
      String center;
      char end;

      System.out.print("Enter your name: ");
      name = sc.nextLine();

      len = name.length();
      start = name.charAt(0);
      if(len % 2 = 0)
      {
		  center = name.charAt(name.length()/2);
	  }
	  else if(len % 2 = 1)
	  {
		  center = name;
	  }
      end = name.charAt(name.length());

	  System.out.println("Hello " + name + "!");
	  System.out.println("Your name is " + len + " letters long.");
	  System.out.println("Your name starts with a(n) " + start + ".");
	  if(center.length()>1)
	  {
	 	  System.out.println("The center of your name is between two letters.");
	  }
	  if(center.length()==1)
	  {
		  System.out.println("The letter " + center + " is at the center of your name.");
	  }
	  System.out.println("Your name ends with a(n) " + end + ".");
	  System.out.println("Goodbye " + name + "!");
   }
}
