import sys
from collections import deque

computerCnt = int(input())
linkedCnt = int(input())
links = [[] for _ in range(computerCnt+1)]

for _ in range(linkedCnt):
    a, b = map(int,sys.stdin.readline().rstrip().split())
    links[a].append(b)
    links[b].append(a)

def getVirusComCnt(start):
    isChecked = [0] * (computerCnt + 1)
    isChecked[start] = 1
    dq = deque()
    dq.append(start)
    cnt = 0

    while dq :
        q = dq.popleft()
        for comNum in links[q] :
            if not isChecked[comNum]:
                cnt += 1
                isChecked[comNum] = 1
                dq.append(comNum)

    return cnt

print(getVirusComCnt(1))