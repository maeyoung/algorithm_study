def solution(n, lost, reserve):
    answer = 0
    all = [1 for _ in range (n+1)]
    for i in reserve:
        all[i]+=1
    for i in lost:
        all[i]-=1
    
    if all[1] == 0:
        if all[2] == 2:
            all[1] += 1
            all[2] -= 1
    for i in range(2, len(all)-1):
        if all[i] == 0:
            if all[i-1] == 2:
                all[i-1] -= 1
                all[i] += 1
            elif all[i+1] == 2:
                all[i+1] -= 1
                all[i] += 1
    if all[n] == 0:
        if all[n-1] == 2:
            all[n] += 1
            all[n-1] -= 1
    answer = n
    for i in range(1, n+1):
        if all[i] == 0:
            answer -= 1
    
    return answer
