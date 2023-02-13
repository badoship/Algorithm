from collections import deque

n, m = map(int, input().split())
graph = [[] for _ in range(n + 1)]  # 양방향 그래프 생성

for _ in range(m):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)

def bfs(graph, start):
    isVisit = [0 for _ in range(n + 1)]  # 각 노드에 대한 방문 여부
    num = [0] * (n + 1)
    q = deque()
    q.append(start)
    isVisit[start] = 1

    while q:
        idx = q.popleft()
        for i in graph[idx]:
            if not isVisit[i]:
                num[i] = num[idx] + 1
                isVisit[i] = 1
                q.append(i)

    return sum(num)


result = []
for node in range(1, n + 1):  # 1번 노드부터 끝까지

    result.append(bfs(graph, node))

print(result.index(min(result)) + 1)