package CH11.Date;

import java.text.SimpleDateFormat;
import java.util.Date;
//import java.util.*; : util 안에 있는 모든 클래스를 import 해준다.

public class DateEX {

	public static void main(String[] args) {
		Date now = new Date();	//현재 날짜와 시간을 생성
		System.out.println(now);	// Date 객체
		String strNow1 = now.toString();
		System.out.println(strNow1); // 문자열로 변경
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss"); // 단순하게 포멧형태의 객체 생성 
		String strNow2 = sdf.format(now); // Date객체를 넣어준다
		System.out.println(strNow2);
	}

}
