/*
	A. Increase Channel - If the TV is on, it Goes to the Next Channel (Loops Through Channels 2 - 13)
	B. Decrease Channel - If the TV is on, it Goes to the Previous Channel (Loops Through Channels 2 - 13)
	C. Increase Volume (Turn On) - If the TV is on, it Increases the Volume by 1 (Loops Through Volumes 1 - 11).
	If the TV is off, it Turns on the TV and sets the Volume to 1
	D. Decrease Volume (Turn Off) - If the TV is on, it Decreases the Volume by 1. If the Volume Becomes 0, then
	the TV is Turned off.
	E. Display - If the TV is on, it Displays the Channel and Volume.
*/
import java.util.Scanner;
public class TVDemo{
	public static void main (String args[]){
		boolean keepLooping=true;
		TV tv=new TV();
		while(keepLooping){
			System.out.println("A.Increase Channel");
			System.out.println("B.Decrease Channel");
			System.out.println("C.Increase Volume (Turn On)");
			System.out.println("D.Decrease Volume (Turn Off)");
			System.out.println("E.Display");
			System.out.println("F.Quit");
			Scanner sc=new Scanner(System.in);
			String choice=sc.nextLine();
			if (choice.equalsIgnoreCase("A")){
				tv.increaseChannel();
			} else if (choice.equalsIgnoreCase("B")) {
				tv.decreaseChannel();
			} else if (choice.equalsIgnoreCase("C")) {
				tv.increaseVolume();
			} else if (choice.equalsIgnoreCase("D")){
				tv.decreaseVolume();
			} else if (choice.equalsIgnoreCase("E")){
				tv.display();
			} else if (choice.equalsIgnoreCase("F")){
				break;
			}
		}
	}
}
