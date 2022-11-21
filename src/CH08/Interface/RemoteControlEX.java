package CH08.Interface;

public class RemoteControlEX {

	public static void main(String[] args) {
//		RemoteControl rc =new TeleVision();
//		rc.turnOn();
//		
//		RemoteControl rc2 = new Audio();
//		rc2.turnOn();
		
//		RemoteControl rc;
//		rc = new TeleVision();
//		rc.turnOn();
//		rc.setVolume(3);
//		rc.turnOff();
//		
//		rc = new Audio();
//		rc.turnOn();
//		rc.setVolume(5);
//		rc.turnOff();
//		
//		// static의 특성을 가졌기 때문에, 객체를 생성하지 않고 호출 가능하다.
//		System.out.println(RemoteControl.MAX_VOLUME);
//		System.out.println(RemoteControl.MIN_VOLUME);
		
		
		RemoteControl rc;
		
		rc = new TeleVision();
		rc.turnOn();
		rc.setVolume(5);
		
		rc.setMute(true);
		rc.setMute(false);
		
		System.out.println("============================");
		
		rc = new Audio();	// Audio로 객체를 교체
		rc.turnOn();		
		rc.setVolume(4);	
		
		rc.setMute(true);	//음소거 처리 + memoryVolume 영역에 저장.
		rc.setMute(false);
		
		System.out.println("============================");
		
		RemoteControl.changeBattery();
		
	}

}
