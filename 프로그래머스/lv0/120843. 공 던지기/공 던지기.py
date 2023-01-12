from collections import deque
def solution(numbers, k):
    q = deque(numbers)
    for i in range(k-1) :
        for j in range(2) :
            q.append(q.popleft())
            
    return q[0]