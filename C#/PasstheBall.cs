using System.IO;
using System;

// Four Players Pass the Ball around a Given Number of Times

public class Person{
    string name;
    public Person(string str){
        name = str;
    }
    public void  myTurn(){
        Console.WriteLine("I,{0},have the ball!",name);
    }

}
public class Program{
    public static void Main(){
        Console.WriteLine("How many times should we pass?");
        int number = Convert.ToInt32(Console.ReadLine());
        Person one = new Person("One");
        Person two = new Person("Two");
        Person three = new Person("Three");
        Person four = new Person("Four");
        Random random = new Random();
        int player=random.Next(1,4);
        while (number>0){
             Console.WriteLine("------Passing the Ball------");
            if (player==1){
                one.myTurn();
                while (player==1){
                    player=random.Next(1,4);
                }
            } else if (player==2){
                two.myTurn();
                while (player==2){
                    player=random.Next(1,4);
                }
            } else if (player==3){
                three.myTurn();
                while (player==3){
                    player=random.Next(1,4);
                }
            } else if(player==4){
                four.myTurn();
                while (player==4){
                    player=random.Next(1,4);
                }
            }
            number--;
        }
    }
}
