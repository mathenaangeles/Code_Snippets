// Returns the zodiac sign of a person born at a certain month and day.
import java.util.Scanner;
import java.util.Random;
public class Zodiac {
	public static void main (String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter month:");
		String month=sc.nextLine();
		System.out.print("Enter day:");
		int day=Integer.parseInt(sc.nextLine());
		if (month.equalsIgnoreCase("January")){
			if (day<=19){
				System.out.println("Capricorn");
			} else{
				System.out.println("Aquarius");
			}
		} else if (month.equalsIgnoreCase("February")){
			if (day<=18){
				System.out.println("Aquarius");
			} else{
				System.out.println("Pisces");
			}
		} else if (month.equalsIgnoreCase("March")){
			if (day<=20){
				System.out.println("Pisces");
			} else{
				System.out.println("Aries");
			}
		} else if (month.equalsIgnoreCase("April")){
			if (day<=19){
				System.out.println("Aries");
			} else{
				System.out.println("Taurus");
			}
		} else if (month.equalsIgnoreCase("May")){
			if (day<=20){
				System.out.println("Taurus");
			} else{
				System.out.println("Gemini");
			}
		} else if (month.equalsIgnoreCase("June")){
			if (day<=20){
				System.out.println("Gemini");
			} else{
				System.out.println("Cancer");
			}
		} else if (month.equalsIgnoreCase("July")){
			if (day<=22){
				System.out.println("Cancer");
			} else{
				System.out.println("Leo");
			}
		} else if (month.equalsIgnoreCase("August")){
			if (day<=22){
				System.out.println("Leo");
			} else{
				System.out.println("Virgo");
			}
		} else if (month.equalsIgnoreCase("September")){
			if (day<=22){
				System.out.println("Virgo");
			} else{
				System.out.println("Libra");
			}
		} else if (month.equalsIgnoreCase("October")){
			if (day<=22){
				System.out.println("Libra");
			} else{
				System.out.println("Scorpio");
			}
		} else if (month.equalsIgnoreCase("November")){
			if (day<=21){
				System.out.println("Scorpio");
			} else{
				System.out.println("Sagittarius");
			}
		} else if (month.equalsIgnoreCase("December")){
			if (day<=21){
				System.out.println("Sagittarius");
			} else{
				System.out.println("Capricorn");
			}
		} 
	}
}
