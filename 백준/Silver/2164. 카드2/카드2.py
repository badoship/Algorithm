from collections import deque
cards = [i+1 for i in range(int(input()))]
deq = deque(cards)

while len(deq) > 1:
    deq.popleft()
    deq.append(deq.popleft())

print(deq[0])