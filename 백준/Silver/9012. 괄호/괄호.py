import sys

case = int(input())

for i in range(case):
    inputs = list(sys.stdin.readline().rstrip())
    stack = list()
    for inp in inputs :
        if stack and inp == ")" and stack[-1] == "(" :
            stack.pop()
            continue
        stack.append(inp)

    print("NO" if stack else "YES")