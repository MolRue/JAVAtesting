package ch06;

import java.util.Calendar;

public class WeekEX {

	public static void main(String[] args) {
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		
		// 요일을 숫자로 얻는다.
		int week = cal.get(Calendar.DAY_OF_WEEK);

		// 숫자를 열거상수로 변환해서 변수에 대입.
		switch(week) {
		case 1: today = Week.SUNDAY; break;
		case 2: today = Week.MONDAY; break;
		case 3: today = Week.TUSEDAY; break;
		case 4: today = Week.WHDNESDAY; break;
		case 5: today = Week.THURSDAY; break;
		case 6: today = Week.FRIDAY; break;
		case 7: today = Week.SATURDAY; break;
		}
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일입니다.^오^");
		} else {
			System.out.println("일요일이 아닙니다..ㅠㅠ");
		}
	}

}
