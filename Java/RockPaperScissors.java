// Outputs the winner of a round of rock, paper, scissors.
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {
	public static void main (String args[]){
		Scanner sc=new Scanner(System.in);
		String playerOne;
		String playerTwo;
		System.out.print("Enter Player 1:");
		playerOne=sc.nextLine();
		System.out.print("Enter Player 2:");
		playerTwo=sc.nextLine();
		if (playerOne.equalsIgnoreCase("scissors")){
			if (playerTwo.equalsIgnoreCase("paper")){
				System.out.println("Player 1 Wins");
			} else if (playerTwo.equalsIgnoreCase("rock")){
				System.out.println("Player 2 Wins");
			} else {
				System.out.println("It's a draw.");
			}
		} else if (playerOne.equalsIgnoreCase("paper")){
			if (playerTwo.equalsIgnoreCase("rock")){
				System.out.println("Player 1 Wins");
			} else if (playerTwo.equalsIgnoreCase("scissors")){
				System.out.println("Player 2 Wins");
			} else {
				System.out.println("It's a draw.");
			}
		} else if (playerOne.equalsIgnoreCase("rock")){
			if (playerTwo.equalsIgnoreCase("scissors")){
				System.out.println("Player 1 Wins");
			} else if (playerTwo.equalsIgnoreCase("paper")){
				System.out.println("Player 2 Wins");
			} else {
				System.out.println("It's a draw.");
			}
		}
	}
}