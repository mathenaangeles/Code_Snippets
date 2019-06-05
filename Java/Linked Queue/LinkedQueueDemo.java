// Simulated a queue of people.
import java.util.Scanner;
public class LinkedQueueDemo{
	public static void main(String args[]){
		Scanner sc= new Scanner (System.in);
		LinkedQueue l=new LinkedQueue();
		while (true){
			System.out.println("A. Enqueue Person");
			System.out.println("B. Print the Person in Front");
			System.out.println("C. Dequeue Person");
			System.out.println("D. Print the Queue");
			System.out.println("E. Exit");
			System.out.print("Enter Option:");
			String option="";
			option=sc.nextLine();
			if (option.equalsIgnoreCase("A")){
				System.out.print("Enter Name:");
				String i="";
				i=sc.nextLine();
				l.enqueue(i);
				System.out.println(i+" has been added to the queue.");
			} else if (option.equalsIgnoreCase("B")){
				System.out.println(l.peek()+" is in front of the queue.");
			} else if (option.equalsIgnoreCase("C")){
				System.out.println(l.dequeue()+" has been removed from the queue.");
			} else if (option.equalsIgnoreCase("D")){
				System.out.println(l.visualizeQueue()+" people are in the queue.");
			} else if (option.equalsIgnoreCase("E")){
				break;
			}
		}
	}
}

