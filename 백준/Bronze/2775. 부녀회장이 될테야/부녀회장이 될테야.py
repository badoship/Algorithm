t = int(input())
row = list()
col = list()
for _ in range(t):
    row.append(int(input()))
    col.append(int(input()))

maxRow = max(row)
maxCol = max(col)

temp = [[i+1 for i in range(maxCol)] for _ in range(maxRow+1)]

for i in range(maxRow) :
    for j in range(1,maxCol) :
        temp[i+1][j] = temp[i][j] + temp[i+1][j-1]

for i in range(t) :
    print(temp[row[i]][col[i]-1])