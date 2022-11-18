package ch07poly;

public class DriverEX {

	public static void main(String[] args) {
		Driver driver =new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(taxi);
// 6줄에 선언된 diver(Driver.java의 메소드)객체 의 drive 함수?
	}

}
