import sys

n = int(input())
maps = [list(map(int, sys.stdin.readline().rstrip())) for _ in range(n)]
isChecked = [[0] * n for _ in range(n)]

dx = (1, 0, -1, 0)
dy = (0, 1, 0, -1)


def dfs(x, y):
    global numHomesComplex
    isChecked[x][y] = 1
    numHomesComplex += 1

    for d in range(4):
        nx = x + dx[d]
        ny = y + dy[d]

        if 0 <= nx < n and 0 <= ny < n and maps[nx][ny] and not isChecked[nx][ny]:
            dfs(nx, ny)


unitCount = 0
unitCountList = []

for i in range(n):
    for j in range(n):
        if not isChecked[i][j] and maps[i][j]:
            numHomesComplex = 0
            unitCount += 1
            dfs(i, j)
            unitCountList.append(numHomesComplex)

print(unitCount)
print(*sorted(unitCountList), sep="\n")
