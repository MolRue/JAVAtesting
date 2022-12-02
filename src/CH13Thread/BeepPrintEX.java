package CH13Thread;

import java.awt.Toolkit;

public class BeepPrintEX {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			toolkit.beep(); // beep음을 내는 메소드. (오류효과음?)
			try {
				Thread.sleep(500); // 500 = 0.5초. 밀리초 단위. 0.5초간 일시정지
			} catch(Exception e) {
				
			}
		}
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
		}
			toolkit.beep(); // beep음을 내는 메소드. (오류효과음?)
			try {
				Thread.sleep(500); // 500 = 0.5초. 밀리초 단위. 0.5초간 일시정지
			} catch(Exception e) {	
			}			
			
		/**
		 실행해 보면 효과음이 먼저 난 후에, 텍스트가 출력된다
		  = 동시에 처리되지 못한다. = 스레드가 하나만 사용되고있다.
		 **/
	}

}
