def solution(a, b):
    answer = 0
    
    if a > b: 
        a, b = b, a

    print(a,b)
    
    while a <= b:
        answer = answer + a
        a = a + 1
        
    return answer

answer = solution(5, 3)
print(answer)