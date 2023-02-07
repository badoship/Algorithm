import sys

n = int(input())
graph = [list(map(int,sys.stdin.readline().rstrip().split())) for _ in range(n)]

def dfs(x):
    for i in range(n):
        if graph[x][i] and visited[i] == 0:
            visited[i] = 1
            dfs(i)

for i in range(n) :
    visited = [0 for _ in range(n)]
    dfs(i)
    for j in range(n):
        print(visited[j] , end=" ")
    print()
