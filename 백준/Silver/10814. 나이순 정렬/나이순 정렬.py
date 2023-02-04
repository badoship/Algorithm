import sys

case = int(input())
ageNames = list()
for i in range(case):
    ageNames.append(list(map(str,sys.stdin.readline().rstrip().split())))

ageNames.sort(key=lambda x:int(x[0]))
for age , name in ageNames :
    print(age,name)