import sys
from collections import deque

n = int(input())
grid = [list(sys.stdin.readline().rstrip()) for _ in range(n)]
isCheck = [[False for _ in range(n)] for _ in range(n)]
isCheck2 = [[False for _ in range(n)] for _ in range(n)]
cnt = 0
cnt2 = 0
dx = [1, 0, -1, 0]
dy = [0, 1, 0, -1]


def bfs(checked):
    checked[row][col] = True

    deq = deque()
    deq.append((row, col))
    while deq:
        r, c = deq.popleft()
        for d in range(4):
            dRow = r + dx[d]
            dCol = c + dy[d]

            if 0 <= dRow < n and 0 <= dCol < n:
                if not checked[dRow][dCol] and grid[dRow][dCol] in color:
                    checked[dRow][dCol] = True
                    deq.append((dRow, dCol))


for row in range(n):
    for col in range(n):
        if not isCheck[row][col]:
            cnt += 1
            color = [grid[row][col]]
            bfs(isCheck)

        if not isCheck2[row][col]:
            cnt2 += 1
            if grid[row][col] == "B" :
                color = ["B"]
            else :
                color = ["R","G"]
            bfs(isCheck2)

print(cnt, cnt2)
