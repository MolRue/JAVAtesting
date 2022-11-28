package CH11.Format;

import java.util.regex.Pattern;

public class PatternEX {

	public static void main(String[] args) {
		/*
		 02-000-0000
		 010-0000-0000
		 이런 형태로 만들겠다! 란뜻.
		 */
		String regExp = "(010|02)-\\d{3,4}-\\d{4}"; 	// 패턴을 넣을 문자열, 전화번호 체크  \ 이스케이프 문자열을 하나씩 넣어줘야 오류가 안걸림.
		String data = "010-1121-4567";
				
		boolean result = Pattern.matches(regExp, data);	// 검증하고 싶은 데이터(data)를 Pattern 의 maches함수를 통해 검증한다. 검증 기준은 regExp
		System.out.println(result);						// boolean 값으로 출력하면 true / false 출력!

		regExp = "\\w+@\\w+\\.w+(\\.\\w+)?"; 	// 문자열을 잘 인식하기 어려우므로 \ 를 더 붙여준다(이스케이프 문자열)
		String data2 = "ghost@gmail.com";		//????????????이건 뭔?
		
		boolean result2 = Pattern.matches(regExp, data2);
		System.out.println(result2);
		
	}

}
