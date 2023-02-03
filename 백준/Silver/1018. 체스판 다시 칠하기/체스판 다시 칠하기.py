pattern1 = [list('WBWBWBWB'), list('BWBWBWBW')]
minVal = 50 ** 2

n, m = map(int, input().split())
board = [list(input()) for _ in range(n)]


def calDiffPattern(i):
    cnt1 = cnt2 = 0
    for y in range(0, 8):
        for x in range(0, 8):
            if pattern1[(i + y) % 2][x] != board[row + y][col + x]:
                cnt1 += 1
            else :
                cnt2 += 1

    return min(cnt1,cnt2)


for row in range(0, n - 7):
    for col in range(0, m - 7):
        minVal = min(minVal, calDiffPattern(0))

print(minVal)