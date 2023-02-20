n = int(input())

val = 1
for i in range(2,n+1):
    val *= i

cnt = 0

while val % 10 == 0 :
    val //= 10
    cnt += 1

print(cnt)