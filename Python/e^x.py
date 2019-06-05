'''
INPUT: The Integer Exponent of Euler's Constant, x
OUTPUT: The Power of Euler's Constant Raised to x
'''
print ("Exponent of Euler's Constant: ")
x=int(input())
if x!=0:
    def exp(x):
        e=0
        def factorial(i):
            num = 1
            while i >= 1:
                num = num * i
                i = i - 1
            return num
        for i in range(0,100,1):
            e=e+(x**i)/factorial(i)
        return e
    y=round(exp(x),10)
    print (y)
else:
    print ("1.0000000000")
