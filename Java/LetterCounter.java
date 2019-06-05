// Counts the number of times each letter appears in a word or phrase.
import java.util.Scanner;
public class Problem1{
	public static void main (String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter word:");
		String word=sc.nextLine();
		char array[]=word.toCharArray();
		int len=word.length();
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		int e=0;
		int f=0;
		int g=0;
		int h=0;
		int i=0;
		int j=0;
		int k=0;
		int l=0;
		int m=0;
		int n=0;
		int o=0;
		int p=0;
		int q=0;
		int r=0;
		int s=0;
		int t=0;
		int u=0;
		int v=0;
		int w=0;
		int x=0;
		int y=0;
		int z=0;
		for (int var=0;var<len;var++){
			if (array[var]=='a' || array[var]=='A' ){
				a++;
			} else if (array[var]=='i' || array[var]=='I'){
				i++;
			}else if (array[var]=='m' || array[var]=='M'){
				m++;
			} else if (array[var]=='s' || array[var]=='S'){
				s++;
			} else if (array[var]=='p' || array[var]=='P'){
				p++;
			} else if (array[var]=='b' || array[var]=='B'){
				b++;
			} else if (array[var]=='c' || array[var]=='C'){
				c++;
			} else if (array[var]=='d' || array[var]=='D'){
				d++;
			} else if (array[var]=='e' || array[var]=='E'){
				e++;
			} else if (array[var]=='f' || array[var]=='F'){
				f++;
			} else if (array[var]=='g' || array[var]=='G'){
				g++;
			} else if (array[var]=='h' || array[var]=='H'){
				h++;
			} else if (array[var]=='j' || array[var]=='J'){
				j++;
			} else if (array[var]=='k' || array[var]=='K'){
				k++;
			} else if (array[var]=='l' || array[var]=='L'){
				l++;
			} else if (array[var]=='n' || array[var]=='N'){
				n++;
			} else if (array[var]=='o' || array[var]=='O'){
				o++;
			} else if (array[var]=='q' || array[var]=='Q'){
				q++;
			} else if (array[var]=='r' || array[var]=='R'){
				r++;
			} else if (array[var]=='t' || array[var]=='T'){
				t++;
			} else if (array[var]=='u' || array[var]=='U'){
				u++;
			} else if (array[var]=='v' || array[var]=='V'){
				v++;
			} else if (array[var]=='w' || array[var]=='W'){
				w++;
			} else if (array[var]=='x' || array[var]=='X'){
				x++;
			} else if (array[var]=='y' || array[var]=='Y'){
				y++;
			} else if (array[var]=='z' || array[var]=='Z'){
				z++;
			} 
		}
		if (a>0){
			System.out.println("a-"+a);
		} 
		if (b>0){
			System.out.println("b-"+b);
		}
		if (c>0){
			System.out.println("c-"+c);
		}
		if (d>0){
			System.out.println("d-"+d);
		}
		if (e>0){
			System.out.println("e-"+e);
		}
		if (f>0){
			System.out.println("f-"+f);
		}
		if (g>0){
			System.out.println("g-"+g);
		}
		if (h>0){
			System.out.println("h-"+h);
		}
		if (i>0){
			System.out.println("i-"+i);
		}
		if (j>0){
			System.out.println("j-"+j);
		} 
		if (k>0){
			System.out.println("k-"+k);
		}
		if (l>0){
			System.out.println("l-"+l);
		}
		if (m>0){
			System.out.println("m-"+m);
		}
		if (n>0){
			System.out.println("n-"+n);
		}
		if (o>0){
			System.out.println("o-"+o);
		}
		if (p>0){
			System.out.println("p-"+p);
		}
		if (q>0){
			System.out.println("q-"+q);
		}
		if (r>0){
			System.out.println("r-"+r);
		}
		if (s>0){
			System.out.println("s-"+s);
		}
		if (t>0){
			System.out.println("t-"+t);
		}
		if (u>0){
			System.out.println("u-"+u);
		}
		if (v>0){
			System.out.println("v-"+v);
		}
		if (w>0){
			System.out.println("w-"+w);
		}
		if (x>0){
			System.out.println("x-"+x);
		}
		if (y>0){
			System.out.println("y-"+y);
		}
		if (z>0){
			System.out.println("z-"+z);
		}
	}
}