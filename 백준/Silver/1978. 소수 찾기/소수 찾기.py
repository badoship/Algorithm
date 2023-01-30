import sys

def getPrimes(maxNum) :
    primes = [1 for _ in range(maxNum+1)]
    primes[0] = 0
    primes[1] = 0
    for i in range(2,int((maxNum+1) ** 0.5)+1) :
        if primes[i] :
            for j in range(i*2,maxNum+1,i) :
                primes[j] = 0
    return primes

def calcPrimes(nums):
    cnt = 0
    for i in nums:
        if primes[i]:
            cnt += 1

    return cnt

n = int(input())
nums = list(map(int,sys.stdin.readline().rstrip().split()))
primes = getPrimes(max(nums))
cnt = calcPrimes(nums)
print(cnt)