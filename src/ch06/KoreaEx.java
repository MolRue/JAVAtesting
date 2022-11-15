package ch06;

public class KoreaEx {

	public static void main(String[] args) {
		// 객체 생성
		Korea k1 = new Korea("123456-1234567", "정감자");		// 매개변수를 주지 않으면 오류발생.
		k1.name = "오감자";
//		k1.nation = "미국";
		
		System.out.println(k1.name);
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
	}

}
