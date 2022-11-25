package CH11.Date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateOperEX {

	public static void main(String[] args) {
		// 현재 날짜 시간 생성.
		LocalDateTime now = LocalDateTime.now();	
		// 데이터 포멧 형태
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
		now.format(dtf);
		
		System.out.println("현재시간: " + now.format(dtf));
		
		//LocalDateTime을 이용한 날짜 연산
		
		LocalDateTime result1 = now.plusYears(77);
		System.out.println(result1.format(dtf));
		
		LocalDateTime result2 = now.minusMonths(15);
		System.out.println(result2.format(dtf));
		
		LocalDateTime result3 = now.plusDays(3000);
		System.out.println(result3.format(dtf));
		
		LocalDateTime result4 = now.plusMinutes(10000);
		System.out.println(result4.format(dtf));
		
		LocalDateTime result5 = now.plusHours(10000);
		System.out.println(result5.format(dtf));
	}

}
