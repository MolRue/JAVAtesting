package CH11.Date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateOperEX2 {

	public static void main(String[] args) {
		// 데이터 포멧 형태
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
		// 특정 날짜 지정
		LocalDateTime startDateTime = LocalDateTime.of(2022, 1, 1, 0, 0, 0);	// 2021년 1월 1일 0시 0분 0초
		System.out.println("시작일: " + startDateTime.format(dtf));
		
		LocalDateTime endDateTime = LocalDateTime.of(2021, 12, 31, 0, 0, 0);	// 2021년 12월 31일 0시 0분 0초
		System.out.println("종료일: " + endDateTime.format(dtf));
		
		if (startDateTime.isBefore(endDateTime)) { //  isBefore : 이전 날짜인지 구하는것
			System.out.println("진행중 입니다.");
		} else if (startDateTime.isEqual(endDateTime)){	// isEqual : 같은 날짜인지 물어보는것
			System.out.println("종료합니다.");
		} else if (startDateTime.isAfter(endDateTime)){	// isAfter : 이후 날짜 인가?
			System.out.println("종료했습니다.");
		}

	}

}
