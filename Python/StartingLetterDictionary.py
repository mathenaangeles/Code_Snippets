# Split the report into a list of words.
report = input("Report:").split(" ")
# Remove periods from the words.
report = [i.replace(".", "") for i in report]

# Store every newly encountered firtst letter into an array.
letters = []
for i in report:
    if i[0].upper() not in letters and i[0].isalpha():
        letters.append(i[0].upper())


# Get all the words that start with a given letter.
def get_words(report, letter):
    words = []
    for i in report:
        if i.lower() not in words and i[0].upper() == letter:
            words.append(i.lower())
    return words


# Create a dictionary with all the first letter as the keys and populate the values with each new word encountered that starts with that letter.
dictionary = dict()
for i in letters:
    dictionary[i] = get_words(report, i)
print(dictionary)

'''
def report(string):
    d = dict()
    s = string.lower().split()
    for word in string:
        key = word[0].upper()
        d[key] = d.get(key, set()) | {word}
    return d
'''
