# Count the number of unique characters.
def count(substring):
    unique = [substring[0]]
    for i in substring:
        if i not in unique:
            unique.append(i)
    return len(unique)

# Determine if substring has less than n unique characters and is equal to or greater than m in length.


def isValid(arr, substring, m, n):
    unique = count(substring)
    if unique <= n and len(substring) >= m:
        if len(substring) > m:
            arr.clear() # Reset the array.
        return True
    else:
        return False


# Find substrings within the sequence.
def findSubstrings(sequence, n):
    substrings = []
    m = 0 # current maximum length of subsequence
    for i in range(len(sequence)):
        for j in range(i+1, len(sequence)+1):
            if isValid(substrings, sequence[i:j], m, n):
                m = len(sequence[i:j])
                substrings.append(sequence[i:j])
            else:
                continue
    return substrings


sequence = input("Enter Sequence: ")
n = int(input("Enter  Number of Unique Characters: "))

results = findSubstrings(sequence, n)
maxCount = count(results[0])
if maxCount < n:
    print("There are only {} unique characters.".format(maxCount))
else:
    print(results)
