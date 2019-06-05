//Prints all the prime numbers between 2 and some number, x, and computes for their sum.
import java.util.Scanner;
public class PrimeSum{
	public static void main (String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n:");
		int x=Integer.parseInt(sc.nextLine());
		int counter=0;
		int sum=0;
		for (int i=2;i<x;i++){
			boolean isPrime=true;
			for (int j=2;j<i/2;j++){
				if (i%j==0){
					isPrime=false;
					break;
				}
			}
			if (isPrime){
				System.out.println(i);
				counter++;
				sum=sum+i;
			}
		}
		System.out.println("There are "+counter+" primes between 2 and "+x+" and their sum is "+sum+".");
	}
}