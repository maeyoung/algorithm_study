package algorithmStudy;

public class pro_6 {
	public static void main(String[] args) {
		System.out.println(solution(1, 7));
	}

	public static String solution(int a, int b) {
		// dataFormat이랑 Calender 써서 하는 거 (42~55ms)
		/*//		import java.text.DateFormat;
		//		import java.text.ParseException;
		//		import java.text.SimpleDateFormat;
		//		import java.util.Calendar;
		//		import java.util.Date;
		String answer = "";
		String[] days = { "", "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

		String inputDate = String.format("2016%02d%02d", a, b);

		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");

		Date date = null;
		try {
			date = dateFormat.parse(inputDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Calendar calendar = Calendar.getInstance();

		calendar.setTime(date);

		return days[calendar.get(Calendar.DAY_OF_WEEK)];*/
		
		// 저거 없이 하는 거 (2ms 이하)
		String answer = "";
		int[] month = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		// 5월 24일이 들어온 경우 1~4월까지 일수 + 24를 해줄 수 있게 하는 것
		for (int i=1; i<a; i++) {
			System.out.println(i);
			b += month[i];
		}
		
		// 1월 1일이 금요일이라고 주어졌으니 그걸 기준으로 b%7이 1일 때 FRI이고, 0일 때 THU라고 보고 하는 거
		// 그래서 들어온 값의 2016년 총 일수에다가 7을 나눠 그 나머지로 switch문 돌려서 체크
		switch (b % 7) {
		case 1:
			answer = "FRI";
			break;
		case 2:
			answer = "SAT";
			break;
		case 3:
			answer = "SUN";
			break;
		case 4:
			answer = "MON";
			break;
		case 5:
			answer = "TUE";
			break;
		case 6:
			answer = "WED";
			break;
		case 0:
			answer = "THU";
			break;

		default:
			break;
		}
		
		return answer;
	}
}
