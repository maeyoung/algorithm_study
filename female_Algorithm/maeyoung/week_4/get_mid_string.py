def solution(s):
    answer = ''
    
    length = len(s)
    half = length // 2
    if length % 2 == 0:
        answer = s[half-1:half+1]
    else:
        answer = s[half]
        
    
    return answer

answer = solution("abcde")
print(answer)