def solution(numbers):
    answer = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"]
    for i in range(len(answer)) :
        numbers = numbers.replace(answer[i],str(i))
    return int(numbers)