package CH08.Interface;

public class Audio implements RemoteControl{
	
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다?");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");
	}

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
		System.out.println("현재 Audio 볼륨: " + volume);

	}

	private int memoryVolme; // volume 값을 기억하는 필드.
	
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			this.memoryVolme = this.volume;
			System.out.println("음소거 처리합니다.");
			setVolume(RemoteControl.MIN_VOLUME);
		} else {
			System.out.println("음소거 해제.");
			setVolume(this.memoryVolme);
		}
	}

	
}
