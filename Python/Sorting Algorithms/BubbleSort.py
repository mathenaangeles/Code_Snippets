# Bubble sorts numerical input from least to greatest.
x=[int(x) for x in input().split()]
def bubble(x):
    for i, num in enumerate(x):
        try:
            if x[i+1]<num:
                x[i]=x[i+1]
                x[i+1]=num
                bubble(x)
        except IndexError:
            pass
    return x
print(bubble(x))
