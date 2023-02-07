import sys
from collections import deque

n = int(input())
graph = [list(map(int,sys.stdin.readline().rstrip().split())) for _ in range(n)]

for i in range(n) :
    queue = deque()
    queue.append(i)
    visited = [0] * n

    while queue :
        q = queue.popleft()

        for j in range(n):
            if visited[j] == 0 and graph[q][j] == 1:
                queue.append(j)
                graph[i][j] = 1
                visited[j] = 1

for grp in graph :
    print(*grp)