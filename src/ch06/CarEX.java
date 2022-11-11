package ch06;

public class CarEX {

	public static void main(String[] args) {
		//1. 객체 생성
		Car myCar = new Car("그렌저", "검정", 250);
		
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.color);
		System.out.println(myCar.maxSpeed);
		System.out.println(myCar.speed);
		
		myCar.speed = 60; // 필드 답 변경
		System.out.println("수정된 값: " + myCar.speed); 
		System.out.println("-------------------");
		Car car2 = new Car("2호기");
		System.out.println(car2.model);
		System.out.println(car2.color);
		
		System.out.println("-------------------");
		
		Car car3 = new Car("3호기", "빨간색");
		System.out.println(car3.model);
		System.out.println(car3.color);
		System.out.println("-------------------");
		
		Car car4 = new Car("4호기");
		System.out.println(car4.model);
		System.out.println(car4.color);
		System.out.println(car4.maxSpeed);
		System.out.println("-------------------");
	}

}
