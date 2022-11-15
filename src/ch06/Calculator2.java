package ch06;
// JAVA 에서는 class 밖에 변수를 쓰는것이 허용되지 않는다. 
// 전역변수를 쓰려면 class 안에 static 을 붙이자.
public class Calculator2 {
	// 1. 필드 선언 
	static double pi = 3.14159;

	static String model = "calc1";
	static String number = "1";
	static String info;
	
	// this : 이 객체. static 이 붙은 경우엔 this를 붙이지 않아도 작동한다. 붙여봣자 에러난다.
	// ↓static 블록 : static 필드에 대한 초기화 작업이 필요할 때 사용.
	static {
		info = model + "_" + number;   // calc1_1
	}
	
	// 2. 메소드
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus (int x, int y) {
		return x - y;
	}
}
