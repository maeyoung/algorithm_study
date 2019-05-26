package algorithmStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pro_9 {
	public int[] solution(int[] arr, int divisor) {
		int[] answer = {};
		List<Integer> list = new ArrayList<>(); // 배열로 하려다가 배열 길이를 첨에는 몰라서 그냥 리스트로
		
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			// divisor로 나눠지면 리스트에 추가
			if (arr[i] % divisor == 0) {
				list.add(arr[i]);
			}
		}
		
		// 리스트에 추가된 값이 없으면 그냥 answer에 -1 넣기
		if (list.size() == 0) {
			answer = new int[1];
			answer[0] = -1;
		} else {
			answer = new int[list.size()];
			
			for (int i = 0; i<list.size(); i++) {
				answer[i] = list.get(i);
			}
		}
		
		return answer;
	}
}
