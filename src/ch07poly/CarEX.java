package ch07poly;

public class CarEX {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		//↓ Tire 객체를 넣어준다?
		myCar.tire = new Tire();
		myCar.run();
		
		myCar.tire = new HankookTire();
		myCar.run();

		myCar.tire = new KumhoTire();
		myCar.run();


	}

}
