// Checks wether or not a number is prime.
import java.util.Scanner;
import java.util.Random;
public class PrimeChecker{
	public static void main (String args[]){
		Scanner sc=new Scanner(System.in);
		int x=Integer.parseInt(sc.nextLine());
		boolean isPrime=true;
		for (int i=2; i<x/2; i++){
			if ((x%i)==0){
				isPrime=false;
				break;
			}
		}
		if (isPrime && x!=1){
			System.out.println(x+ " is Prime.");
		} else {
			System.out.println(x+ " is not Prime.");
		}
	}	
}
