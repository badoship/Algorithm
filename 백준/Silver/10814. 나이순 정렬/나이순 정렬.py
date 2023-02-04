import sys

case = int(input())
ageNames = list()
for i in range(case):
    age, name = map(str,sys.stdin.readline().rstrip().split())
    ageNames.append([int(age),name])

ageNames.sort(key=lambda x:x[0])
for age , name in ageNames :
    print(age,name)