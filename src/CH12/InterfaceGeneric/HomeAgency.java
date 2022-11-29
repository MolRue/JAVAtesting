package CH12.InterfaceGeneric;

public class HomeAgency implements Rentable<Home> {
	// 오버라이드 후 이용할때는 타입을 지정해 주면 된다!
	@Override
	public Home rent() {

		return new Home();	//Home 객체를 리턴.
	}

}
