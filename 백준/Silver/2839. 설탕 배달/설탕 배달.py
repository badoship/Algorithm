n = int(input())

nums = [2000 for _ in range(n+1)]
nums[3] = 1
if n > 4 :
    nums[5] = 1

for i in range(6,n+1) :
    nums[i] = min(nums[i-3] + 1 , nums[i-5]+1)

print(nums[n] if nums[n] < 2000 else -1)