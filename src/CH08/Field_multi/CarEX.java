package CH08.Field_multi;

public class CarEX {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run(); // 한국타이어가 2번찍한다?
		
		//타이어 객체 교체
		myCar.tire1 = new KumhoTire();
		myCar.tire2 = new KumhoTire();
		myCar.run(); // 교체를 해줬다??
	}

}
