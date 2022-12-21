t = int(input())
nums = list(int(input()) for _ in range(t))
print_disp = 1000000009

# 4의 경우 어떻게 처리할 것 인가?
# 1+2+1
# 1+3
# 3+1
# dp[4][1-1] = #dp[4-1][1-1]# + dp[4-1][2-1] + dp[4-1][3-1] -> -1 은 해당 리스트가 0부터 시작하기에
# 4에서의 1로 끝나는 식은 이전 1로 끝나지 않은 3 ( 4-1 ) 의 2 또는 3 에서 구할수 있음
# 위의 식은 n=4 , a=1 일 때
# dp[n][a-1] = #dp[n-a][1-1]# + dp[n-a][2-1] + dp[n-a][3-1]
# a가 2일 경우
# dp[4][2-1] = #dp[4-2][1-1]# + dp[4-2][2-1] + dp[4-2][3-1]

def make_dp(limit_n , print_disp) :
    dp = [[0,0,0] for _ in range(limit_n+1)]
    dp[1] = [1,0,0] # 1
    dp[2] = [0,1,0] # 2
    dp[3] = [1,1,1] # 3 -> 1+2 , 2+1 , 3 즉 맨 끝에가 1 또는 2로 끝남
    dx = [[2,3],[1,3],[1,2]]

    for n in range(4,limit_n + 1) :
        for a in range(1,4) :
            dp[n][a-1] = dp[n-a][dx[a-1][0]-1] % print_disp + dp[n-a][dx[a-1][1]-1] % print_disp

    return dp

dp = make_dp(max(nums) , print_disp)
for num in nums :
    print(sum(dp[num]) % print_disp)