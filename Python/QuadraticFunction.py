#!/usr/bin/python3
'''
INPUT: The Quadratic Coefficient, a, the Linear Coefficient, b, and the Constant, c
OUTPUT: The Roots of the Quadratic Function
'''
import math
import cmath
a=int(input("Enter the quadratic coefficient:"))
b=int(input("Enter the linear coefficient:"))
c=int(input("Enter the constant:"))
d=(b**2)-(4*a*c)
if d==0:
    e=(-b+math.sqrt(d))/(2*a)
    print ("The equation has one real root:",e)
elif d>0:
    e=(-b+math.sqrt(d))/(2*a)
    f=(-b-math.sqrt(d))/(2*a)
    print ("The equation has two real roots:",e, "and", f)
else:
    e=(-b+cmath.sqrt(d))/(2*a)
    f=(-b-cmath.sqrt(d))/(2*a)
    print ("The no real roots. The equation has two imaginary solutions:",e, "and its conjugate", f)
