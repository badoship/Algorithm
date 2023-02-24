import sys
from collections import deque

n, m = map(int, input().split())
graph = [list(map(int, sys.stdin.readline().rstrip())) for _ in range(n)]

def bfs():
    dq = deque()
    dq.append((0,0))
    dx = (1, 0, -1, 0)
    dy = (0, 1, 0, -1)
    while dq:
        x, y = dq.popleft()
        for d in range(4):
            nx = x + dx[d]
            ny = y + dy[d]

            if 0 <= nx < n and 0 <= ny < m and graph[nx][ny] == 1 :
                dq.append((nx,ny))
                graph[nx][ny] = graph[x][y] + 1

bfs()
print(graph[n-1][m-1])