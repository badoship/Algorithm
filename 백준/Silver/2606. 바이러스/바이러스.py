import sys

computerCnt = int(input())
linkedCnt = int(input())
links = [[] for _ in range(computerCnt+1)]

for _ in range(linkedCnt):
    a, b = map(int,sys.stdin.readline().rstrip().split())
    links[a].append(b)
    links[b].append(a)

isChecked = [0] * (computerCnt+1)
def dfs(start) :
    isChecked[start] = 1
    for comNum in links[start]:
        if not isChecked[comNum]:
            dfs(comNum)

dfs(1)
print(sum(isChecked)-1)