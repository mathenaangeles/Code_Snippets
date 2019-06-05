import java.util.Scanner;
import java.util.Random;
public class Zombie{
	int hitpoints;
	public Zombie(){
		hitpoints=100;
	}
	public void visualize(){
		int zom=hitpoints/10;
		String zom1=" ";
		for (int i=0;i<zom;i++){
			zom1=zom1+"*";
		}
		int zdash=10-zom;
		for (int i=0; i<zdash;i++){
			zom1=zom1+"-";
		}
		System.out.println("Zombie ["+ zom1+"] "+hitpoints+" HP");
	}
	public void shootMe(){
		hitpoints=hitpoints-10;
	}
	public int regenerate(){
		Random r= new Random();
		int heal=r.nextInt(20)+1;
		hitpoints=hitpoints+heal;
		return heal;
		
	}
	public boolean grenadeMe(){
		Random r= new Random();
		int chance=r.nextInt(100)+1;
		if (chance<=20){
			return false;
		} else{
			return true;
		}
	}
	public boolean decapitate(){
		Random r= new Random();
		int chance=r.nextInt(100)+1;
		if (chance<=50){
			return false;
		} else {
			return true;
		}
	}
}