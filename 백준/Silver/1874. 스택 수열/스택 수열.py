import sys

case = int(input())
stack = []
start = 1
answer = []
for _ in range(case):
    num = int(sys.stdin.readline().rstrip())

    while not stack or stack[-1] < num :
        answer.append("+")
        stack.append(start)
        start += 1

    if stack[-1] == num :
        answer.append("-")
        stack.pop()
    else :
        print("NO")
        exit()

for ans in answer :
    print(ans)