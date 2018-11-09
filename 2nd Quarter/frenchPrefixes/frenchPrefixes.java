import java.util.Scanner;

public class frenchPrefixes
{
   public static void main(String[] args) throws Exception
   {
      Scanner sc = new Scanner(System.in);
      String prefix;
      boolean print = false;
      String name;
      char first;
      char last;
      String out;

      System.out.print("Please enter the name of the country in french without prefix: ");
      name=sc.next();
      first=name.charAt(0);
      last=name.charAt((name.length())-1);

      if(first==65||first==69||first==73||first==79||first==85||first==97||first==101||first==105||first==111||first==117){
		  prefix = ("l' ");
		  print = true;
	  }

	  else if(name=="estas-unis"||name=="pays-bas"){
		  prefix = ("les ");
		  print = true;
	  }

	  else if(last==101){
		  prefix = ("la ");
		  print = true;
	  }

	  else if(name=="cambodge"||name=="mexique"||name=="Mozambique"||name=="Zaire"||name=="Zimbabwe"){
		  prefix = ("le ");
		  print = true;
	  }
	  else{
		  prefix = ("le ");
		  print = true;
	  }

	  if(print==true){
		  System.out.println(prefix + name);
	  }

	  else{
		  System.out.print("Error: invalid string!");
	  }
  }
}