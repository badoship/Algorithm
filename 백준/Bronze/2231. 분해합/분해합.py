n = int(input())
start = n - len(str(n)) * 9

for i in range(start,n) :
    sumVal = 0
    temp = i
    while temp > 0 :
        sumVal += temp % 10
        temp //= 10

    if n == i + sumVal :
        print(i)
        break
else :
    print(0)