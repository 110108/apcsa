/*
 * GuessWithFileInput.java
 *
 *   A program that plays simple word guessing game.  In this game the user provides a list of
 *   words to the program.  The program randomly selects one of the words to be guessed from
 *   this list.  The player then guesses letters in an attempt to figure out what the hidden
 *   word might be.  The number of guesses that the user takes are tracked and reported at the
 *   end of the game.
 *
 *   See the write-up for GuessWithFileInput for more details.
 *
 * @author ENTER YOUR NAME HERE
 *
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;


public class GuessWithFileInput {


	public static void main(String[] args) {
		// COMPLETE THE HELPER METHODS BELOW then fill in the main method
	}


	// Given a Scanner as input, returns a List<String> of strings read from the Scanner.
	// The method should read words from the Scanner until there are no more words in the file
	// (i.e. inScanner.hasNext() is false).  The list of strings should be returned to the calling program.
	public static ArrayList<String> getList(Scanner inScanner) {
		ArrayList<String> list = new ArrayList<String>();
		while(inScanner.hasNext()){
			list.add(inScanner.next());
		}
		return list;
	}

	// Sort ArrayList into a 2D Array. Takes the ArrayList<String> as parameter. Returns a
	// 2D Array with 3-4 character words in row 0, 5-6 character words in row 1, 7+ character
	// words in row 2, and ignores all words with less than 3 characters.
	public static String[][] makeTwoDimList(ArrayList<String> allWords){
	////Scanner sc = new Scanner(allWords);
		// Count the number of level #0 3-4 char words in allWords
		int l1;
		for(int i=0; i<=allWords.size(); i++)
		{
			allWords.get(i);
		}
		// Count the number of level #1 5-6 char words in allWords
		// Count the number of level #2 7+ char words in allWords

		// Declare your 2D array

		// Fill in the body
		ArrayList[][] twoDimList;

		return null;//Arrays.deepToString(twoDimList);
	}

	// Given two strings as input, compares the first string (guess) to the second
	// (solution) character by character.  If the two strings are not exactly the same,
	// return false.  Otherwise return true.
	public static boolean checkWord(String guess, String solution) {
		// Fill in the body
	}


	// Given a ArrayList<String> list of strings as input, randomly selects one of the strings
	// in the list and returns it to the calling program.
	public static String getRandomWord(ArrayList<String> inList) {
		// Fill in the body
	}


	// Given a Scanner as input, prompt the user to enter a character.  If the character
	// enters anything other than a single character provide an error message and ask
	// the user to input a single character.  Otherwise return the single character to
	// the calling program.
	public static char getCharacterGuess(Scanner inScanner) {
		// Fill in the body
	}

	// Given a character inChar and a ArrayList<Character> list of characters, check to see if the
	// character inChar is in the list.  If it is, return true.  Otherwise, return false.
	public static boolean checkInList(char inChar, ArrayList<Character> inList) {
		// Fill in the body
	}

	// Given a String, return a String that is the exact same length but consists of
	// nothing but '*' characters.  For example, given the String DOG as input, return
	// the string ***
	public static String starWord(String inWord) {
		// Fill in the body
	}

	// Given a character and a String, return the count of the number of times the
	// character occurs in that String.
	public static int checkChar(char guessChar, String guessWord) {
		// Fill in the body
	}

	// Given a character, a String containing a word, and a String containing a 'guess'
	// for that word, return a new String that is a modified version of the 'guess'
	// string where characters equal to the character inChar are uncovered.
	// For example, given the following call:
	//   modfiyGuess('G',"GEOLOGY", "**O*O*Y")
	// This functions should return the String "G*O*OGY".
	public static String modifyGuess(char inChar, String word, String currentGuess) {
		// Fill in the body
	}
}
