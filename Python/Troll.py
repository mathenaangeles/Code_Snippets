# Replace all the vowels in a string with an asterisk.
def troll(string):
    vowels = ['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U']
    for i in vowels:
        string = string.replace(i, "*")
    return string


'''
def troll(s):
    return s.translate(s.maketrans('aeiouAEIOU','*'*10))
'''

print(troll("Useful Function"))
