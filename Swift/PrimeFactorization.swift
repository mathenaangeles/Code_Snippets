import Foundation

// Returns the prime factorization of the number.

var factors: [Int] = []

func primeFactors (x: Int) {
    var x = x
    var divisor = 2
    while divisor * divisor <= x {
        while x % divisor == 0 {
            factors.append(divisor)
            x = x / divisor
        }
        divisor += divisor == 2 ? 1 : 2
    }
    if x > 1 {
        factors.append(x)
    }

}

var x: Int=Int(readLine()!)!
primeFactors(x:x)

for i in factors{
    print(i)
}
