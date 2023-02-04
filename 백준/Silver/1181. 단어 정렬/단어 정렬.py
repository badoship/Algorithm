import sys

case = int(input())
words = []
for i in range(case):
    words.append(sys.stdin.readline().rstrip())

words = list(set(words))
words.sort(key=lambda x:(len(x),x))
for word in words :
    print(word)