package CH09NonameNA;

public class CarEX {

	public static void main(String[] args) {
		// Car 객체 생성
		Car car = new Car();
		
		car.run1();
		car.run2();
		// 매개변수로 받는다.클래스가 없는 객체 라서 오버라이드를 통해 준다. 특이하지?
		car.run3(new Tire() {
			@Override
			public void roll() {
				System.out.println("넥센타이어가 굴러갑니다.");
			}
			
		});

	}

}
