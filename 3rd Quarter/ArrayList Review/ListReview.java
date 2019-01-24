import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class ListReview
{
   public static void main(String[] args) throws Exception
   {
      Scanner sc = new Scanner(System.in);
      ArrayList<String> wl1 = new ArrayList<String>();
      ArrayList<String> wl2 = new ArrayList<String>();
      ArrayList<String> merged=new ArrayList<String>();
      //Entering wordlists
      System.out.println("Enter the first word list: ");
      wl1=getList(sc);
      System.out.println("Enter the second word list: ");
      wl2=getList(sc);
      //printing word lists
      System.out.println("Word list 1");
      System.out.println("----------");
	  displayList(wl1);
	  System.out.println("Word list 2");
      System.out.println("----------");
	  displayList(wl2);
	  //merging and reprinting lists
	  System.out.println("Word list 1 merged with word list 2");
      System.out.println("-----------------------------------");
      //merge code
      System.out.println("Word list 2 merged with word list 1");
      System.out.println("-----------------------------------");
      //more merge code
   }

   private static ArrayList getList(Scanner in)
   {
	   ArrayList<String> temp = new ArrayList<String>();
	    while(true){
	   		  System.out.print("Enter a word ('XXX' to quit): ");
	   		  String str = in.nextLine();
	   		  if(str.contains("xxx")||str.contains("Xxx")||str.contains("xXx")||str.contains("XXx")||str.contains("xxX")||str.contains("XxX")||str.contains("xXX")||str.contains("XXX")){
	   			  break;
	   		  }
	   		  temp.add(str);
		  }
		  return temp;
   }

   private static void displayList(ArrayList<String> myList)
   {
	   for(String word:myList)
	   {
		   System.out.println(word);
	   }
   }

   private static ArrayList mergeLists(ArrayList<String> list1, ArrayList<String> list2)
   {
	   ArrayList<String> merge = new ArrayList<String>();
	   for(int i=0,j=0,k=0; i<=(list1.size() + list2.size()); i++)
	   {
		   if(i%2==0){j++;}
		   else{k++;}
		   if(list1.get(j)&&i%2==0){/**/}
	   }
	   return merge;
   }

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
