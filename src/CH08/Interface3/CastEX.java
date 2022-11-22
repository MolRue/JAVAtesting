package CH08.Interface3;

public class CastEX {

	public static void main(String[] args) {
//		Vehicle vehicle = new Bus(); 	// 자동 타입변환 ::: 자동타입변환 시, 오버라이드 된 것만 사용 가능하다.
//		vehicle.run();
//	 // vehicle.chechFare();
		
	//객체를 두개 생성하고 
	Taxi taxi = new Taxi();
	Bus bus = new Bus();	

	ride(taxi); // 택시 객체는 여기에, 
	ride(bus);
	
	}
	
								// vehilce = new Taxi() 와 같은뜻.
	public static void ride(Vehicle vehicle) {
		// ↓ vehicle 이 Bus 객체를 가지고 있는가? 라고 물어보는것.
		if (vehicle instanceof Bus) { // Bus 객체가 맞으므로 ture 판정. 형변환 발생.
			Bus bus = (Bus) vehicle;
//			bus.run();
			bus.checkFare();
			//그래서! 버스 클래스에만 checkFare 가 추가된다.
		}
	}

}
