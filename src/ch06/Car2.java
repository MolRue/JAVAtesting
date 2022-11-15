package ch06;

public class Car2 {
	
	//인스턴스 필드 (static이 안붙었으니까)
	int speed; 
	static int test;
	
	// 인스턴스 메소드
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	void run2() {
		System.out.println(speed + "으로 달립니다.");
	}
	
//	static {
//		this.speed =150; 	//X
//		this.run(); 		//X
//	}
	
	static void simulate() { 
//		this.speed = 200;
//		this.run();
		
		Car2 myCar = new Car2();
		
		myCar.speed = 200;
		myCar.run();
	}

	
	public static void main(String[] args) {
		simulate();
		Car2 myCar = new Car2();
		
		myCar.speed = 60;
		myCar.run();
	}

}
