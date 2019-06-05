# Insertion sorts numerical input from least to greatest.
array=[int(x) for x in input().split()]
def insert (array,i=1):
    if i>=len(array):
        return array
    if array[i-1]>array[i]:
        temp=array[i]
        for a in range (0,i):
            if temp<array[a]:
                array.insert(a,temp)
                del array [i+1]
                break
    return insert(array,i+1)
print(insert(array))
    
