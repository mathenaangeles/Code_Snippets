using System.IO;
using System;

// Returns the Factorial of a Given Number

class Function{
    public int Factorial(int number){
        if (number==1 || number==0){
            return 1;
        } else{
            return number*Factorial(number-1);
        }
    }
}
public class Program{
	public static void Main(){
		Console.WriteLine("Factorial of what number?");
		int number = Convert.ToInt32(Console.ReadLine());
		var func = new Function();
		int factorial = func.Factorial(number);
		Console.WriteLine("{0}",factorial);

	}
}
