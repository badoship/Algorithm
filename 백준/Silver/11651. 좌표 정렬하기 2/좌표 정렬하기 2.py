import sys

n = int(input())
xAndY = list(list(map(int,sys.stdin.readline().rstrip().split())) for _ in range(n))
xAndY.sort(key=lambda x:(x[1],x[0]))
for x, y in xAndY:
    print(x,y)