# Merge sorts numerical input from least to greatest.
x=[int(x) for x in input().split()]
def merge(x):
    if len(x) < 2:
    	return x
    result = []
    middle = int(len(x)/2)
    y = merge(x[:middle])
    z = merge(x[middle:])
    while (len(y) > 0) and (len(z) > 0):
            if y[0] > z[0]:
            	result.append(z.pop(0))   
            else:
            	result.append(y.pop(0))
    result.extend(y+z)
    return result
print(merge(x))