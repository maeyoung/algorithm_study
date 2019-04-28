package algorithmStudy;

import java.util.Arrays;

public class pro_2 {
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		
		Arrays.sort(participant);
		Arrays.sort(completion);

		for (int i = 0; i < completion.length; i++) {
			String name = completion[i];
			
			for (int j = 0; j < participant.length; j++) {
				if (name.equals(participant[j])) {
					participant[j] = null;
					break;
				}
			}
		}
		
		for (int i = 0; i < participant.length; i++) {
			if (participant[i] != null) {
				answer = participant[i];
				break;
			}
		}

		return answer;
	}
}
