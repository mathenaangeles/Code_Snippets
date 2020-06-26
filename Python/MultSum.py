# Return the total of all numbers divisible by 3 and 5.
def multsum(n):
    total = 0
    for i in range(3, n):
        if i % 3 == 0 or i % 5 == 0:
            total += i
    return total


print(multsum(15))
print(multsum(0))
print(multsum(-10))
print(multsum(100))

'''
def multsum(n):
    return sum(set(range(3, n, 3)) | set(range(5, n, 5)))
'''
