import sys
while True:
    nums = list(map(int,sys.stdin.readline().split()))

    if nums == [0,0,0]:
        break

    nums.sort()
    print("right" if nums[0] ** 2 + nums[1] ** 2 == nums[2] ** 2 else "wrong")