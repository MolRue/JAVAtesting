package CH13Thread;

import java.awt.Toolkit;

public class BeepPrintEX4 extends Thread {
//** 상속을 통한 스레드 구현**//

	// run() : 실제 스레드가 실행되는 코드
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			toolkit.beep(); // beep음을 내는 메소드. (오류효과음?)
			try {
				Thread.sleep(500); // 500 = 0.5초. 밀리초 단위. 0.5초간 일시정지
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		Thread thread = new BeepPrintEX4();
		thread.start();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
		}
		try {
			Thread.sleep(500); // 500 = 0.5초. 밀리초 단위. 0.5초간 일시정지
		} catch(Exception e) {}			
	}
}
