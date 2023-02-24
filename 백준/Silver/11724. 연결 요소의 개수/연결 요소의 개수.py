import sys

sys.setrecursionlimit(10 ** 6)
n, m = map(int, input().split())
isChecked = [0] * (n + 1)
graph = [[] for _ in range(n + 1)]

for _ in range(m):
    a, b = map(int, sys.stdin.readline().rstrip().split())
    graph[a].append(b)
    graph[b].append(a)


def dfs(idx):
    isChecked[idx] = 1
    for g in graph[idx]:
        if not isChecked[g]:
            dfs(g)


result = 0
for i in range(1, n + 1):
    if not isChecked[i]:
        result += 1
        dfs(i)

print(result)