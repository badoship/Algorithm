n = int(input())
nSums = [1,2,4,7]
for i in range(4,12) :
    nSums.append(nSums[i-1] + nSums[i-2] + nSums[i-3])

for _ in range(n) :
    print(nSums[int(input())-1])