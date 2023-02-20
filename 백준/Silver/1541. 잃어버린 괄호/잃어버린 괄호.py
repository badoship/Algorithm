nums = list(input().split("-"))
answer = 0
for i in range(len(nums)) :
    for j in nums[i].split("+"):
        if i > 0 :
            answer -= int(j)
            continue

        answer += int(j)

print(answer)