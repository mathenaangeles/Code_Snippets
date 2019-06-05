// Replaces all occurances of a certain charcater or substring with an underscore.
import java.util.Scanner;
public class  Redacted{
	public static void main (String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a character or substring:");
		String c=sc.nextLine();
		System.out.print("Enter a word:");
		String word=sc.nextLine();
		String word2=word.replaceAll(c,"_");
		System.out.println(word2);
	}
}