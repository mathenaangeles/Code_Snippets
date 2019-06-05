import Foundation

// Prints every yth number in the Fibonacci sequence until the xth number in the sequence.

func fibonacci (x: Int) -> Int {
    if (x == 0){
        return 0
    } else if (x == 1) {
        return 1
    }
    return fibonacci(x:x-1) + fibonacci(x:x-2)
}

var x: Int=Int(readLine()!)!
var y: Int=Int(readLine()!)!

var counter: Int 
counter = 1

for i in 0...x{
    
    if (counter == y){
         print(fibonacci(x:i))
         counter = 0
    }
    counter=counter+1
   
}
