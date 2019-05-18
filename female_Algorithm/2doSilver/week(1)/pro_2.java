package algorithmStudy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class pro_2 {
	public static void main(String[] args) {
		String[] n = { "leo", "kiki", "eden", "leo" };
		String[] n2 = { "leo", "eden", "kiki" };
		String a = solution(n, n2);
	}

	public static String solution(String[] participant, String[] completion) {
		String answer = "";

		Arrays.sort(participant);
		Arrays.sort(completion);

		/*
		 * for (int i = 0; i < completion.length; i++) { String name = completion[i];
		 * 
		 * for (int j = 0; j < participant.length; j++) { if
		 * (name.equals(participant[j])) { participant[j] = null; break; } } }
		 * 
		 * for (int i = 0; i < participant.length; i++) { if (participant[i] != null) {
		 * answer = participant[i]; break; } }
		 */

		HashMap<String, Integer> parti = new HashMap<>();
		HashMap<String, Integer> compl = new HashMap<>();

		for (int i = 0; i < participant.length; i++) {
			parti.put(participant[i], i);
		}

		for (int i = 0; i < completion.length; i++) {
			compl.put(completion[i], i);
		}

		for (int i = 0; i < parti.size(); i++) {
			String name = participant[i];

			Integer a = parti.get(name);
			Integer b = compl.get(name);

			System.out.println(a + ", " + b);

			if (!a.equals(b)) {
				return name;
			}
		}

		return answer;
	}
}
