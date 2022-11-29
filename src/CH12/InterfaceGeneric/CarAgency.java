package CH12.InterfaceGeneric;

public class CarAgency implements Rentable<Car> {
// 오버라이드 후 이용할때는 타입을 지정해 주면 된다!
	@Override
	public Car rent() {

		return new Car();	//Car 객체를 리턴.
	}

}
