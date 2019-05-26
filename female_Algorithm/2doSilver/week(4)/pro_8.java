package algorithmStudy;

import java.util.ArrayList;
import java.util.List;

public class pro_8 {
	public int[] solution(int []arr) {
        int[] answer = {};
        int cnt = 0;
        List<Integer> list = new ArrayList<>();
        list.add(cnt, arr[cnt]); // 먼저 맨 처음 값을 리스트에 추가; 배열로 하려다가 배열 길이를 첨에는 몰라서 실패
       
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        
        for (int i = 1; i < arr.length; i++) {
        	// i = 1일 때, 리스트에 추가한 0번째 값과 1번째 값이 안같으면 ++cnt해서 리스트에 추가
        	// 두 값이 같으면 그냥 통과
        	if (list.get(cnt) != arr[i]) {
        		list.add(++cnt, arr[i]);
        	}
        }
        
        answer = new int[list.size()];
        
        for (int i = 0; i<list.size(); i++) {
        	answer[i] = list.get(i);
        }

        return answer;
	}
}
