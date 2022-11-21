package CH08.Interface;

public interface RemoteControl {
	// 인터페이스는 추상메소드와 상수만 올수 있다.

	// 인터페이스에 선언된 필드는 모두 상수로 취급된다.(public static final 특성을 갖는다.) 
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// public 추상메소드
	public void turnOn();
	
	//	void turnOn();
	//public을 생략해도, 컴파일 과정에서 public abstract를 자동으로 붙인 것으로 인식한다. = 추상메소드 이기 때문에.
	
	void turnOff();
	void setVolume(int volume);
	
	// 디폴트 메소드 : 인터페이스에서 실행메소드를 구현하고 싶을때 사용.
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("음소거 처리 합니다.");
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("음소거 해제.");
		}
		
	}
	// 정적(static) 메소드
	// 구현코드를 쓸 수 있다. (원래 인터페이스 에서는 안된다!)
	static void changeBattery() { // public 이 없어도, 컴파일 과정에서 public을 붙여서 출력한다.
		System.out.println("건전지 교체");
	}
	
}
