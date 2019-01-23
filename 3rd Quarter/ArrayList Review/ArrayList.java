import java.util.Scanner;

public class ArrayList
{
   public static void main(String[] args) throws Exception
   {
      Scanner sc = new Scanner(System.in);
      ArrayList wl1;
      ArrayList wl2;

      while(true){
		  System.out.print("Enter a word ('XXX' to quit): ");
		  String str = sc.nextLine();
		  if(str.contains("xxx")){
			  break;
		  }
		  wl1.add(str);
	  }
	  System.out.print(wl1);
   }
}

/*
Sample out
Enter the first wordlist:
Enter a word ('XXX' to quit): the
Enter a word ('XXX' to quit): quick
Enter a word ('XXX' to quit): brown
Enter a word ('XXX' to quit): fox
Enter a word ('XXX' to quit): jumped
Enter a word ('XXX' to quit): xxx
Enter the second wordlist:
Enter a word ('XXX' to quit): over
Enter a word ('XXX' to quit): the
Enter a word ('XXX' to quit): lazy
Enter a word ('XXX' to quit): dog
Enter a word ('XXX' to quit): xxx
Wordlist 1
----------
0: the
1: quick
2: brown
3: fox
4: jumped
Wordlist 2
----------
0: over
1: the
2: lazy
3: dog
List 1 merged with List 2
-------------------------
0: the
1: over
2: quick
3: the
4: brown
5: lazy
6: fox
7: dog
8: jumped
List 2 merged with List 1
-------------------------
0: over
1: the
2: the
3: quick
4: lazy
5: brown
6: dog
7: fox
8: jumped
*/
