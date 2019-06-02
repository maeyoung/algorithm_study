def solution(arr):
    answer = []

    answer.append(arr[0])
    for i in arr:
        if i == answer[-1]:
            continue
        answer.append(i)
    
    return answer

#answer = solution([1,1,3,3,0,1,1])
answer = solution([4,4,4,3,3])
print(answer)