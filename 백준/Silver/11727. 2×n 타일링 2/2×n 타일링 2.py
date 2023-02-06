import sys

input = sys.stdin.readline

n = int(input())
s = [0] * 1001
s[1] = 1
s[2] = 3
for i in range(3,1001):
    s[i] = s[i-1] + s[i-2] * 2

print(s[n]  % 10007)