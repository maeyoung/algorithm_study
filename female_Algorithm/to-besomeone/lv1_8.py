def solution(arr):
    answer = []
    # [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    for i in range(len(arr)-1):
        if arr[i] == arr[i+1]:
            arr[i] = -1

    for tmp in arr:
        if tmp != -1:
            answer.append(tmp)
    return answer