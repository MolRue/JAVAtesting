package CH12.InterfaceGeneric;

public class GenericEX {

	public static void main(String[] args) {
		HomeAgency homeAgency = new HomeAgency();
		Home home = homeAgency.rent();
		// homeAgency 에서 리턴된 값을 받아줄 객체가 필요! 그래서 Home home 기입
		home.turnOnLight();
		
		CarAgency carAgency = new CarAgency();
		Car car = carAgency.rent();
		car.run();
		
	}

}
