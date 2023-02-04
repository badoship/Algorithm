import sys
case = int(input())
stack = list()
for _ in range(case):
    cmd = sys.stdin.readline().rstrip().split()
    c = cmd[0]
    if len(cmd) == 2:
        x = int(cmd[1])

    if c == 'push':
        stack.append(x)

    if c == 'pop':
        print(stack.pop() if stack else -1)

    if c == 'size':
        print(len(stack))

    if c == 'empty':
        print(0 if stack else 1)

    if c == 'top':
        print(stack[-1] if stack else -1)
