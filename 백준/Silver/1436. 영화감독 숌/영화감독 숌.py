n = int(input())
nums = list()
i = 666
while len(nums) < n:
    cnt = 0
    temp = i
    while temp > 0 :
        if temp % 10 == 6 :
            cnt += 1
        else :
            cnt = 0

        if cnt == 3 :
            nums.append(i)
            break

        temp //= 10

    i += 1

print(nums[n-1])