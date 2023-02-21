n = int(input())
dp = [0,1,2,3]

for i in range(4,n+1):
    if i ** 0.5 % 1 == 0 :
        dp.append(1)
        continue
    minVal = 4
    j = 1
    while (j**2) <= i:
        minVal = min(minVal,dp[i-j**2])
        if minVal == 1 :
            break
        j += 1

    dp.append(minVal+1)

print(dp[n])