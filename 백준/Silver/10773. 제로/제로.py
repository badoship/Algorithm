import sys

k = int(input())
nums = list()
for i in range(k) :
    num = int(sys.stdin.readline())
    if num == 0 :
        nums.pop()
    else :
        nums.append(num)

print(sum(nums))