n = int(input())
array = list(map(int,input().split()))

def LIS(n) : #Longest Increasing Subsequence
    dp = [1] + [0 for _ in range(n-1)]
    for i in range(1,n) :
        for j in range(i) :
            if array[i] > array[j] and dp[i] < dp[j] : # 기준 값이 이전 값보다 크고 dp[i] 보다 dp[j] 가 크다면
                dp[i] = dp[j]
        dp[i] += 1

    return dp

#LIS 를 순차적으로 구해줬으므로 리스트를 구할땐 순서를 반대로 뒤집어서 max_val 기준으로 리스트에 담는다.
def get_list(max_val) :
    temp = []
    for i in range(n-1,-1,-1) :
        if dp[i] == max_val :
            temp.append(array[i])
            max_val -= 1

    temp.reverse()
    return ' '.join(str(i) for i in temp)

dp = LIS(n)
print(max(dp))
print(get_list(max(dp)))