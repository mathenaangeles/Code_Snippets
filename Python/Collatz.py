#!/usr/bin/python3
'''
INPUT: An Integer, num
OUTPUT: The Collatz Sequence of an Integer, num
'''
num=int(input())
def collatz(num):
    if num == 1:
        return [num]
    elif num%2==0:
        return [num] + collatz(num//2)
    else:
        return [num] + collatz(num*3+1)
print (collatz(num))
