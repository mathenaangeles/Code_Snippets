#!/usr/bin/python3/r
'''
INPUT: The Three Numbers, a, b, and c
OUTPUT: If a, b, and c Form a Pythagorean Triple
'''
a=int(input("Enter the first number:"))
b=int(input("Enter the second number:"))
c=int(input("Enter the third number:"))
if a>b>c or a>c>b:
	d=a
	e=b
	f=c
elif b>a>c or b>c>a:
	d=b
	e=a
	f=c
elif c>a>b or c>b>a:
	d=c
	e=a
	f=b
else:
	print (a,b,c, 'is not a Pythagorean Triple')
if d*d==e*e+f*f:
	print (a,b,c, 'is a Pythagorean Triple')
else:
	print (a,b,c,'is not a Pythagorean Triple')
