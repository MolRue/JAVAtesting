package CH11.String;

public class StringBuilderEX {

	public static void main(String[] args) {
		String data = new StringBuilder()
				.append("DEF")		// 문자열 끝에다 붙인다.
				.insert(0 , "abc")	// 문자열에서 지정한 인덱스 번호에 넣는다.
				.delete(3, 4)		// 문자열 일부를 삭제 (시작위치, 끝위치)
				.toString();		// 완성된 문자열을 String 타입으로 리턴해준다.
		// 간단한건 연산자로 해결하지만, StringBuilder도 사용하긴 한다!
		System.out.print(data);

	}

}
