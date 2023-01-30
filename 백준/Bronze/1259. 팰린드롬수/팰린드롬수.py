while True :
    inp = list(input())
    if inp[0] == '0' : break
    for i in range(len(inp)) :
        if inp[i] != inp[-(i+1)] :
            print("no")
            break
    else :
        print("yes")