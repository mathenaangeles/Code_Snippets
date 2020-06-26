# Get the number of repeating charcters by returning the length of an array that contains all charcaters encountered mpre than once.
def repeats(string):
    history = []
    repeats = []
    for i in string:
        if i.lower() not in history:
            history.append(i.lower())
        elif i.lower() not in repeats:
            repeats.append(i.lower())
    return (len(repeats))


print(repeats("aaaa"))
print(repeats("abBA"))
print(repeats("Indivisibility"))
print(repeats("Indivisibilities"))

'''
def repeats(s):
    return len([c for c in set(s.lower()) if s.lower().count(c) > 1])
'''
