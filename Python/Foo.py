def foo(arr, seq):
    bar = list(seq)
    for i in range(0, len(arr)):
        if arr[i] == "run" and i % 2 != 0:
            bar[i] = "/"
        if arr[i] == "jump" and i % 2 == 0:
            bar[i] = "X"
    return "".join(bar)


print(foo(["run", "jump", "run", "jump", "run"], "_|_|_"))
print(foo(["run", "jump", "run", "run", "run"], "_|_|_"))
print(foo(["run", "run", "run", "run", "run"], "_|_|_"))
print(foo(["jump", "jump", "jump", "jump", "jump"], "_|_|_"))
print(foo(["jump", "run", "jump", "run", "jump"], "_|_|_"))
