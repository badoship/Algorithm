import sys
from collections import deque

m, n, h = map(int, input().split())
# print(m,n,h)
boxs = [[list(map(int, sys.stdin.readline().rstrip().split())) for _ in range(n)] for _ in range(h)]
# isVisited = [[[0] * m for _ in range(n)] for _ in range(h)]



dRow = (1, 0, -1, 0, 0, 0)
dCol = (0, 1, 0, -1, 0, 0)
dHeight = (0, 0, 0, 0, 1, -1)

def bfs():
    # isVisited[h][r][c] = 1
    while dq:
        dqH, dqR, dqC = dq.popleft()

        for d in range(6):
            nR = dqR + dRow[d]
            nC = dqC + dCol[d]
            nH = dqH + dHeight[d]

            # print("in",nH,nR,nC)
            # if 0 <= nR < n and 0 <= nC < m and 0 <= nH < h and not isVisited[nH][nR][nC] and boxs[nH][nR][nC] == 0:
            if 0 <= nR < n and 0 <= nC < m and 0 <= nH < h and boxs[nH][nR][nC] == 0:
                # print(nH,nR,nC)
                # isVisited[nH][nR][nC] = 1
                dq.append((nH,nR,nC))
                boxs[nH][nR][nC] = boxs[dqH][dqR][dqC] + 1

dq = deque()
for col in range(m):
    for row in range(n):
        for height in range(h):
            # if not isVisited[height][row][col] and boxs[height][row][col]:
                # bfs(height,row,col)
            if boxs[height][row][col] == 1 :
                dq.append((height,row,col))

bfs()

# print(*boxs, sep="\n")
# print(*isVisited, sep="\n")

maxVal = 0
for col in range(m):
    for row in range(n):
        for height in range(h):
            if not boxs[height][row][col]:
                print(-1)
                exit(0)
            maxVal = max(maxVal,boxs[height][row][col])
else :
    print(maxVal-1)
