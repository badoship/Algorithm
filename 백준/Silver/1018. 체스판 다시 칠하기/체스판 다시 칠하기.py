pattern1 = [list('WBWBWBWB'), list('BWBWBWBW')]
minVal = 50 ** 2

n, m = map(int, input().split())
board = [list(input()) for _ in range(n)]


def calDiffPattern(i):
    cnt = 0
    for y in range(0, 8):
        for x in range(0, 8):
            if pattern1[(i + y) % 2][x] != board[row + y][col + x]:
                cnt += 1

                if cnt > minVal:
                    return cnt
    return cnt


for row in range(0, n - 7):
    for col in range(0, m - 7):
        for i in range(2):
            minVal = min(minVal, calDiffPattern(i))

print(minVal)
