import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class ListReview
{
   public static void main(String[] args) throws Exception
   {
      Scanner sc = new Scanner(System.in);
      ArrayList<String> wl1 = new ArrayList<String>();
      //ArrayList wl2 = new ArrayList();

      while(true){
		  System.out.print("Enter a word ('XXX' to quit): ");
		  String str = sc.nextLine();
		  if(str.contains("xxx")||str.contains("Xxx")||str.contains("xXx")||str.contains("XXx")||str.contains("xxX")||str.contains("XxX")||str.contains("xXX")||str.contains("XXX")){
			  break;
		  }
		  wl1.add(str);
	  }
	  System.out.print(Arrays.toString(wl1.toArray()));
   }
/*
   private static ArrayList getList(Scanner inScanner)
   {
	   //
   }

   private static void displayList(ArrayList myList)
   {
	   //
   }

   private static ArrayList mergeLists(ArrayList list1, ArrayList list2)
   {
	   //
	   return merged;
   }
   */
}

/*
getList() should use the following method header: private static ArrayList<String> getList(Scanner inScanner)
displayList() should use the following method header: private static void displayList(ArrayList<String> myList)
mergeList() should use the following method header: private static ArrayList mergeLists(ArrayList list1, ArrayList list2) It should take two lists of Strings as input.
*******************************************************************************************************
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
