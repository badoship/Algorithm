def solution(n):
    answer = []
    start = 2
    while n > 1 :
        if n % start == 0 :
            answer.append(start)
            n //= start
            continue
            
        start += 1
        
    return sorted(list(set(answer)))