from itertools import cycle

def solution(answers):
    answer = []

    a = [1, 2, 3, 4, 5]
    b = [2, 1, 2, 3, 2, 4, 2, 5]
    c = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    score_list = [0,0,0]

    for ans_a, ans_b, ans_c, real_ans in zip(cycle(a), cycle(b), cycle(c), answers):
        if ans_a == real_ans: score_list[0] += 1
        if ans_b == real_ans: score_list[1] += 1
        if ans_c == real_ans: score_list[2] += 1

    for who, score in enumerate(score_list):
        if score == max(score_list):
            answer.append(who+1)

    return answer




answer = solution([1,2,3,4,5])
#answer = solution([1,3,2,4,2])
print(answer)