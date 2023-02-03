import sys

n, m = map(int,input().split())
cards = list(map(int, sys.stdin.readline().split()))
cards.sort(reverse=True)
maxVal = 0
for i in range(n-2) :
    for j in range(i+1,n-1) :
        for k in range(j+1,n) :

            if cards[i] + cards[j] + cards[k] > m :
                continue

            maxVal = max(maxVal ,cards[i] + cards[j] + cards[k])

print(maxVal)