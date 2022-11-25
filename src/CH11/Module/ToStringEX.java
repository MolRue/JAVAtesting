package CH11.Module;

public class ToStringEX {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("삼성전자", "안드로이드");
		
		// toString: 객체의 문자 정보를 리턴을 한다.
		// @5ca881b5: 뒤에 있는 이상한 숫자는 객체를 나타내는 16진수의 해시코드 이다.
		// toString 은 override를 안해주면 단순하게 문자값만 리턴해준다. 
		// 오버라이드를 해서 사용할때는 특별하게 나타내고 싶은 문자 정보를 리턴해준다.
		String strObj = myPhone.toString();
		System.out.println(strObj);
		// 출력내용 : 패키지.클래스.오브젝트
		System.out.println(strObj);
		System.out.println(myPhone);
		
		try {
			int value = Integer.parseInt("1oo");
		} catch(NumberFormatException e) {
			System.err.println("에러");
		}
	}

}
