# Open read and write files.
original = open('removecomments.txt', 'r')
final = open('nocomments.txt', 'w')
# Split each line in the file according to the spaces between them.
for line in original:
    line = line.split(" ")
    final_line = []
    # For unit in the original line, append it to the final version of the line until you encounter a hashtag.
    for i in line:
        if i[0] == '#':
            break
        else:
            final_line.append(i)
    # Turn the final line array into a string and write it into the new text file.
    final_line = " ".join(final_line)
    final.write(final_line)


'''
with open('01-dict.py', 'r') as infile:
    with open('uncommented.py', 'w') as outfile:
        for line in in file:
            try:
                i = line.index('#')
                if i > 0:
                    outfile.write(line[:i]+'\n')
            except:
                outfile.write(line)
'''
