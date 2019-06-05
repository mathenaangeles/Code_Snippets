import Foundation

// Checks wether or not a string is palindrome for every n characters (i.e. xAxB is a palindome every two characters)

var newStr = [Character]()
func newString (str: String, n:Int) {
    let characters = Array (str)
    var counter: Int
    counter = 1
    for i in characters{
        if (counter==n){
           newStr.append(i)
           counter=0
        }
        counter=counter+1;
    }

}

func isPalindrome(str:String) -> Bool {
    let reverseString = String(str.reversed())
    if(str != "" && str == reverseString) {
        return true
    } else {
        return false
    }
}

let str = readLine()!
var n: Int=Int(readLine()!)!
newString(str:str,n:n)
var str2=String(newStr)
if (isPalindrome(str:str2)){
    print("Palindrome")
} else{
    print("Not Palindrome")
}
