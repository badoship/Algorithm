import sys

n, m = map(int, input().split())
hashMap = dict()
for _ in range(n):
    site, password = sys.stdin.readline().rstrip().split()
    hashMap[site] = password

for _ in range(m) :
    print(hashMap[sys.stdin.readline().rstrip()])