import sys

n = int(input())
array = list(map(int,sys.stdin.readline().rstrip().split()))

def get_seq_max_val(n) :
    answer = [array[0]]
    for i in range(n-1) :
        answer.append(max( answer[i] + array[i+1] , array[i+1] ))
        #현재값 + 다음값 과 다음값 비교
    return max(answer)

print(get_seq_max_val(n))
