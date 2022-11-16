package ch06;

public class This {
	//필드
	String model;
	int speed;
	
	This(String model){
		this.model = model;
		// 필드에 할당해줘야 하는 값과 매개변수 값이 같다면 필드 데이터에는 this 를 붙여줘야 한다.
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	void run() {
		this.setSpeed(100); // 같은 클래스 간의 메소드 호출시 this 생략 가능
		System.out.println(this.model + "," + this.speed);	// this 생략 가능
	}
}
