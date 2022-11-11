package ch06;

public class Car {
	// 1. 필드 선언 (필드 : 객체의 데이터를 저장)
	String company;
	String model;
	String color;
	int maxSpeed;
	int speed;
	// boolean start; 	//시동여부

	// overloading : 생성자를 여러개 둘수가 있다.
	
	Car(String model) {
//		this.model = model;
		this(model, "은색", 250);
	}
	Car(String model, String color) {
//		this.model = model;
//		this.color = color;
		this(model, color, 250);
	}

	// 자바에서는 생성자를 명시하지 않으면, 컴파일 과정에서 생성자를 명시해준다.
	Car(String model, String color, int maxSpeed) {
		this.model = model; 				// this : 이 해당 객체 자체를 의미한다.
		this.color = color;					// 위에 생성된 객체에서 받아온 값이 할당이 된다.??
		this.maxSpeed = maxSpeed;
		
	}
	
	
			
}
