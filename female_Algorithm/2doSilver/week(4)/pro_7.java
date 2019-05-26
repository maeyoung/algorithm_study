package algorithmStudy;

public class pro_7 {
  public String solution(String s) {
      String answer = "";
      
      int length = s.length();
      int a = length / 2;
      
      // substring : start <= x < end
      if (length % 2 == 0) {
    	  // 길이가 짝수면 딱 반반, 중간으로 나눠지니까 중간값-1에서 중간값까지 뽑아내야 하니까
    	  answer = s.substring(a-1, a+1);
      } else {
    	  // 길이가 홀수면 2로 나눈 값만을 뽑아내야 하니까
    	  answer = s.substring(a, a+1);
      }
      
      return answer;
  }
}
