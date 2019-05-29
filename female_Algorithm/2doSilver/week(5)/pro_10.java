package algorithmStudy;

public class pro_10 {
	public long solution(int a, int b) {
		long answer = 0;
		int temp = 0;
		
		if (a == b) {
			return a;
		} else if (a > b) { // a가 b보다 클 경우 두 값의 순서를 바꿔준다.
			temp = b;
			b = a;
			a = temp;
		}
		
		for (int i = a; i <= b; i++) {
			answer += i;
		}
		
		return answer;
	}
}
