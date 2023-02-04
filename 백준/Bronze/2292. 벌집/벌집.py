num = int(input())
cnt = 1
start = 1
plus = 6
while num > start :
    cnt += 1
    start += plus
    plus += 6

print(cnt)