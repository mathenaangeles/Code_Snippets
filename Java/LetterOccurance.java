//Counts the number of times a given letter occurs in a word or phrase.
import java.util.Scanner;
import java.util.Random;
public class LetterOccurance {
	public static void main (String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter letter:");
		String c=sc.nextLine();
		char lowercase = c.toLowerCase().charAt(0);
		char uppercase = c.toUpperCase().charAt(0);
		System.out.print("Enter word:");
		String word=sc.nextLine();
		int length=word.length();
		int counter=0;
		for (int i=0;i<length;i++){
			if (word.charAt(i) == lowercase || word.charAt(i) == uppercase){
				counter++;
			}
		}
		System.out.println("The letter "+c+" appears "+counter+" times.");
	}
}