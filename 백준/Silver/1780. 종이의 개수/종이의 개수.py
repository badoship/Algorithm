import sys

n = int(input())
paper = [list(map(int, sys.stdin.readline().rstrip().split())) for _ in range(n)]


def cut(x, y, d):
    val = paper[x][y]

    for row in range(x, x + d):
        for col in range(y, y + d):
            if val != paper[row][col]:
                for i in range(3):
                    for j in range(3):
                        cut(x + d // 3 * i, y + d // 3 * j, d // 3)
                return

    count[val + 1] += 1


count = [0, 0, 0]
cut(0, 0, n)
for i in count:
    print(i)
