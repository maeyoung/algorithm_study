def solution(answers):
    answer = []
    no1_s = [1, 2, 3, 4, 5] # 12345
    no2_s = [2, 1, 2, 3, 2, 4, 2, 5] # 21232425
    no3_s = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5] # 3311224455
    cnt = [[0,1],[0,2],[0,3]]
    for i in range(len(answers)):
        if(answers[i] == no1_s[i%5]):
            cnt[0][0] += 1
        if(answers[i] == no2_s[i%8]):
            cnt[1][0] += 1
        if(answers[i] == no3_s[i%10]):
            cnt[2][0] += 1

    if(cnt[0][0]>cnt[1][0]) and (cnt[0][0]>cnt[2][0]):
        answer.append(1)
    elif(cnt[1][0]>cnt[0][0]) and (cnt[1][0]>cnt[2][0]):
        answer.append(2)
    elif(cnt[2][0]>cnt[0][0]) and (cnt[2][0]>cnt[1][0]):
        answer.append(3)
    else:
        cnt.sort()
        answer = [cnt[0][1], cnt[1][1], cnt[2][1]]

    
    return answer