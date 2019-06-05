# Quick sorts numerical input from least to greatest.
x=[int(x) for x in input().split()]
def quick(x): 
    if len(x) <= 1:
        return x
    else:
        return quick([i for i in x[1:] if i < x[0]]) + [x[0]] + quick([i for i in x[1:] if i >= x[0]])
print(quick(x))

    