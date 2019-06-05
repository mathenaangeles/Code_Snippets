#!/usr/bin/python3
'''
INPUT: An Integer, a, Greater Than or Equal to 0 and Less Than or Equal to 4000
OUTPUT: The Roman Numeral Counterpart of the Integer a
'''
a=int(input("Enter a number:"))
if a<=0 or a>=4000:
    print ("Invalid")
if a>=1000:
    b=a//1000
    a=a%1000
    print ("M"*b, end="")
if a>=900:
    b=a//900
    a=a%900
    print ("CM"*b, end="")
if a>=500:
    b=a//500
    a=a%500
    print ("D"*b, end="")
if a>=400:
    b=a//400
    a=a%400
    print ("CD"*b, end="")
if a>=100:
    b=a//100
    a=a%100
    print ("C"*b, end="")
if a>=90:
    b=a//90
    a=a%90
    print ("XC"*b, end="")
if a>=50:
    b=a//50
    a=a%50
    print ("L"*b, end="")
if a>=40:
    b=a//40
    a=a%40
    print ("XL"*b, end="")
if a>=10:
    b=a//10
    a=a%10
    print ("X"*b, end="")
if a>=9:
    b=a//9
    a=a%9
    print ("IX"*b, end="")
if a>=5:
    b=a//5
    a=a%5
    print ("V"*b, end="")
if a>=4:
    b=a//4
    a=a%4
    print ("IV"*b, end="")
if a>=1:
    b=a//1
    a=a%1
    print ("I"*b, end="")
print("\n")
