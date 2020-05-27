from random import randint

# Bubble Sort


def bubbleSort(arr):
    n = len(arr)
    for i in range(n):
        isSorted = True
        for j in range(n-i-1):
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]
                isSorted = False
        if isSorted:
            break

# Insertion Sort


def insertionSort(arr):
    n = len(arr)
    for i in range(1, n):
        curr = arr[i]
        ptr = i - 1
        while ptr >= 0 and arr[ptr] > curr:
            arr[ptr+1] = arr[ptr]
            ptr -= 1
        arr[ptr+1] = curr

# Merge Sort


def mergeSort(arr):
    def merge(left, right):
        if len(left) == 0:
            return right
        if len(right) == 0:
            return left
        result = []
        l = r = 0
        while len(result) < len(left) + len(right):
            if left[l] <= right[r]:
                result.append(left[l])
                l += 1
            else:
                result.append(right[r])
                r += 1

            if r == len(right):
                result += left[l:]
                break
            if l == len(left):
                result += right[r:]
                break
        return result

    if len(arr) < 2:
        return arr
    midpoint = len(arr)//2
    return merge(left=mergeSort(arr[:midpoint]),
                 right=mergeSort(arr[midpoint:]))

# Quick Sort


def quickSort(arr):
    if len(arr) < 2:
        return arr

    low, same, high = [], [], []

    pivot = arr[randint(0, len(arr) - 1)]

    for item in arr:
        if item < pivot:
            low.append(item)
        elif item == pivot:
            same.append(item)
        elif item > pivot:
            high.append(item)

    return quickSort(low) + same + quickSort(high)


arr = [100, 0, 60, 9, 75, 14]
# bubbleSort(arr)
# insertionSort(arr)
# print(arr)
# print(mergeSort(arr))
print(quickSort(arr))
