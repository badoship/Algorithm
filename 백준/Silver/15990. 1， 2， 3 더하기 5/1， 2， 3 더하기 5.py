t = int(input())
nums = list(int(input()) for _ in range(t))
print_disp = 1000000009

def make_dp(limit_n , print_disp) :
    dp = [[0,0,0] for _ in range(limit_n+1)]
    dp[1] = [1,0,0]
    dp[2] = [0,1,0]
    dp[3] = [1,1,1]
    dx = [[2,3],[1,3],[1,2]]

    for n in range(4,limit_n + 1) :
        for a in range(1,4) :
            dp[n][a-1] = dp[n-a][dx[a-1][0]-1] % print_disp + dp[n-a][dx[a-1][1]-1] % print_disp

    return dp

dp = make_dp(max(nums) , print_disp)
for num in nums :
    print(sum(dp[num]) % print_disp)