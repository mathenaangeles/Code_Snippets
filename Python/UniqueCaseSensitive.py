# Find all the unique characters in a string by storing all newly encountered characters in an array and returning its length.
def find_unique_character(string):
    history = []
    for i in string:
        if i not in history:
            history.append(i)
    return len(history)


string = input("String:")
print("Unique Characters: {}".format(find_unique_character(string)))
# print(len(set(string))) # The set only contains distinct charcaters of any iterable sequence.
