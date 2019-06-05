import java.util.Scanner;
import java.util.Random;
public class ZombieGame{
	public static void main (String args[]){
		Scanner sc= new Scanner (System.in);
		Random r= new Random();
		Zombie z=new Zombie();
		Player p=new Player();
		p.visualize();
		z.visualize();
		System.out.println("A. Shoot it");
		System.out.println("B. Throw a Grenade");
		System.out.println("C. Decapitate the Zombie");
		System.out.println("D. Heal with a Regular Potion");
		System.out.println("E. Heal with a Superior Potion");
		System.out.println("F. Reload");
		System.out.print("Enter your choice:");
		String choice=" ";
		choice=sc.nextLine();
		while (p.isStillAlive() && z.hitpoints>0){
			if (choice.equalsIgnoreCase("A")){
				if (p.shootZombie()){
					z.shootMe();
					if (z.hitpoints<=0){
						System.out.println("The zombie has 0 HP left. You win.");
						break;
					} else{
						System.out.println("You shoot the zombie. It has "+ z.hitpoints +" HP left.");
						p.hitpoints=p.hitpoints-z.regenerate();
						System.out.println("The zombie regenerates. It has " + z.hitpoints + " HP. You have "+p.hitpoints+ " HP left.");
						if (p.isStillAlive()){
							p.visualize();
							z.visualize();
							System.out.println("A. Shoot it");
							System.out.println("B. Throw a Grenade");
							System.out.println("C. Decapitate the Zombie");
							System.out.println("D. Heal with a Regular Potion");
							System.out.println("E. Heal with a Superior Potion");
							System.out.println("F. Reload");
							System.out.print("Enter your choice:");
							choice=sc.nextLine();
						} else {
							System.out.println("You died. Game over.");
							break;
						}
					}
				} else{
					System.out.println("You have 0 bullets left.");
					p.visualize();
					z.visualize();
					System.out.println("A. Shoot it");
					System.out.println("B. Throw a Grenade");
					System.out.println("C. Decapitate the Zombie");
					System.out.println("D. Heal with a Regular Potion");
					System.out.println("E. Heal with a Superior Potion");
					System.out.println("F. Reload");
					System.out.print("Enter your choice:");
					choice=sc.nextLine();
				}
			} else if (choice.equalsIgnoreCase("B")){
				if (p.grenadeZombie()){
					if (z.grenadeMe()){
						z.hitpoints=z.hitpoints-30;
						if (z.hitpoints<=0){
							System.out.println("The zombie has 0 HP left. You win.");
							break;
						} else{
							System.out.println("You hit the zombie. The zombie has " + z.hitpoints + " HP left.");
							p.hitpoints=p.hitpoints-z.regenerate();
							System.out.println("The zombie regenerates. It has " + z.hitpoints + " HP. You have "+p.hitpoints+ " HP left.");
							if (p.isStillAlive()){
								p.visualize();
								z.visualize();
								System.out.println("A. Shoot it");
								System.out.println("B. Throw a Grenade");
								System.out.println("C. Decapitate the Zombie");
								System.out.println("D. Heal with a Regular Potion");
								System.out.println("E. Heal with a Superior Potion");
								System.out.println("F. Reload");
								System.out.print("Enter your choice:");
								choice=sc.nextLine();
							} else {
								System.out.println("You died. Game over.");
								break;
							}
						}
					} else{
						System.out.println ("You miss.");
						p.hitpoints=p.hitpoints-z.regenerate();
						System.out.println("The zombie regenerates. It has " + z.hitpoints + " HP. You have "+p.hitpoints+ " HP left.");
						if (p.isStillAlive()){
								p.visualize();
								z.visualize();
								System.out.println("A. Shoot it");
								System.out.println("B. Throw a Grenade");
								System.out.println("C. Decapitate the Zombie");
								System.out.println("D. Heal with a Regular Potion");
								System.out.println("E. Heal with a Superior Potion");
								System.out.println("F. Reload");
								System.out.print("Enter your choice:");
								choice=sc.nextLine();
							} else {
								System.out.println("You died. Game over.");
								break;
							}
					}
				} else {
					System.out.println("You have 0 grenades left.");
					p.visualize();
					z.visualize();
					System.out.println("A. Shoot it");
					System.out.println("B. Throw a Grenade");
					System.out.println("C. Decapitate the Zombie");
					System.out.println("D. Heal with a Regular Potion");
					System.out.println("E. Heal with a Superior Potion");
					System.out.println("F. Reload");
					System.out.print("Enter your choice:");
					choice=sc.nextLine();
				}
			} else if (choice.equalsIgnoreCase("C")){
				if (z.decapitate()){
					p.zombified();
					System.out.println("You turn into a zombie. Game Over.");
					break;
				} else{
					System.out.println("You decapitate the zombie. You win.");
					break;
				}
			} else if (choice.equalsIgnoreCase("D")){
				if (p.hitpoints>=100){
					System.out.println("You already have maximum HP.");
					p.visualize();
					z.visualize();
					System.out.println("A. Shoot it");
					System.out.println("B. Throw a Grenade");
					System.out.println("C. Decapitate the Zombie");
					System.out.println("D. Heal with a Regular Potion");
					System.out.println("E. Heal with a Superior Potion");
					System.out.println("F. Reload");
					System.out.print("Enter your choice:");
					choice=sc.nextLine();
				} else {
					if (p.useRegularPotion()){
						System.out.println ("You now have "+p.hitpoints+" HP.");
						p.hitpoints=p.hitpoints-z.regenerate();
						System.out.println("The zombie regenerates. It has " + z.hitpoints + " HP. You have "+p.hitpoints+ " HP left.");
						if (p.isStillAlive()){
								p.visualize();
								z.visualize();
								System.out.println("A. Shoot it");
								System.out.println("B. Throw a Grenade");
								System.out.println("C. Decapitate the Zombie");
								System.out.println("D. Heal with a Regular Potion");
								System.out.println("E. Heal with a Superior Potion");
								System.out.println("F. Reload");
								System.out.print("Enter your choice:");
								choice=sc.nextLine();
							} else {
								System.out.println("You died. Game over.");
								break;
							}
					} else {
						System.out.println("You have 0 regular potions left.");
						p.visualize();
						z.visualize();
						System.out.println("A. Shoot it");
						System.out.println("B. Throw a Grenade");
						System.out.println("C. Decapitate the Zombie");
						System.out.println("D. Heal with a Regular Potion");
						System.out.println("E. Heal with a Superior Potion");
						System.out.println("F. Reload");
						System.out.print("Enter your choice:");
						choice=sc.nextLine();
					}
				}
			} else if (choice.equalsIgnoreCase("E")){
				if (p.hitpoints>=100){
					System.out.println("You already have maximum HP.");
					p.visualize();
					z.visualize();
					System.out.println("A. Shoot it");
					System.out.println("B. Throw a Grenade");
					System.out.println("C. Decapitate the Zombie");
					System.out.println("D. Heal with a Regular Potion");
					System.out.println("E. Heal with a Superior Potion");
					System.out.println("F. Reload");
					System.out.print("Enter your choice:");
					choice=sc.nextLine();
				} else {
					if (p.useSuperiorPotion()){
						System.out.println ("You now have "+p.hitpoints+" HP.");
						p.hitpoints=p.hitpoints-z.regenerate();
						System.out.println("The zombie regenerates. It has " + z.hitpoints + " HP. You have "+p.hitpoints+ " HP left.");
						if (p.isStillAlive()){
								p.visualize();
								z.visualize();
								System.out.println("A. Shoot it");
								System.out.println("B. Throw a Grenade");
								System.out.println("C. Decapitate the Zombie");
								System.out.println("D. Heal with a Regular Potion");
								System.out.println("E. Heal with a Superior Potion");
								System.out.println("F. Reload");
								System.out.print("Enter your choice:");
								choice=sc.nextLine();
							} else {
								System.out.println("You died. Game over.");
								break;
							}
					} else {
						System.out.println("You have 0 superior potions left.");
						p.visualize();
						z.visualize();
						System.out.println("A. Shoot it");
						System.out.println("B. Throw a Grenade");
						System.out.println("C. Decapitate the Zombie");
						System.out.println("D. Heal with a Regular Potion");
						System.out.println("E. Heal with a Superior Potion");
						System.out.println("F. Reload");
						System.out.print("Enter your choice:");
						choice=sc.nextLine();
					} 
				}
			} else if (choice.equalsIgnoreCase("F")){
				p.reload();
				p.hitpoints=p.hitpoints-z.regenerate();
				System.out.println("The zombie regenerates. It has " + z.hitpoints + " HP. You have "+p.hitpoints+ " HP left.");
				if (p.isStillAlive()){
					p.visualize();
					z.visualize();
					System.out.println("A. Shoot it");
					System.out.println("B. Throw a Grenade");
					System.out.println("C. Decapitate the Zombie");
					System.out.println("D. Heal with a Regular Potion");
					System.out.println("E. Heal with a Superior Potion");
					System.out.println("F. Reload");
					System.out.print("Enter your choice:");
					choice=sc.nextLine();
				} else {
					System.out.println("You died. Game over.");
					break;
				}
			}
		}
	}
}