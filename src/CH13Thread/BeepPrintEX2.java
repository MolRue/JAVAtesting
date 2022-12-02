package CH13Thread;

import java.awt.Toolkit;

public class BeepPrintEX2 {
//** Runable() 을 통한 구현 **//
	public static void main(String[] args) {
		// Runable : 스레드 실행을 위한 인터페이스
		Thread thread = new Thread(new Runnable(){
			
			// Run() : 실제 스레드가 실행되는 코드
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i = 0; i < 5; i++) {
					toolkit.beep(); // beep음을 내는 메소드. (오류효과음?)
					try {
						Thread.sleep(500); // 500 = 0.5초. 밀리초 단위. 0.5초간 일시정지
					} catch(Exception e) {}
				}}});
		
		thread.start(); // 구현된 스레드를 실행시켜주는 코드
		
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
		}
			try {
				Thread.sleep(500); // 500 = 0.5초. 밀리초 단위. 0.5초간 일시정지
			} catch(Exception e) {}			
	}

}
