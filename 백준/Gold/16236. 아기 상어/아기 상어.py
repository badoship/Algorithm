from collections import deque
import sys

n = int(input())
graph = [list(map(int, sys.stdin.readline().rstrip().split())) for _ in range(n)]

for i in range(n):
    for j in range(n):
        if graph[i][j] == 9:
            curX, curY = i, j  # 아기 상어의 위치

dx = (1, 0, -1, 0)
dy = (0, 1, 0, -1)


def bfs(cX, cY):
    canEat = []
    dq = deque()
    dq.append((cX, cY, 0))
    isVisited = [[0] * n for _ in range(n)]
    while dq:
        a, b, cDist = dq.popleft()
        for d in range(4):
            nX, nY = a + dx[d], b + dy[d]
            if 0 <= nX < n and 0 <= nY < n and not isVisited[nX][nY]:
                isVisited[nX][nY] = 1
                if size > graph[nX][nY] and graph[nX][nY] != 0:
                    canEat.append((cDist + 1, nX, nY))

                if size >= graph[nX][nY]:
                    dq.append((nX, nY, cDist + 1))

    canEat.sort(key=lambda x: (-x[0], -x[1], -x[2]))
    return canEat


size = 2
result = 0
sizeCnt = 0
while True:  # 아기 상어가 1마리씩 먹고 해당 위치로 이동
    graph[curX][curY] = 0
    candidates = bfs(curX, curY)

    if not candidates:  # 더 이상 먹을 수 있는 물고기가 공간에 없다면 아기 상어는 엄마 상어에게 도움을 요청한다.
        break

    dist, x, y = candidates.pop()

    result += dist

    sizeCnt += 1

    if sizeCnt == size:
        size += 1
        sizeCnt = 0

    curX, curY = x, y

print(result)