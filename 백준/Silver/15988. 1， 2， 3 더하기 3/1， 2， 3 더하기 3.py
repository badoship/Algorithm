n = int(input())
arr = list(int(input()) for _ in range(n))
disp = 1000000009
#값 -> 식 -> 개수
# 1 -> 1 -> (1)
# 2 -> 1+1 , 2 -> (2)
# 3 -> 1+1+1 , 1+2 , 2+1 , 3 -> (4)

# 1+1+1 -> 1 , 1+1 -> 1과 2의 첫번째 형태
# 1+2 -> 1 , 2 -> 1의 첫번째 형태와 2의 두번째 형태
# 2+1 -> 2 , 1 -> 위의 형태를 순서만 변경

# 4의 경우 1+1+1+1 , 1+2+1 , 1+3 의 형태

def set_dp(max_arr) :
    global disp
    dp = [0] * (max_arr+1)
    dp[1] = 1
    dp[2] = 2
    dp[3] = 4

    for i in range(4,max_arr+1) :
        dp[i] = ( dp[i-1] + dp[i-2] + dp[i-3] ) % disp

    return dp

dp = set_dp(max(arr))

for element in arr :
    print(dp[element] % disp)