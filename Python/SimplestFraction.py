#!/usr/bin/python3
'''
INPUT: A Real Number, a
OUTPUT: The Simplest Fraction Form of the Real Number, a
'''
import math
a=float(input("Enter a number:"))
b=[int(i) if i.isdigit() else i for i in map(str, str(a))]
if "." in b:
    b.remove (".")
if "-" in b:
    b.remove ("-")
c=len(b)
d=int(a*(10**c))
e=int(1*(10**c))
f=int(math.gcd(d,e))
print (int(d/f),"/",int(e/f))
