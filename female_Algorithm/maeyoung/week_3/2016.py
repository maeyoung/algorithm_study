# 2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 
# 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요. 
# 요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT 입니다. 

# 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 TUE를 반환하세요.

# 2016년은 윤년입니당.

def solution(a, b):
    answer = ''

    week = ["SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"]
    day = 4

    month = 1
    while month != a :  # 이번달 전까지는 전체 일 수를 다 더해준다 
        if month == 2:  # 29일 까지 있는 달 
            day += 29

        if month == 1 or month == 3 or month == 5 or month == 7 or month == 8 or month == 10 or month == 12:   # 31일 까지 있는 달 
            day += 31

        if month == 4 or month == 6 or month == 9 or month == 11:   # 30일 까지 있는 달 
            day += 30
        
        month += 1      # 다음 달로 넘어가기 

    day = day + b   # 이번달 날짜 더해주기

    answer = week[day % 7] 
        
    return answer


#answer = solution(1,1) 
answer = solution(5,24)   # answer = "TUE"
print(answer)