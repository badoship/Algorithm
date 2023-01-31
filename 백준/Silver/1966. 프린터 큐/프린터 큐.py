import sys

t = int(input())
for i in range(t):
    n, m = map(int,sys.stdin.readline().rstrip().split())
    nums = list(map(int,sys.stdin.readline().rstrip().split()))
    temp = list()
    for idx in range(len(nums)):
        temp.append(nums[idx])
        nums[idx] = [idx,nums[idx]]

    temp.sort(reverse=True)

    seq = 0
    for num in temp :
        seq += 1
        isEnd = False
        while True :
            if nums[0][1] == num :
                if nums[0][0] == m :
                    print(seq)
                    isEnd = True
                    break
                nums.pop(0)
                break
            nums.append(nums.pop(0))

        if isEnd :
            break