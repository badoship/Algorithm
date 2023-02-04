import sys

case = int(input())
ageNames = list()
for i in range(case):
    ageNames.append(list(map(str,sys.stdin.readline().rstrip().split())))
    ageNames[-1].append(i)

ageNames.sort(key=lambda x:(int(x[0]),x[2]))
for age , name , _ in ageNames :
    print(age,name)