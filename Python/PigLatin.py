def pig_latin(sentence):
    pig_latin = ""
    vowels=['a','e','i','o','u','A','E','I','O','U','y',"Y"]
    for word in sentence:
        if word[0] in vowels:
            new_word = word+"ay"
        else:
            consonant = ""
            for letter in word:
                if letter not in vowels:
                    consonant = consonant + letter
                else:
                    index = word.index(letter)
                    break
            new_word = word[index:]+consonant+"ay"
        pig_latin = pig_latin + new_word.lower() + " "
    return pig_latin

sentence=input("Enter a Senctence: ").strip(".").split(" ")
print(pig_latin(sentence))