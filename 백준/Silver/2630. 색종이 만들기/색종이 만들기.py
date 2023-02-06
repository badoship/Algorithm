import sys

n = int(input())
graph = [ list(map(int,sys.stdin.readline().rstrip().split())) for _ in range(n)]
answer = [0,0]
def cut(n,x,y) :
    global white, blue
    color = graph[x][y]
    for i in range(x,x+n):
        for j in range(y,y+n):
            if graph[i][j] != color :
                cut(n//2,x,y)
                cut(n//2,x+n//2,y)
                cut(n//2,x,y+n//2)
                cut(n//2,x+n//2,y+n//2)
                return

    if color == 0 :
        white += 1
        return

    blue += 1

white = blue = 0
cut(n,0,0)
print(white,blue,sep="\n")