import sys

n = int(input())
graph = [list(map(int, sys.stdin.readline().rstrip().split())) for _ in range(n)]

def dfs(x):
    for i in range(n):
        if not isCheck[i] and graph[x][i]:
            isCheck[i] = True
            dfs(i)

for i in range(n):
    isCheck = [False for _ in range(n)]
    dfs(i)
    for j in range(n):
        print(1 if isCheck[j] else 0 , end=" ")
    print()
