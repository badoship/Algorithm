import sys

case = int(input())
for _ in range(case):
    n = int(input())
    clothes = dict()

    for _ in range(n):
        temp = sys.stdin.readline().rstrip().split()

        if temp[1] in clothes : # 포함되어 있는지 확인 딕셔너리의 in 은 O(1)
           clothes[temp[1]].append(temp[0]) # 리스트로 넣어뒀기 때문에 append 사용 가능
        else :
            clothes[temp[1]] = [temp[0]] # 포함되어 있지 않다면 리스트로 해당 값 넣기

    cnt = 1

    for key in clothes :
        cnt *= len(clothes[key])+1 # 공식 (n1+1) * (n2+1) ... * (nN + 1) - (1)
        # +1을 해준 이유는 그 종류의 의상을 착용해도 되고 안해도 되기 때문이고
        # 마지막에 -1을 해준 이유는 모든 의상을 착용하지 않은 경우를 제외

    print(cnt-1)