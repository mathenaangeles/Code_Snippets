# Selection sorts numerical input from least to greatest.
x=[int(x) for x in input().split()]
def select(x):
    if len(x)<=1:
        return x
    else:
        sorted=list()
        element=min(x)
        sorted.append(element)
        x.remove(element)
        sorted.extend(select(x))
        return sorted
print(select(x))

    
