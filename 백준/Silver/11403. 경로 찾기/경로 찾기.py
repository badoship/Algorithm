import sys

n = int(input())
graph = [list(map(int,sys.stdin.readline().rstrip().split())) for _ in range(n)]

for middle in range(n):
    for start in range(n):
        for end in range(n):
            if graph[start][middle] and graph[middle][end] :
                graph[start][end] = 1

for g in graph :
    print(*g)