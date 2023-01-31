from collections import deque

n, k = map(int,input().split())
nums = list(i+1 for i in range(n))

deq = deque(nums)
print("<",end="")
while deq :
    for i in range(k-1) :
        deq.append(deq.popleft())
    print(deq.popleft(),end=", " if deq else ">")