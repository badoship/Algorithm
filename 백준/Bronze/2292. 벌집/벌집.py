num = int(input())
cnt = 1
start = 1
while num > start :
    start += 6 * cnt
    cnt += 1

print(cnt)