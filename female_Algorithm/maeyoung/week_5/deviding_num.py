def solution(arr, divisor):
    answer = []
    
    arr.sort()
    for i in arr:
        if i % divisor == 0:
            answer.append(i)
        
    if not answer:
        answer = [-1]
    
    return answer

answer = solution([5,9,7,10], 5)
print(answer)