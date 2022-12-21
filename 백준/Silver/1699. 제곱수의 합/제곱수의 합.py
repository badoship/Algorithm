n = int(input())
limit = 100000


def get_min_term(n):
    squars = [i * i for i in range(1, int(limit ** 0.5) + 1)]
    dp = [0] * (n + 1)
    for i in range(1, n + 1):
        arr = []
        for j in squars:
            if j > i:
                break
            arr.append(dp[i - j])
        dp[i] = min(arr) + 1

    return dp[n]


print(get_min_term(n))
