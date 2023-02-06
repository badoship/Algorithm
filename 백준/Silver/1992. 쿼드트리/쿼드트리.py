import sys

n = int(input())
video = list( list(sys.stdin.readline().rstrip()) for _ in range(n))

def cut(x,y,n):
    global answer
    color = video[x][y]
    for i in range(x,x+n):
        for j in range(y,y+n):
            if color != video[i][j]:
                answer += "("
                cut(x,y,n//2)
                cut(x,y+n//2,n//2)
                cut(x+n//2,y,n//2)
                cut(x+n//2,y+n//2,n//2)
                answer += ")"
                return

    answer += color

answer = ""
cut(0,0,n)
print(answer)