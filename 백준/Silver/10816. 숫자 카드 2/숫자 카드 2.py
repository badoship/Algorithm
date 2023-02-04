import sys

sgCase = int(input())
sgCards = list(map(int,sys.stdin.readline().rstrip().split()))

cardHashMap = dict()

for sgCard in sgCards :
    if cardHashMap.get(sgCard):
        cardHashMap[sgCard] += 1
    else :
        cardHashMap[sgCard] = 1

targetCase = int(input())
targetCards = list(map(int,sys.stdin.readline().rstrip().split()))

for targetCard in targetCards :
    print(cardHashMap[targetCard] if cardHashMap.get(targetCard) else 0,end =" ")
