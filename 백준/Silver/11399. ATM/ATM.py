import sys

n = int(input())
lines = list(map(int,sys.stdin.readline().rstrip().split()))
lines.sort()
answer = [lines[0]]
for i in range(1,len(lines)):
    answer.append(answer[-1] + lines[i])
print(sum(answer))