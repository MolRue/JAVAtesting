package ch07;
// 상속

public class SmartPhone extends Phone {
	// 필드
	public boolean wifi;
	
	// 생성자
	public SmartPhone(String model, String color) {
		super(model, color); // 부모 생성자를 호출한다. 
		System.out.println("자식 생성자 실행");
//		this.model = model; // 부모 필드에 초기값을 준다. = 부모필드에 접근이 가능하다.
//		this.color = color; // 위와 동일하다.
////		System.out.println("초기화를 굳이 여러번 할필요는 없다링");
	}
//	
	// 메소드
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태 변경");
	}
	public void internet() {
		System.out.println("인터넷에 연결합니다?");
	}
}
