import heapq
import sys

n = int(input())
heap = []

for _ in range(n):
    x = int(sys.stdin.readline().rstrip())

    if x == 0 :
        print(heapq.heappop(heap)[1] if heap else 0)
        continue

    heapq.heappush(heap,(abs(x),x))