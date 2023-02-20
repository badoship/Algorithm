import sys

n, k = map(int,input().split())
coins = []
for _ in range(n):
    coins.append(int(sys.stdin.readline().rstrip()))

cnt = 0
while k:
    cnt += k // coins[-1]
    k %= coins[-1]
    coins.pop()

print(cnt)