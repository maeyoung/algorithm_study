package algorithmStudy;

import java.util.ArrayList;
import java.util.Arrays;

public class pro_3 {
	public static void main(String args[]) {
		int[] array = {1,3,2,4,2};
		System.out.println(Arrays.toString(solution(array)));
	}
	
    public static int[] solution(int[] answers) {
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int oneCnt = 0;
        int twoCnt = 0;
        int threeCnt = 0;
        ArrayList<Integer> array = new ArrayList<>();
        
        for (int i = 0; i < answers.length; i++) {
        	if (answers[i] == one[i%one.length]) {
        		oneCnt++;
        	}
        	
        	if (answers[i] == two[i%two.length]) {
        		twoCnt++;
        	}
        	
        	if (answers[i] == three[i%three.length]) {
        		threeCnt++;
        	}
        }

        if (oneCnt > twoCnt) {
        	if (oneCnt > threeCnt) {
        		array.add(1);
        	}
        	else if (threeCnt > oneCnt) {
        		array.add(3);
        	}
        } else if (oneCnt == twoCnt) {
        	if (oneCnt > threeCnt) {
        		array.add(1);
        		array.add(2);
        	}
        	else if (threeCnt > oneCnt) {
        		array.add(3);
        	}
        	else if (threeCnt == oneCnt) {
        		array.add(1);
        		array.add(2);
        		array.add(3);
        	}
        } else if (twoCnt > oneCnt) {
        	if (twoCnt > threeCnt) {
        		array.add(2);
        	} else if (threeCnt > twoCnt) {
        		array.add(3);
        	}
        }

        int[] answer = new int[array.size()];
        
        for (int i = 0; i < array.size(); i++) {
        	answer[i] = array.get(i);
        }
        
        return answer;
    }
}
