package CH11.Date;

import java.util.Calendar;

public class CalandarEX {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance(); // 현재 시간과 날짜를 가져온다.
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1; // Month는 0부터 시작되버려서 +1을 해줘야 1부터 제대로 시작됨.
		int day = now.get(Calendar.DAY_OF_MONTH);
		int week = now.get(Calendar.DAY_OF_WEEK); // 요일을 리턴. 일요일은 1, 토요일은 7 . switch문을 활용해서 나온 숫자를 문자로 바꿀수있다.
		
		String strWeek = null;
		
		switch(week) {
		case Calendar.MONDAY : strWeek = "월"; break;
		case Calendar.TUESDAY : strWeek = "화"; break;
		case Calendar.WEDNESDAY : strWeek = "수"; break;
		case Calendar.THURSDAY : strWeek = "목"; break;
		case Calendar.FRIDAY : strWeek = "금"; break;
		case Calendar.SATURDAY : strWeek = "토"; break;
		case Calendar.SUNDAY : strWeek = "일"; break;
		}
		
		int amPm = now.get(Calendar.AM_PM);	// 현재가 AM인지 PM인지 구분하기 위함 (am:0 / pm:1)
		System.out.println(amPm);
		System.out.println(Calendar.AM);
		
		if(amPm == Calendar.AM) {
			System.out.println("오전");
		} else {
			System.out.println("오후");
		}
		
		
		System.out.println(year+"."+month+"."+day + ":" + strWeek + "요일");
		
		System.out.println(now.get(Calendar.HOUR) + ":" + now.get(Calendar.MINUTE) + ":" + now.get(Calendar.SECOND));
		//HOUR : 오전/오후 기준 (0~11까지)

		
	}

}
