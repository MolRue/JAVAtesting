package CH08.Interface;

public class TeleVision implements RemoteControl {
	
	//필드
	@SuppressWarnings("unused")
	private int volume;
	
	// 인터페이스에 정의된 '추상메소드'는 오버라이드를 통해서 반드시 구현해 줘야 한다. 
	@Override
	public void turnOn() {
		System.out.println("TV를 켰다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 껏다.");
		
	}

	
	// default 메소드는 오버라이드시 반드시 public 접근 제한자를 붙여야 한다.
	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
			System.out.println("volume");
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨: " + volume);
	}
	
}
