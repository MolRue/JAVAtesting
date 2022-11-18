package ch07;

public class SupersonicAirplane extends Airplane{
	//상수
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	//필드 선언
	public int flyMode = NORMAL;

	@Override
	public void fly() {
		
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속 비행");
		} else { //else는 NORMAL 일때
			//super.메소드명(); : 부모 클래스의 메소드를 실행.
			super.fly();			
		}
	}
	
	
}
