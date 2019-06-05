#!/usr/bin/python3
'''
INPUT: A List of Numbers Separated by a Space
OUTPUT: The Mode/s of the Given List of Numbers
'''
b = sorted(map(int,input("Enter your list:").split()))
def mode(b):
    numbers = {}
    for x in b:
        c = b.count(x)
        numbers[x] = c
    highest = max(numbers.values())
    n = []
    for y in numbers.keys():
        if numbers[y] == highest:
            n.append(y)
    return n
print (mode(b))
