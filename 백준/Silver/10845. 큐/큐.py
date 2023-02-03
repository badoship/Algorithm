import sys
from collections import deque
deq = deque()
for i in range(int(input())):
    command = sys.stdin.readline().split()
    c = command[0]

    if c == 'push':
        deq.append(command[1])

    if c == 'pop':
        print(-1 if not deq else deq.popleft())

    if c == 'size':
        print(len(deq))

    if c == 'empty':
        print(0 if deq else 1)

    if c == 'front':
        print(deq[0] if deq else -1)

    if c == 'back':
        print(deq[-1] if deq else -1)