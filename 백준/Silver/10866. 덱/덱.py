import sys
from collections import deque

cmdCase = int(input())
deq = deque()


def dequeMethod(c):
    if c == "push_front":
        deq.appendleft(int(cmd[1]))
    if c == "push_back":
        deq.append(int(cmd[1]))
    if c == "pop_front":
        print(deq.popleft() if deq else -1)
    if c == "pop_back":
        print(deq.pop() if deq else -1)
    if c == "size":
        print(len(deq))
    if c == "empty":
        print(0 if deq else 1)
    if c == "front":
        print(deq[0] if deq else -1)
    if c == "back":
        print(deq[-1] if deq else -1)


for _ in range(cmdCase):
    cmd = sys.stdin.readline().split()
    dequeMethod(cmd[0])
