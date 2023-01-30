a, b = map(int, input().split())


def gcd(a, b):
    if b > a:
        a, b = b, a

    while b > 0:
        a, b = b, a % b

    return a


gcdVal = gcd(a, b)
print(gcdVal, a * b // gcdVal, sep="\n")