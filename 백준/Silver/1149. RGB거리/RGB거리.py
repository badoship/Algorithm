import sys

input = lambda : sys.stdin.readline().rstrip()

n = int(input())
arr = list(list(map(int,input().split())) for _ in range(n))

# ex)
# 6
# 30 19 5
# 64 77 64
# 15 19 97
# 4 71 57
# 90 86 84
# 93 32 91

# 30(1) -> 64(3) -> 15(1) -> 57(3) -> 86(2) -> 91(3) -> 343
# 19(2) -> 64(1) -> 19(2) -> 4(1) -> 84(3) -> 32(2) -> 222
# 5(3) -> 64(1) -> 19(2) -> 4(1) -> 84(3) -> 32(2) -> 208

# 해당 방식은 처음 방향을 설정한 그리드와 다를게 없음
# 백트레킹으로 모든 값을 비교한다면 시간초과 예상 1000 ^ 3
# 다음 값을 지정하고 이전 값의 min 값 비교
def get_dist(n) :
    dp = [[0,0,0] for i in range(n)]
    dp[0] = [arr[0][0],arr[0][1],arr[0][2]]
    for i in range(1,n) :
        dp[i][0] = min( dp[i-1][1] , dp[i-1][2] ) + arr[i][0]
        dp[i][1] = min( dp[i-1][0] , dp[i-1][2] ) + arr[i][1]
        dp[i][2] = min( dp[i-1][0] , dp[i-1][1] ) + arr[i][2]

    return min(dp[n-1])

print(get_dist(n))