// Finds all the prime numbers less than the given number and prints how many there are.
import java.util.Scanner;
import java.util.Random;
public class FindPrimes {
	public static void main (String args[]){
		Scanner sc=new Scanner(System.in);
		int x=Integer.parseInt(sc.nextLine());
		int counter=0;
		for (int i=2;i<=x;i++){
			boolean isPrime=true;
			for (int j=2;j<i/2;j++){
				if (i%j==0){
					isPrime=false;
					break;
				}
			}
			if (isPrime){
				counter++;
				System.out.println(i);
			}
		}
		System.out.println("Number of Primes:"+counter);
	}	
}