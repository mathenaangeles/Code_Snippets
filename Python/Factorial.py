#!/usr/bin/python3
'''
INPUT: An Integer, a
OUTPUT: The Factorial of an Integer, a
'''
a=int(input("Enter a number:"))
b=1
if a<0:
    print ("Invalid")
elif a==0:
    print ("The factorial of zero is", a)
else:
    for i in range (1, a+1):
        b=b*i
    print ("The factorial of",a,"is",b)
