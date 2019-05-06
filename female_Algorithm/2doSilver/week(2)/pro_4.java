package algorithmStudy;

import java.util.Arrays;

public class pro_4 {
	public static void main(String args[]) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		System.out.println(Arrays.toString(solution(array, commands)));
	}
	
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int cnt = 0;
        
        for (int i = 0; i< commands.length; i++) {
        	int[] smallA = new int[commands[i][1] - commands[i][0] + 1];
        	int z = 0;
        	
        	for (int j = commands[i][0] - 1; j < commands[i][1]; j ++) {
        		smallA[z++] = array[j];
        	}
        	
        	Arrays.sort(smallA);
        	
        	System.out.println("smallA : " + Arrays.toString(smallA));
        	
        	answer[cnt++] = smallA[commands[i][2]-1];
        }
        
        return answer;
    }
}
