# Input
def getInput(val):
    while True:
        var = input("Enter Your {}: ".format(val))
        if ((val == "First Name" or val == "Surname") and not var.isalpha()) or (val == "Birthday (dd/mm/yyyy)" and var.count("/") != 2) or not var:  # Alphanumeric Characters # Count
            continue
        else:
            break
    return var

# Print


def greet(name, surname):
    print("Hello, {} {}!".format(name.capitalize(),
                                 surname.capitalize()))  # Capitalize

# Lambda


def multiply(x):
    return lambda y: y*x

# String Methods


def stringMethods(name, birthday, biography):

    def getAllSubstrings(string):
        substrings = []
        for i in range(len(string)):
            for j in range(i+1, len(string)+1):
                substrings.append(string[i:j])
        return substrings

    def findSubstrings(string, substring):
        string = string.lower()
        substringLength = len(substring)

        def substringRecursion(arr, start):
            index = string.find(substring, start)
            if index != -1:
                return substringRecursion(arr + [index], index+substringLength)
            else:
                return arr
        return substringRecursion([], 0)

    print("hey...{}...HEY, {}!".format(name.lower(), name.upper()),
          end=" ")  # Lowercase and Uppercase
    print(name.replace("a", "@").capitalize()+"!!!")  # Replace
    print(birthday.split("/"))  # Split
    print(getAllSubstrings(name))  # Generate Substrings
    print(findSubstrings(biography, "the"))  # Find Substrings

# List Methods


def listMethods(arr):
    print(arr[:])
    arr.insert(4, 5)  # Insert
    arr.append(11)  # Append
    arr.extend([12, 13, 14, 15])  # Extend
    arr.pop(13)  # Pop (index)
    arr.remove(15)  # Remove (value)
    del arr[10:len(arr)]  # Delete (range)
    arr.reverse()  # Reverse
    print("Reversed Order:", arr)
    arr.sort()  # Sort
    print("Sorted Array:", arr)

# Numerical Methods


def numericalMethods(x, y):
    print("Sum: "+str(x+y))
    print("Difference: "+str(x-y))
    print("Product: "+str(x*y))
    print("Quotient: "+str(x/y))
    print("Remainder: "+str(x % y))
    print("Power: "+str(x**y))
    print("Quotient (Floor Division): "+str(x//y))


# Dictionary Methods
def dictionaryMethods(foo, bar):
    if len(foo) == len(bar):
        dictionary = {foo[i]: bar[i]
                      for i in range(len(foo))}  # Create Dictionary
        for k in dictionary:  # Print Keys
            print(k)
        dictionary["John"] = "0"  # Add
        for v in dictionary.values():  # Print Values
            print(v)
        dictionary.pop("John")  # Remove
        for k, v in dictionary.items():  # Print Key-Value Pairs
            print(k, v)
    else:
        print("Lists must be of the same length.")

# Stack


def stack():
    stack = [i for i in range(1, 6)]  # Push
    print(stack)
    while len(stack) != 0:
        print("Popping...", stack[len(stack)-1])
        stack.pop()  # Pop

# Queue


def queue():
    queue = [i for i in range(1, 6)]  # Enqueue
    print(queue)
    while len(queue) != 0:
        print("Dequeueing...", queue[0])  # Dequeue
        queue.pop(0)  # Pop

# Binary Search


def binarySearch(arr, low, high, x):
    if high >= low:
        arr.sort()
        midpoint = (low+high)//2
        if arr[midpoint] == x:
            return midpoint
        elif arr[midpoint] > x:
            return binarySearch(arr, low, midpoint-1, x)
        else:
            return binarySearch(arr, midpoint+1, high, x)
    else:
        return -1


# name = getInput("First Name")
# surname = getInput("Surname")
# birthday = getInput("Birthday (dd/mm/yyyy)")
# biography = getInput("Biography")

# greet(name, surname)
# stringMethods(name, birthday, biography)

# numbers = [1, 2, 3, 4, 6, 7, 8, 9, 10]
# colors = ["red", "blue", "green"]
# print("/".join(colors)) # Join
# listMethods(numbers)

# x = 5
# y = 2
# numericalMethods(x, y)

# doubled = multiply(2)
# print(doubled(11))


# names = input("Enter Names (seperated by commas):").split(",")
# scores = input("Enter Scores (seperated by commas):").split(",")
# dictionaryMethods(names, scores)

# stack()
# queue()

# print(binarySearch(numbers, 0, len(numbers)-1, 3))
