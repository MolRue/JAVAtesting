package CH11.String;

import java.util.StringTokenizer;

public class StringTokenEX {

	public static void main(String[] args) {
		String data1 = "고길동 & 고희동 , 도우너 "; // 구분자 : 문자열을 구분하는 도구
		String[]arr = data1.split("&|,");	// 해석 : & 또는 , = 해당 문자를 만나면 글자를 끊어주겠다! 라는 뜻.
		
		for (String token : arr) {
			System.out.println(token);
		}
		
		String data2 = "둘리 / 또치 / 마이콜 ";
		StringTokenizer st =new StringTokenizer(data2, "/");
		System.out.println(st.countTokens()); // → 현재 토큰의 갯수를 출력해준다.
		
		while (st.hasMoreTokens()) { 		// st 안에 나열되어있는 토큰이 있냐고 물어보는것!
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}
