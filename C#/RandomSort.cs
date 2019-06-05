using System.IO;
using System;

// Generates a Random Array of Numbers and Sorts them from Least to Greatest

public class Program{
    public static void Main(){
        Console.WriteLine("How many numbers?");
        int number = Convert.ToInt32(Console.ReadLine());
        int [] array = new int[number];
        Random random = new Random();
        for (int i=0;i<number;i++){
            array[i]=random.Next(1,100);
            //Console.WriteLine("Element[{0}] = {1}", i, array[i]);
        }
        int temp;
        for (int i=0; i<=number-2; i++) {
            for (int  j=0; j<=number-2; j++) {
               if (array[j] > array[j + 1]) {
                  temp = array[j + 1];
                  array[j + 1] = array[j];
                  array[j] = temp;
               }
            }
         }
        for (int i=0;i<number;i++){
            Console.WriteLine("{0}", array[i]);
        }
    }
}
