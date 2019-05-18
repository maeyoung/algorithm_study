package algorithmStudy;

import java.util.ArrayList;
import java.util.List;

public class pro_5 {
	public static void main(String[] args) {
        List<Integer> lostL = new ArrayList<>();
		lostL.add(1);
		
		int n = 5;
		int[] lost = {3, 4};
		int[] reserve = {3, 4, 5};
		
		System.out.println(solution(n , lost, reserve));
	}
    public static int solution(int n, int[] lost, int[] reserve) {
    	/*int lostLength = lost.length;
        int answer = n - lostLength;*/
    	int answer = 0;
        List<Integer> lostL = new ArrayList<>();
        List<Integer> reserveL = new ArrayList<>();
        List<Integer> answerL = new ArrayList<>();
        
        // list 에 lost, reserve 배열 옮겨 담기 > 이래야 내가 검색이나 그런 걸 더 쉽게 할 수 있을 거 같았다.
        for (int i = 0; i<lost.length; i++) {
        	lostL.add(lost[i]);
        }
        
        for (int i = 0; i<reserve.length; i++) {
        	reserveL.add(reserve[i]);
        }
        
        // 체육복 여벌도 있고, 도난도 당한 학생들을 list에서 삭제
        // 진짜 삭제 (.remove(index))하면 list 사이즈가 바뀌어 lost/reserve 리스트 값이 겹치는 애들을 정확히 비교해 처리해줄 수 없음
        // 그래서 값이 겹칠 경우 remove가 아닌 0값을 대신 셋팅해주어 처리 >> 두 경우 모두의 학생은 그냥 학생과 같아졌음.
        for (int i : reserveL) {
        	if (lostL.indexOf(i) >= 0) {
        		reserveL.set(reserveL.indexOf(i), 0);
        		lostL.set(lostL.indexOf(i), 0);
        	}
        }
        
        System.out.println("size : " + reserveL.size());
        
        for (int i = 1; i <= n; i++) {
        	System.out.println("i : " + i + ", i위치 : " + reserveL.indexOf(i));
        	
        	// 여벌의 옷이 있는 학생들은 (index값이 없는경우 -1을 반환)
        	if ( reserveL.indexOf(i) >= 0) {
        		answer++; // 여벌의 옷이 있는 학생 수를 ++
        		
        		// 
        		/*if (lostL.indexOf(i) >= 0) {
        			System.out.println("i : " + i);

        		} else*/ 
        		if (lostL.indexOf(i - 1) >= 0) { // 여벌의 옷이 있는 학생 앞 학생이 체육복 도난당했으면
        			System.out.println("i-1 : " + (i-1));
        			// answerL.add(i-1); i값보다 값이 작은 경우 이미 for문을 돌았기 때문에 이거 필요 없음
        			answer++; // 여벌 옷을 받았으므로 학생 수를 ++
        			lostL.remove(lostL.indexOf(i - 1)); // 얘는 indexOf를 이용해 위치 검색을 하니까 remove해도 상관없다.
        		} else if (lostL.indexOf(i + 1) >= 0) { // 여벌의 옷이 있는 학생 뒷 학생이 체육복 도난당했으면
        			System.out.println("i+1 : " + (i+1));
        			// 이미 여벌 옷을 받았다는 뜻
        			// 이걸 안해주면 여벌옷 받아서 이미 수가 ++ 되었는데 추가적으로 보통 학생으로 체크되어 수가 ++될 수있다.
        			answerL.add(i+1);
        			answer++; // 여벌 옷을 받았으므로 학생 수를 ++
        			lostL.remove(lostL.indexOf(i + 1)); // 얘는 indexOf를 이용해 위치 검색을 하니까 remove해도 상관없다.
        		}
        		
        	// 옷을 도난 당한 학생이 아니고, 이미 여벌 옷 가진 학생한테 옷 받은 학생도 아닐 경우	
        	} else if (lostL.indexOf(i) < 0 && answerL.indexOf(i) < 0) {
        		answer++; // 일반 학생으로 판단해서 학생 수를 ++
        	}
        	
        	System.out.println("답 : " + answer);
        }
        
        // 실패한 시도.. 
        /*for (Integer i : reserveL) {
        	System.out.println("i : " + i);
        	if ( lostL.indexOf(i) >= 0 ) {
        		System.out.println(i + "는 여벌도 있고, 도둑도 맞고~");
        		reserveL.set(lostL.indexOf(i), 0);
        		lostL.remove(lostL.indexOf(i));
        		answer++;
        	} else if ( lostL.indexOf(i-1) >= 0 ) {
        		System.out.println((i-1) + "(이)가 체육복을 도둑 맞아서 " + i + "(이)가 도와줘요!");
        		lostL.remove(lostL.indexOf(i-1));
        		answer++;
        	} else if ( lostL.indexOf(i+1) >= 0 ) {
        		System.out.println((i+1) + "(이)가 체육복을 도둑 맞아서 " + i + "(이)가 도와줘요!");
        		lostL.remove(lostL.indexOf(i+1));
        		answer++;
        	}
            System.out.println("answer : " + answer);
        }*/
        
        return answer;
    }
}
