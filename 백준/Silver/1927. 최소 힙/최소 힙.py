import heapq as hq
import sys

n = int(input())
heap = []
hq.heapify(heap)

for _ in range(n):
    k = int(sys.stdin.readline().rstrip())
    if k == 0 :
        print(hq.heappop(heap) if heap else 0)
        continue

    hq.heappush(heap,k)