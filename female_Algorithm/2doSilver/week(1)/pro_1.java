package algorithmStudy;

public class pro_1 {
	public static void main (String args[]) {
		
		System.out.println("гу : " + add(11));
	}
	
	public static long add (int num) {
		long answer = 0;
		
		for (int i = 2; i <= num; i++) {
			int j;
			
			for (j = 2; j < i; j++) {
				if (i % j == 0)
					break;
			}
			
			if (j == i)
				answer += i;
				
		}
		
		return answer;
	}
}
