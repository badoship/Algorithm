import sys

case = int(input())
stack = []
for _ in range(case):
    stack.append(int(sys.stdin.readline().rstrip()))

arr = []
start = 1
answer = []
for s in stack :

    while True :
        if not arr :
            arr.append(start)
            start += 1
            answer.append("+")
        elif arr[-1] == s :
            arr.pop()
            answer.append("-")
            break
        elif arr[-1] < s :
            arr.append(start)
            answer.append("+")
            start += 1
        elif arr[-1] > s :
            print("NO")
            exit()

for ans in answer :
    print(ans)