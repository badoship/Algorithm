n = int(input())


def get_steps(n):
    dp = [[0 for _ in range(10)] for _ in range(n)]
    dp[0] = [0, 1, 1, 1, 1, 1, 1, 1, 1, 1]
    # dp[1] (두번째 계단은) [1, 1, 2, 2, 2, 2, 2, 2, 2, 1]
    # 0과 9를 제외한 1~8 은 2개씩 생성,
    # 0 -> -1 , 1 중 -1 을 제외한 1만 가능
    # 9 -> 8 , 10 중 10 을 제외한 8만 가능
    print_disp = 1000000000
    for i in range(1, n):
        for j in range(10):
            if j > 0:  # j-1 인덱스
                dp[i][j] += dp[i - 1][j - 1] % print_disp
            if j < 9:  # j+1 인덱스
                dp[i][j] += dp[i - 1][j + 1] % print_disp
    return sum(dp[n - 1]) % print_disp


print(get_steps(n))