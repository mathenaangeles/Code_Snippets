import java.util.Scanner;
import java.util.Random;
public class Player{
	String name;
	int hitpoints;
	int bullets;
	int grenades;
	int regularPotions;
	int superiorPotions;
	boolean alive;
	public Player(){
		hitpoints=100;
		bullets=6;
		grenades=10;
		regularPotions=10;
		superiorPotions=3;
		alive=true;
		Scanner sc= new Scanner (System.in);
		System.out.print("Enter your username:");
		name=sc.nextLine();
	}
	public boolean shootZombie(){
		if (bullets>0){
			bullets=bullets-1;
			return true;
		} else{
			return false;
		}
	}
	public boolean grenadeZombie(){
		if (grenades>0){
			grenades=grenades-1;
			return true;
		} else{
			return false;
		}
	}
	public boolean useRegularPotion(){
		if (regularPotions>0){
			regularPotions=regularPotions-1;
			hitpoints=hitpoints+10;
			if (hitpoints>100){
				hitpoints=100;
			}
			return true;
		} else {
			return false;
		}
	}
	public boolean useSuperiorPotion(){
		if (superiorPotions>0){
			superiorPotions=superiorPotions-1;
			hitpoints=hitpoints+20;
			if (hitpoints>100){
				hitpoints=100;
			}
			return true;
		} else {
			return false;
		}
	}
	public void reload(){
		bullets=6;
	}
	public void zombified(){
		alive=false;
	}

	public boolean isStillAlive(){
		if (hitpoints>0){
			return true;
		} else {
			return false;
		}
	}

	public void visualize(){
		int pla=hitpoints/10;
		String pla1=" ";
		for (int i=0; i<pla;i++){
			pla1=pla1+"*";
		}
		int pdash=10-pla;
		for (int i=0; i<pdash;i++){
			pla1=pla1+"-";
		}
		String status;
		if (alive){
			status="Alive";
		} else{
			status="Dead";
		}
		System.out.println("["+pla1+"] "+name+" HP:"+hitpoints+" Bullets:"+bullets+"/6"+" Grenades:"+grenades+" RP:"+regularPotions+" SP:"+superiorPotions+" "+status);
	}
}