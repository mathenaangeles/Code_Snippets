/*
	A. Add Song - Enqueues a Song by Asking for its Corresponding Title, Band, and Duration
	B. Play Song - Displays the Song Currently Playing and Decreases its Duration by 1 Minute (Dequeues the Song When the Duration Becomes 0)
	C. Next Song - Dequeues the Current Song and Plays the Next Song
	D. Show Playlist - Displays the Playlist and Total Song Duration
*/
import java.util.Scanner;
public class Playlist{
	public static void main(String args[]){
		Scanner sc= new Scanner (System.in);
		LinkedQueue l=new LinkedQueue();
		while (true){
			System.out.println("A. Add Song");
			System.out.println("B. Play Song");
			System.out.println("C. Next Song");
			System.out.println("D. Show Playlist");
			System.out.println("E. Exit");
			System.out.print("Enter Option:");
			String option="";
			option=sc.nextLine();
			if (option.equalsIgnoreCase("A")){
				Song s=new Song();
				System.out.print("Enter Band:");
				String band=sc.nextLine();
				s.band=band;
				System.out.print("Enter Title:");
				String title=sc.nextLine();
				s.title=title;
				System.out.print("Enter Duration:");
				int duration=Integer.parseInt(sc.nextLine());
				s.duration=duration;
				l.enqueue(s);
			} else if (option.equalsIgnoreCase("B")){
				if (l.peek()!= null){
					Song s= l.peek();
					System.out.println("Currently Playing: "+s.title+"-"+s.band+"("+s.duration+":00)");
					s.duration=s.duration-1;
					if (s.duration<=0){
						System.out.println("Song Ends");
						l.dequeue();
					}
				}
			} else if (option.equalsIgnoreCase("C")){
				l.dequeue();
				if (l.peek()!=null){
					Song s= l.peek();
					System.out.println("Currently Playing: "+s.title+"-"+s.band+"("+s.duration+":00)");
				}
			} else if (option.equalsIgnoreCase("D")){
				l.visualizeQueue();
			} else if (option.equalsIgnoreCase("E")){
				break;
			}
		}
	}
}
