def solution(participant, completion):
    answer = ''
    
    participant.sort()
    print(participant)
    completion.sort()
    print(completion)

    i = 0
    no_answer = 1
    for name in completion:
        if (participant[i] != completion[i]):
            answer = participant[i]
            no_answer = 0
            break
        i = i+1

    if no_answer:
        answer = participant[-1]
    
    return answer

#answer = solution(["leo", "kiki", "eden"], ["eden", "kiki"])
not_finished_player = solution(["marina", "josipa", "nikola", "vinko", "filipa"], ["josipa", "filipa", "marina", "nikola"])
print(not_finished_player)