# Find the flight paths from start to end.


def findPaths(graph, start, end, path=[]):
    path = path + [start]
    if start == end:
        return [path]
    if start not in graph:
        return []
    paths = []
    for node in graph[start]:
        if node not in path:
            newpaths = findPaths(graph, node, end, path)
            for newpath in newpaths:
                paths.append(newpath)
    return paths


# Create a graph given in the above diagram
graph = {'A': ['B', 'C'], 'B': ['C'], 'C': ['A']}

src = "A"
dst = "C"
print("The following are all the different paths from %s to %s :" % (src, dst))
print(findPaths(graph, src, dst))
