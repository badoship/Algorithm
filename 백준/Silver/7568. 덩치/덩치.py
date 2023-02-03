n = int(input())
students = list()
for _ in range(n):
    students.append(list(map(int, input().split())))

for sh, sk in students :
    rank = 1
    for dh, dk in students :
        if sh < dh and sk < dk :
            rank+=1

    print(rank)