import sys

k = int(input())
nums = list()
for i in range(k) :
    num = list(map(int,sys.stdin.readline().strip().split()))
    nums.append(num)

nums.sort(key = lambda x : (x[1],x[0]))

for x , y in nums :
    print(x , y)