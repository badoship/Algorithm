import sys

input = lambda: sys.stdin.readline().rstrip()
n = int(input())
disp = 10007

# 0 -> 0~9 -> 10
# 1 -> 1~9 -> 9
# 2 -> 2~9 -> 8
# 3 -> 3~9 -> 7
# 9 -> 9 -> 1

dp = [[1 for _ in range(10)] for _ in range(n)]
for i in range(1, n):
    for j in range(0, 10):
        dp[i][j] = sum(dp[i - 1][j:]) % disp

print(sum(dp[n - 1]) % disp)