#!/usr/bin/python3
'''
INPUT: A Minimum Value, x, and a Maximum Value, y
OUTPUT: All Ordered Pairs from x to y
'''
print("Enter a value for x. ")
x = int(input())
print("Enter a value for y. ")
y = int(input())
for a in range (x,y+1):
    for b in range (x,y+1):
        print (a,b)
