package CH11.String;

import java.util.Arrays;

public class ByteToStringEX {

	public static void main(String[] args) {
		String data = "자바";
		// byte는 배열 형으로 데이터를 던져준다.
		byte[] arr1 = data.getBytes();	// 기본적으로 utf-8로 인코딩
		
		System.out.println(Arrays.toString(arr1)); // toString : 받은 값을 문자형으로 바꿔준다.
		
		String str1 = new String(arr1);	// utf-8로 디코딩, utf-8은 기본값이라 생략가능()

		System.out.println(str1); // toString : 받은 값을 문자형으로 바꿔준다.

	}

}
